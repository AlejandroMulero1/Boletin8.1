package Ej1;
import static Ej1.ArrayEj1.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        int tamaño;
        System.out.println("Introduzca el tamaño del array");
        tamaño=sc.nextInt();
        int arrayAleatorio[]= new int [tamaño];
        llenarArray(arrayAleatorio);
        enseñarArray(arrayAleatorio);
        System.out.println();
        System.out.println();
        System.out.println();
        generarArrayDePares(arrayAleatorio);
        enseñarArray(generarArrayDePares(arrayAleatorio));

         */
        int array[]= new int [20];
        generarArraySinRepetidos(array);
        enseñarArray(array);
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
