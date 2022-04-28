package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    private int cantDiasParaVencerse;
    public static int DESCUENTO = 5;

    publpackage com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    private int cantDiasParaVencerse;
    public static int DESCUENTO;

    public ProductoAlimenticio(String nombre, String origen, int codigo, int costo, int cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
        DESCUENTO = 5;
    }

    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public void setCantDiasParaVencerse(int cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public static int getDESCUENTO() {
        return DESCUENTO;
    }

    public static void setDESCUENTO(int DESCUENTO) {
        ProductoAlimenticio.DESCUENTO = DESCUENTO;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioFinal = 0.f;

        precioFinal = this.getCosto() + this.calcularGananciaObtenida() - DESCUENTO;

        return precioFinal;
    }

    @Override
    public float calcularGananciaObtenida() {
        float ganancia = 0.f;
        if(this.cantDiasParaVencerse <= 90){
            ganancia = (this.getCosto() * 10)/100;
        }
        else{
            ganancia = (this.getCosto() * 25)/100;
        }
        return 0;
    }

    @Override
    public String tipoDeProducto() {

        return "Producto alimenticio";
    }
}
