package rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void ajustarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }
}
