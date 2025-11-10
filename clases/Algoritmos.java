package clases;

public class Algoritmos {
    public static boolean esPar(int numero){
        if (numero % 2 == 0){
            return true;
        } else{
            return false;
        } 
    }

    public static boolean esPrimo( int numero){
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        // Iteramos desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true;
    }
        

    public static String stringEnReversa(String palabra){
        String palabraInvertida = "";
        for (int i = palabra.length()-1; i>=0 ; i-- ){
            palabraInvertida += palabra.charAt(i);
        }
        return palabraInvertida;
    }

    public static boolean  esPalindromo (String palabra){
        String palabraInvertida = "";
        for (int i = palabra.length()-1; i>=0 ; i-- ){
            palabraInvertida += palabra.charAt(i);
        }

        return palabraInvertida.equals(palabra);

    }

    public static void secuenciaFizzBuzz (int numero){
        for (int i = 1; i <= numero; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(" FizzBuzz ");
            }else if(i % 3 == 0) {
                System.out.print(" Fizz ");
            }else if(i % 5 == 0) {
                System.out.print(" Buzz ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
