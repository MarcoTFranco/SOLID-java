package rh.service.reajuste;

import rh.model.Funcionario;

import java.math.BigDecimal;

/**
 * Dependency Inversion Principle implementado
 */
public interface ValidacaoReajuste {

    public void valida(Funcionario funcionario, BigDecimal aumento);

}
