// Capítulo 3: Estructura secuencial - Ejercicio 21.

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        int a, b, c, perimetro;
        double semiPerimetro, area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor de la base: ");
        a = entrada.nextInt();
        System.out.println("Ingresa el valor del cateto opuesto: ");
        b = entrada.nextInt();
        System.out.println("Ingresa el valor del cateto adyacente: ");
        c = entrada.nextInt();

        perimetro = a + b + c;
        semiPerimetro = perimetro / 2f;
        area = (a * perimetro) / 2f;

        System.out.println("El perimetro del triangulo es: " + perimetro + " Centimetros");
        System.out.println("El semiperimetro del triangulo es: " + semiPerimetro + " Centimetros");
        System.out.println("El area del triangulo es: " + area + " Metros cuadrados");
    }
}
