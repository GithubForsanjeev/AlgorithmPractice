package com.practice.algo;

public class Generate_K_aryStrings {
    public static void main(String[] args) {
       int n= 3;
       int[]A = new int[n];
       int k = 2;
        generateK_naryStringsofLength(A,n, k);
    }

    private static void generateK_naryStringsofLength(int[] a, int n, int k) {
        if(n<1){
            printString(a);
        }else{
            for(int i=0; i<k; i++){
                a[n-1]= i;
                generateK_naryStringsofLength(a, n-1,k);
            }
        }

    }


    private static void printString(int[] a) {
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println( );
    }
}
