package rh.service.promocao;

import rh.model.Funcionario;

public interface ValidacaoPromocao {
    void valida(Funcionario funcionario, boolean meta);

}
