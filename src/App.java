import java.util.Scanner;

import entidades.CalculadorGeometrica;
import entidades.Quadrado;
import entidades.Trapezio;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        
        Trapezio jorge = new Trapezio(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Trapézio criado! Sua base menor vale: "+jorge.baseMenor+
                " sua base maior vale: "+jorge.baseMaior+" sua altura vale: "+jorge.altura);

        System.out.println("Área: "+CalculadorGeometrica.calcularArea(jorge));
        
    }
}

