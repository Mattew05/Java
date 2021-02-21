package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        //System.out.println(n);
        int[][] matrix=new int[n][n];
        /*int x= (int) new Random().nextInt(5);
        System.out.println(x);*/
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                matrix[i][j]= ((int) new Random().nextInt(5))%2;
                matrix[j][i]=matrix[i][j];
            }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(matrix[i][j]);
            System.out.print("\n");
        }
    }
}
