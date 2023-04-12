package rh.service.reajuste;

import rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    List<ValidacaoReajuste> validacaoReajustes;

    public ReajusteService(List<ValidacaoReajuste> validacaoReajustes) {
        this.validacaoReajustes = validacaoReajustes;
    }

    public void reajuste(Funcionario funcionario, BigDecimal aumento) {
        validacaoReajustes.forEach(v -> v.valida(funcionario, aumento));

        var salarioNovo = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.ajustarSalario(salarioNovo);
    }

}
