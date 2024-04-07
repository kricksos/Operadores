
package operadores;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PrecedenciaOperadores {

    public static void main(String[] args) {
        // Orden de evaluación de los operadores(prioridad)
        var x = 5;
        var y = 10;
        var z = ++x + y--; //X incrementa su valor antes PREINCREMENTO, Y decrementa su valor en su siguiente ejecución POSTDECREMENTO
        System.out.println("Valor de Z: " + z);
        
        var resultado = 4 + 5 * 6 / 3; //Primero se evalua la * de (5 * 6)/3 y el resultado de dsivide entre 3
        System.out.println("Resultado: " + resultado);
    }

}
