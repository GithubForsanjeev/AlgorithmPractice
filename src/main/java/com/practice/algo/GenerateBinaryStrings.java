package com.practice.algo;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        int[]A = new int[n];
        generateBinaryStringsofLength(A,n);
    }

    private static void generateBinaryStringsofLength(int[] A, int n) {
        if(n<1){
            printString(A);
        }else{
            A[n-1] = 0;
            generateBinaryStringsofLength(A,n-1);
            A[n-1] = 1;
            generateBinaryStringsofLength(A,n-1);
        }
    }

    private static void printString(int[] a) {
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
