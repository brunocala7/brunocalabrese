package com.company;

import java.util.HashSet;

public class Programa {
    private String nombre;
    private HashSet<Usuario> conductores;
    private Usuario operadorTecnico;
    private Categoria categoria;
    private CategoriaMusica categoriaMusica;
    private Horario horario;

    public Programa(String nombre, Usuario operadorTecnico, Categoria categoria, Horario horario) {
        this.nombre = nombre;
        this.conductores = new HashSet<>();
        this.operadorTecnico = operadorTecnico;
        this.categoria = categoria;
        this.horario = horario;
    }

    public Programa(String nombre, HashSet<Usuario> conductores, Usuario operadorTecnico, CategoriaMusica categoriaMusica, Horario horario) {
        this.nombre = nombre;
        this.conductores = conductores;
        this.operadorTecnico = operadorTecnico;
        this.categoriaMusica = categoriaMusica;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Usuario> getConductores() {
        return conductores;
    }

    public void setConductores(HashSet<Usuario> conductores) {
        this.conductores = conductores;
    }

    public Usuario getOperadorTecnico() {
        return operadorTecnico;
    }

    public void setOperadorTecnico(Usuario operadorTecnico) {
        this.operadorTecnico = operadorTecnico;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public CategoriaMusica getCategoriaMusica() {
        return categoriaMusica;
    }

    public void setCategoriaMusica(CategoriaMusica categoriaMusica) {
        this.categoriaMusica = categoriaMusica;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}