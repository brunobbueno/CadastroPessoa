package com.br.cadastropessoa.model;

import javax.persistence.*;

@Entity
@Table(name = "Pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPessoa")
    private int idPessoa;
    @Column(name = "nome")
    private String nome;

    @Column(name = "identificador")
    private String identificador;
    @Column(name = "tipoIdentificador")
    private String tipoIdentificador;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }
}
