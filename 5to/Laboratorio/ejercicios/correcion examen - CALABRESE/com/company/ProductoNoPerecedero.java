package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio {
    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, int costo, int cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public float getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    @Override
    public String tipoDeProducto() {

        return "Producto No Perecedero";
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio {
    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, int costo, int cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public float getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    @Override
    public String tipoDeProducto() {

        return "Producto No Perecedero";
    }
}
