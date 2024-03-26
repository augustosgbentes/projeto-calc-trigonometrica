package entidades;

import java.util.Scanner;

//Fatorial Beecrowd

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double angulo = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.printf("%.10f\n",seno(grausParaRadianos(angulo), n));


    }

    public static double grausParaRadianos(double angulo){
        return (angulo*3.141592)/180;
    }

    public static int fatorial(int n){
        int fatorial = 1;
        for(int i = n; i > 1; i--){
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static double seno(double x, int n){
        double seno = 0;
        int j = 3;
        double termo = x;
        for(int i = 0; i < n; i++){
            seno = seno + termo;
            termo = termo *((x*x)/(j*(j-1)))*-1;
            j = j +2;
        }
        //0.0871557247
        return seno;
    }





}
