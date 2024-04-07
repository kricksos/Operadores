
package operadores;

import java.util.Scanner;


public class EjercicioRectangulo {

    public static void main(String[] args) {
        // Calcular el área de un rectángulo
        int alto = 0;
        int ancho = 0;
        Scanner consola = new Scanner (System.in);
        
        System.out.println("Proporciona el alto: ");
        var entrada = consola.nextLine();
        alto = Integer.parseInt(entrada);
        
        System.out.println("Proporciona el ancho");
        entrada = consola.nextLine();
        ancho = Integer.parseInt(entrada);
        
        var area = alto * ancho;
        System.out.println("Area: " + area);
        
        var perimetro = (alto + ancho)*2;
        System.out.println("Perimetro: " + perimetro);
    }

}
