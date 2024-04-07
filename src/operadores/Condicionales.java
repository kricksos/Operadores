
package operadores;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Condicionales {

    public static void main(String[] args) {
        // Condicionales AND y OR (&& y ||)
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a<= 10; //true y true es igual a true
        if (resultado)
            System.out.println("Dentro de rango");
        else
            System.out.println("Fuera de rango");
        
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso)
            System.out.println("El padre puede asistir al juego de su hijo");
        else
            System.out.println("El padre esta ocupado");
                    
    }

}
