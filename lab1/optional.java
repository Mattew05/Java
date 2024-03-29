package com.company;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    static int checkConnected(int n, int[][] matrix){//facem un bfs si vedem daca viziteaza toate nodurile la final
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)visited[i]=false;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        while(queue.size()>0){
            int x=queue.poll();
            visited[x]=true;
            for(int i=0;i<n;i++)
                if(matrix[x][i]==1&& !visited[i])
                    queue.add(i);
        }
        for(int i=0;i<n;i++)
            if(!visited[i])
                return 0;
        return 1;
    }

    static void connectedComponents(int n, int[][] matrix){//tot cu bfs
        int[] visited=new int[n];
        for(int i=0;i<n;i++)
            visited[i]=0;

        LinkedList<Integer> queue = new LinkedList<Integer>();

        int color=1;//colorare vector vizitat

        for(int i=0;i<n;i++)//face un bfs pe fiecare nod din graf
        {
            if (visited[i] == 0) {
                visited[i] = color;
                queue.add(i);
                while (queue.size() > 0) {
                    int x = queue.poll();
                    visited[x] = color;
                    for (int j = 0; j < n; j++)
                        if (visited[j] == 0 && matrix[x][j] == 1) {
                            queue.add(j);
                        }
                }
                color++;
            }
        }
        for(int i=1;i<color;i++)
        {
            for (int j = 0; j < n; j++) if(visited[j]==i) System.out.print(j);
            System.out.print("\n");
        }
    }

    static void treeGenerator(int n, int[][] matrix){//facem parcurgerea bfs si gasim nodurile
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)visited[i]=false;
        int[][] treeMatrix=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                treeMatrix[i][j]= 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        while(queue.size()>0){
            int x=queue.poll();
            visited[x]=true;
            for(int i=0;i<n;i++)
                if(matrix[x][i]==1&& !visited[i])
            {
                queue.add(i);
                treeMatrix[x][i]=1;//aici tinem minte conexiunea dintre nodurile vecine
                treeMatrix[i][x]=1;
            }
        }
        System.out.print("\n");//lasam sa fie pe o linie noua sa arate mai frumos afisarile
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(treeMatrix[i][j]);
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int[][] matrix=new int[n][n];
        //creere de matrice de adiacenta la un graf random neorientat
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                matrix[i][j]= ((int) new Random().nextInt(5))%2;
                matrix[j][i]=matrix[i][j];
            }
        //afisare de matrice de adiacenta
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(matrix[i][j]);
            System.out.print("\n");
        }

        if(checkConnected(n,matrix)==1) {System.out.println("It is connected.");treeGenerator(n,matrix);}//am pus aici fiindca matricea se genereaza random
        else {
            System.out.print("It ain't connected\n");
            connectedComponents(n,matrix);
        }
    }
}
