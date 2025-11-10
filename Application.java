import clases.Algoritmos;

public class Application {
    public static void main(String[] args) {
        
        //Variables
        int numero = 15;
        String palabra = "paulina";
        String palabra2 = "rapar";
        
        //Si el numero es par
        if (Algoritmos.esPar(numero)){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero "+ numero + " es impar");
        }

        //si el numero es primo
        if (Algoritmos.esPrimo(numero) ){
            System.out.println("El numero " +numero+ " es primo");
        }else{
            System.out.println("El numero " + numero + " no es primo");
        }

        //Palabra invertida

        System.out.println( "La palabra al reves es:" + Algoritmos.stringEnReversa(palabra) );


        //Es Palindromo
        if (Algoritmos.esPalindromo(palabra2)){
            System.out.println("La palabra " + palabra2 + " Es palindromo");
        }else{
            System.out.println("La palabra " + palabra2 + " No es palindromo");
        }

        Algoritmos.secuenciaFizzBuzz(numero);
    }
}
