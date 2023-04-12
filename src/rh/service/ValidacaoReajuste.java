package rh.service;

import rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    public void valida(Funcionario funcionario, BigDecimal aumento);

}
