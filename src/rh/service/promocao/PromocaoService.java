package rh.service.promocao;

import rh.model.Funcionario;

import java.util.List;

public class PromocaoService {

    private List<ValidacaoPromocao> validacaoPromocaos;

    public PromocaoService(List<ValidacaoPromocao> validacaoPromocaos) {
        this.validacaoPromocaos = validacaoPromocaos;
    }

    public void promover(Funcionario funcionario, boolean meta) {
        validacaoPromocaos.forEach(v -> v.valida(funcionario, meta));

        var cargo = funcionario.getDadosPessoais().getCargo();
        funcionario.promover(cargo.promover());
    }

}
