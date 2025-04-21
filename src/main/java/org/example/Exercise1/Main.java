package org.example.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //**
        // Si nosotros listamos todos los numeros naturales debajo de 10 que son multiplos de 3 o 5, obtenemos 3, 5, 6 y 9.
        // la suma de estos numeros es 23.
        //busca el resultado de la suma de todos los numeros naturales por debajo de 1000 que son multiplos de 3 o 5.
        //**/


        //Ejemplo de uso
        Main main = new Main();
        int n = 1000;
        List<Integer> multiples = main.multiplesOf3And5(n);
        int sum = main.sumOfMultiples(multiples);
        System.out.println("La suma de los multiplos de 3 y 5 por debajo de " + n + " es: " + sum);
        //La suma de los multiplos de 3 y 5 por debajo de 1000 es: 233168


    }//end of main

    //Metodo que devuelve una lista de los multiplos de 3 y 5 por debajo de n
    public List<Integer> multiplesOf3And5(int n){
        List<Integer> multiples = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }
    //Metodo que devuelve la suma de los multiplos de 3 y 5
    public int sumOfMultiples(List<Integer> multiples) {
        int sum = 0;
        for (int multiple : multiples) {
            sum += multiple;
        }
        return sum;
    }



}//end of class



