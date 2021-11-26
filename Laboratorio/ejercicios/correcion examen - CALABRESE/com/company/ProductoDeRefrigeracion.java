package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, int costo, int cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public float getLitrosDeCapacidad() {
        return this.litrosDeCapacidad;
    }

    public void setProductoDeRefrigeracion(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
   package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, int costo, int cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public float getLitrosDeCapacidad() {
        return this.litrosDeCapacidad;
    }

    public void setProductoDeRefrigeracion(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    @Override
    public String tipoDeProducto() {
        return "Producto De Refrigeracion";
    }
}
