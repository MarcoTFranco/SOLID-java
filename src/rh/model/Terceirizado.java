package rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }
}
