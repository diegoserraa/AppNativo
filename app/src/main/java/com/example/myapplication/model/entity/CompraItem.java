package com.example.myapplication.model.entity;

public class CompraItem {
    private Integer codigo;
    private String titulo;
    private String descricao;


    public CompraItem(Integer codigo, String titulo, String descricao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

