package com.company;

public abstract class ProductoDeSuper implements Producto{
    private String nombre;
    private String origen;
    private int codigo;
    private int costo;

    public ProductoDeSuper(String nombre, String origen, int codigo, int costo) {
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigo() {
     package com.company;

public abstract class ProductoDeSuper implements Producto{
    private String nombre;
    private String origen;
    private int codigo;
    private int costo;

    public ProductoDeSuper(String nombre, String origen, int codigo, int costo) {
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
