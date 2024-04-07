
package operadores;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class OperadorTernario {

    public static void main(String[] args) {
        // Se utiliza para expresiones sencillas, para expresiones mas complicadas utilizar IF ELSE
        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("Resultado: " + resultado);
        
        //Otro ejemplo de operador ternario
        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("Resultado: " + resultado);
    }

}
