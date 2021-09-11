package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] Ma = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};
        OpeRL noc = new OpeRL(Ma);
        int p = 0;
        for (int i = 0; i <args.length ; i++) {
            p  = Integer.parseInt(args[i]);
        }
        noc.Prediccion(p);
    }
}
