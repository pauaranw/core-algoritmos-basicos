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
        if (numero % 1 ==0 && numero % numero == 0){
            return true;
        }else{
            return false;
        }
    }
        

    public static String stringEnReversa(String palabra){
        String palabraInvertida = "";
        for (int i = palabra.length()-1; i>=0 ; i-- ){
            palabraInvertida += palabra.charAt(i);
        }
        return palabraInvertida;
    }

    public static String  esPalindromo (){
        
    }
}
