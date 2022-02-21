package Ej1;

import java.lang.reflect.Array;

public class ArrayEj1 {
    public static void llenarArray(int[] arrayAleatorio ){
        for (int i=0; i<arrayAleatorio.length; i++) {
            arrayAleatorio[i]=(int) Math.round(Math.random()*19+1);
        }
    }

    public static int[] generarArrayDePares(int [] array1){
        int numPares=0;
        for (int x:array1) {
            if(x % 2==0){
                numPares++;
            }
        }

        int arrayDePares[]= new int [numPares];
        int a=0;
        for (int i=0; i<array1.length; i++) {
            if(array1[i] % 2==0){
               arrayDePares[a]=array1[i];
               a++;
            }
        }
        return arrayDePares;

    }
    public static void enseñarArray(int [] array){
        for(int x:array){
            System.out.println(x);
        }
    }
    public static void generarArraySinRepetidos(int [] array){
        int numAleatorio;
        for (int i=0; i<array.length; i++) {
            numAleatorio=(int) Math.round(Math.random()*200+100);
            if(encontrarRepetido(array, numAleatorio)==true){
                array[i]=numAleatorio;
            }else{
                i--;
            }
            numAleatorio=(int) Math.round(Math.random()*200+100);
        }
    }

    public static boolean encontrarRepetido(int [] array, int numAleatorio){
        boolean repetido=false;
        for(int i=0; i<array.length; i++){
            if(array[i]==numAleatorio){
                    repetido=true;
            }
        }
        return repetido;
    }
}

