package Correcao.example.Correcao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCompleto;
    private String profissao;
    private Double receita;
    private Double receitaTotal;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente(){

    }

    public Cliente(String nomeCompleto, String profissao, Double receita, Double receitaTotal, List<Endereco> enderecos) {
        this.nomeCompleto = nomeCompleto;
        this.profissao = profissao;
        this.receita = receita;
        this.receitaTotal = receitaTotal;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Double getReceita() {
        return receita;
    }

    public void setReceita(Double receita) {
        this.receita = receita;
    }

    public Double getReceitaTotal() {
        return receitaTotal;
    }

    public void setReceitaTotal(Double receitaTotal) {
        this.receitaTotal = receitaTotal;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
