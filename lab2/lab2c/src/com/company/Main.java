package com.company;

public class Main {

    public static void main(String[] args) {
        //declarare 3 surse
        Source S1=new Source(Source.SourceType.FACTORY,"Name1",10);
        Source S2=new Source(Source.SourceType.WAREHOUSE,"Name2",35);
        Source S3=new Source(Source.SourceType.WAREHOUSE,"Name3",25);

        System.out.println(S1);//test
        //declarare 3 destinatii
        Destination D1=new Destination("Name4",20);
        Destination D2=new Destination("Name5",25);
        Destination D3=new Destination("Name6",25);

        System.out.println(D1);//test
        //declarare matrice costuri
        Problem[][] costs = new Problem[3][3];
        costs[0][0]=new Problem(S1,D1,2);
        costs[0][1]=new Problem(S1,D2,3);
        costs[0][2]=new Problem(S1,D3,1);
        costs[1][0]=new Problem(S2,D1,5);
        costs[1][1]=new Problem(S2,D2,4);
        costs[1][2]=new Problem(S2,D3,8);
        costs[2][0]=new Problem(S3,D1,5);
        costs[2][1]=new Problem(S3,D2,6);
        costs[2][2]=new Problem(S3,D3,8);

        System.out.println(costs[1][2]);//test
        //mai trebuie facut algoritmul
    }
}
