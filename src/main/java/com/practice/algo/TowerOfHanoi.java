package com.practice.algo;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        String fromPeg = "A";
        String toPeg="C";
        String auxPeg="B";

        printTowerOfHanoi(numberOfDisks,fromPeg,toPeg,auxPeg);
    }

    private static void printTowerOfHanoi(int numberOfDisks, String fromPeg, String toPeg, String auxPeg) {
        if(numberOfDisks ==1){
            System.out.printf("Move the disk 1 from peg %s to peg %s \n", fromPeg, toPeg);
            return;
        }

        printTowerOfHanoi(numberOfDisks-1, fromPeg,auxPeg,toPeg);
        System.out.printf("Move the disk %d from peg %s to peg %s\n",numberOfDisks, fromPeg, toPeg);
        printTowerOfHanoi(numberOfDisks-1, auxPeg,toPeg,fromPeg);
    }
}
