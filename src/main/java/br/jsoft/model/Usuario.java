package br.jsoft.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "usuario")
public class Usuario {


    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

    public Usuario(){}

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;

    @Size(max = 100)
    @NotNull
    private String nome;

    @Size(max = 60)
    @NotNull
    private String username;

    @Size(max = 50)
    @NotNull
    private String senha;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", senha='" + senha + '\'' +
                ", projeto=" +projeto.getNome() +
                projeto.getDescricao() + projeto.getDataInicio() +
                projeto.getDataFinal() + projeto.getOrcamento() +
                '}';
    }
}
