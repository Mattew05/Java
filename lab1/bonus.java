package com.company;

import java.util.Random;

public class Main {

    public static void helpINeedNamesForFunctions(int size, int[] parent,int currentNode,int numberOfSpaces){
        int alreadyShown=0;
        for(int i=0;i<size;i++){
            if(parent[i]==currentNode)
                if(alreadyShown==0&&i!=currentNode){
                    for(int j=0;j<=numberOfSpaces;j++)
                        System.out.print(" ");
                    System.out.print("+node" + currentNode + "\n");
                    alreadyShown=1;
                }
                else helpINeedNamesForFunctions(size,parent,i,numberOfSpaces+1);
        }
        if(alreadyShown==0){//cazul in care e nod terminal inseamna ca nu s-a afisat deci variabila asta nu si-a schimbat valoarea
            for(int j=0;j<=numberOfSpaces;j++)
                System.out.print(" ");
            System.out.print("-node" + currentNode + "\n");
        }
    }

    public static void main(String[] args) {
	// generare de rooted tree cu un vector de parinti
        int size=((int) new Random().nextInt(20))+5;
        int[] parent=new int[size];
        int variable=0;
        int spaceUsed=0;
        parent[0]=0;
        while(spaceUsed<size){
            int space=(int) new Random().nextInt(4)+3;
            for(int i=0;i<space;i++)
                if(i+spaceUsed<size)
                    parent[i+spaceUsed]=variable;
            variable++;
            spaceUsed=spaceUsed+space;
        }

        System.out.println(size);
        for(int i=0;i<size;i++) System.out.print(parent[i]+" ");//verificare
        helpINeedNamesForFunctions(size,parent,0,0);
    }
}
