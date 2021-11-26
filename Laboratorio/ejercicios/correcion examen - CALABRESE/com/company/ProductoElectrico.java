package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper{
    private int cantDiasDeGarantia;
    public static float RECARGO_POR_ENVIO;

    public ProductoElectrico(String nombre, String origen, int codigo, int costo, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static float getRecargoPorEnvio() {
        return RECARGO_POR_ENVIO;
    }

    public static void setRecargoPorEnvio(float recargoPorEnvio) {
        RECARGO_POR_ENVIO = recargoPorEnvio;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioFinal = 0.f;

        precioFinal = this.getCosto() + this.getCantDiapackage com.company;

public abstract class ProductoElectrico extends ProductoDeSuper{
    private int cantDiasDeGarantia;
    public static float RECARGO_POR_ENVIO;

    public ProductoElectrico(String nombre, String origen, int codigo, int costo, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static float getRecargoPorEnvio() {
        return RECARGO_POR_ENVIO;
    }

    public static void setRecargoPorEnvio(float recargoPorEnvio) {
        RECARGO_POR_ENVIO = recargoPorEnvio;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioFinal = 0.f;

        precioFinal = this.getCosto() + this.getCantDiasDeGarantia() + RECARGO_POR_ENVIO;

        return precioFinal;
    }

    @Override
    public float calcularGananciaObtenida() {
        float ganancia = 0.f;

        if(cantDiasDeGarantia == 365){
            ganancia = (this.getCosto() * 45)/100;
        }
        else if(cantDiasDeGarantia <= 60){
            ganancia = (this.getCosto() * 15)/100;
        }

        return ganancia;
    }

    @Override
    public String tipoDeProducto() {
        return "Producto eléctrico";
    }
}
