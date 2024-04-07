package operadores;

public class Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("Suma: " + resultado);
        
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        
        resultado = a * b;
        System.out.println("Multiplica: " + resultado);
        
        resultado = a / b;
        System.out.println("Division: " + resultado);
        
        var resultado2 = 2.3 / b;
        System.out.println("Division flotante: " + resultado2);
        
        resultado = a % b;
        System.out.println("Modulo: " + resultado);
        
        //Incremento de variable
        //Preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println("Valor de f: " + f);
        //Postincremento (simbolo después de la varibale)
        var g = 5;
        var h = g++;
        System.out.println("Valor de g: " + g); //Pendiente un incremento
        System.out.println("Valor de h: " + h); //Tiene el valor de g antes del incremento
        
        //Decremento de variable
        //Predecremento (simbolo antes de la varbiale)
        
        //Postdecremento (simbolo después de la variable)
    }
    
}
