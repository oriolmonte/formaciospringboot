package com.example.curs;
import java.util.Arrays;
import java.util.List;

import com.example.curs.curspackage.Cotxe;

public class Main {
    public static void main(String[] args) {
        Streams();
    }
    //Do while
    static void Loops()
    {
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while (i>0);
    }
    //Ternaries ? :
    static void Ternaries(int n)
    {
        int r = n%2==0?10:20;
        System.out.println(r);
    }
    //Matrius i foreach
    static void Matrius()
    {
        int nums[][] = new int[3][3];
        //.length pilla el tamany de la 1a dimensio
        //per la resta de dimensions pilla [0]fila
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j]=j;       
            }
        }
        //enhanced for loop foreach, vaya
        for (int[] numarr : nums) {
            for ( int m: numarr)
            {
                System.err.print( m + " ");
            }
            System.err.println();
        }
    }    
    static void BlocEstatic()
    {
        //Carrega un cop i executa bloc estatic
        //Instancia dos objectes
        Cotxe c = new Cotxe(123,"mercedes");
        Cotxe d = new Cotxe(123,"audi");
        //Crea un cotxe anonim
        new Cotxe();
    }        
    static void Streams()
    {
        List<Integer> llista = Arrays.asList(2,2,2,2,3,3,3);
        
        int result = llista.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0,(c,e) -> c+e)
         ;
        
        System.out.println(result);
        
        // // llista.forEach(n -> System.out.println(n));
        // Stream<Integer> stream = llista.stream();
        // //stream es tanca, ja no es accessible! no es una manera de guardar dades!
        // Stream<Integer> stream2 = stream.filter(n -> n%2==0);
        // stream2.forEach(n -> System.out.println(n));
        // //stream3.forEach(n -> System.out.println(n));        
    }
}
