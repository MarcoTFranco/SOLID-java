package rh.service;

import rh.ValidacaoException;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {

    public void reajuste(Funcionario funcionario, BigDecimal aumento) {
        var salario = funcionario.getSalario();

        BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }

        var salarioNovo = salario.add(aumento);
        funcionario.ajustarSalario(salarioNovo);
    }

}
