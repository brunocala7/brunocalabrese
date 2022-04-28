import static java.lang.Math.PI;

public class Area {
    
    public static float areaCirculo(float radio){
        float resultado = 0.f;

        resultado = (float) (PI * radio * radio);

        return resultado;
    }

    public static float areaEsfera(float radio){
        float resultado = 0.f;

        resultado = 4 * areaCirculo(radio);

        return resultado;
    }

    public static float areaCuadrado(float lado){
        float resultado = 0.f;

        resultado = lado * lado;

        return resultado;
    }

    public static float areaCubo(float lado){
        float resultado = 0.f;

        resultado = 6 * areaCuadrado(lado);

        return resultado;
    }

    public static float areaTriangulo(float base,float altura){
        float resultado = 0.f;

        resultado = (base * altura) / 2;

        return resultado;
    }

}
