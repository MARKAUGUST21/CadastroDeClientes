package dev.java10x.CadastroDeClientes;

import jakarta.persistence.*;


// Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String profissão;
    private String escolaridade;

    public ClienteModel(){

    }

    public ClienteModel(String nome, String cidade, String profissão, String escolaridade) {
        this.nome = nome;
        this.cidade = cidade;
        this.profissão = profissão;
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
