package br.jsoft.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "projeto")
@Table(name = "projeto")
public class Projeto {
    @OneToMany(mappedBy = "projeto")
    private List<Usuario> usuarios;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projeto_id")
    private Long id;

    @Size(max = 40)
    @NotNull
    private String nome;

    @Size(max = 100)
    @NotNull
    private String descricao;

    @Column(name = "data_inicio")
    private String dataInicio;

    @Column(name = "data_final")
    private String dataFinal;

    private double orcamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuario(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Projeto(){
        usuarios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                ", orcamento=" + orcamento +
                '}';
    }
}

