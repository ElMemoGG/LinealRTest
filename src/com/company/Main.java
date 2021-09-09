package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] Ma = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};
        OpeRL noc = new OpeRL(Ma);

        int p  = Integer.parseInt(args[0]);

        double b0 = noc.Beta0();
        double b1 = noc.Beta1();

        System.out.println("b0: "+b0 +" b1: "+ p +" = " + (b0 + b1* p));
        System.out.println("holsa");
        System.out.println("holsa");
        System.out.println("holsa");
        System.out.println("holsa");
        System.out.println("holsa");

    }
}
