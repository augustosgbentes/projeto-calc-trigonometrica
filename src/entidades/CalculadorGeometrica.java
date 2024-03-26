package entidades;

public class CalculadorGeometrica {
    
    public static double calcularArea(Quadrado quadrado){
        return quadrado.lado*quadrado.lado;
    }

    public static double calcularArea(Retangulo retangulo){
        return retangulo.base*retangulo.altura;
    }
    

    public static double calcularArea(Trapezio trapezio){
        return (trapezio.baseMaior+trapezio.baseMenor)*trapezio.altura/2;
    }
}
