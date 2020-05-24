package com.practice.algo;

public class CheckSortedArrayRecursive {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9};
        int[] B = {9,8,7,6,5,4,3,2,1};

        System.out.println(isArraySortedAscOrder(A,A.length)); //true
        System.out.println(isArraySortedAscOrder(B,B.length)); //false

        System.out.println(isArraySortedDescOrder(A,A.length)); //false
        System.out.println(isArraySortedDescOrder(B,B.length)); //true

    }

    private static boolean isArraySortedAscOrder(int[] A, int n) {
        if(n == 1)
            return true;
        return (A[n-1]<=A[n-2])?false:isArraySortedAscOrder(A,n-1);
    }

    private static boolean isArraySortedDescOrder(int[] A, int n) {
        if(n == 1)
            return true;
        return (A[n-1]>=A[n-2])?false:isArraySortedDescOrder(A,n-1);
    }
}
