package rh.service.promocao;

import rh.model.Funcionario;

/**
 * Dependency Inversion Principle implementado
 */
public interface ValidacaoPromocao {
    void valida(Funcionario funcionario, boolean meta);

}
