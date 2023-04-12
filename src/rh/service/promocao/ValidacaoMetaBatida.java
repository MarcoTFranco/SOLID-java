package rh.service.promocao;

import rh.ValidacaoException;
import rh.model.Funcionario;

public class ValidacaoMetaBatida implements ValidacaoPromocao{
    @Override
    public void valida(Funcionario funcionario, boolean meta) {
        if (!meta) {
            throw new ValidacaoException("O funcionario não bateu a meta para ser promovido");
        }
    }
}
