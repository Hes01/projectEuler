package org.example.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /**
         * Cada nuevo término en la secuencia de Fibonacci se genera sumando los dos términos anteriores. 
         * Comenzando con 1 y 2, los primeros 10 términos serán:
         * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
         * 
         * Considere los términos en la secuencia de Fibonacci cuyos valores no superan los cuatro millones. 
         * Encuentre la suma de los términos pares.
         * Rpta: 1387447424
         **/
        main m = new main();
        int n = 4000000;

        int  suma= m.fibonacci(n);
        System.out.println("Sum of even Fibonacci numbers: " + suma);
    }// end main

    public Integer fibonacci(int limit){
        int a=1 , b=2,next=0,sum=0;
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(a);
        fibonacciList.add(b);
        while(b<=limit){
            if(b%2==0){//solo buscamos los pares
                sum+=b;
            }
            next=a+b;
            b=next;
        }
        return sum;
    }// end fibonacci
}// end class
