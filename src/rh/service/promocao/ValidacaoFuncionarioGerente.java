package rh.service.promocao;

import rh.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

public class ValidacaoFuncionarioGerente implements ValidacaoPromocao{
    @Override
    public void valida(Funcionario funcionario, boolean meta) {
        var cargo = funcionario.getDadosPessoais().getCargo();
        if (cargo == Cargo.GERENTE) {
            throw new ValidacaoException("Funcionario ja é o cargo mais alto que se pode promover");
        }
    }
}
