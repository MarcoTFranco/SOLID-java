package rh.service;

import rh.ValidacaoException;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoTempoMinimoReajuste implements ValidacaoReajuste{
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        var ultimoReajusteData = funcionario.getDataUltimoReajuste();
        var dataDeAgora = LocalDate.now();

        var meses = ChronoUnit.MONTHS.between(ultimoReajusteData, dataDeAgora);

        if(meses < 6) {
            throw new ValidacaoException("Para reajustar salario , deve ter um prazo minimo de 6 meses");
        }
    }
}
