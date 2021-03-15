package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {

    ArrayList<Item> object;

    public Catalog() {
        object = new ArrayList<Item>();
    }

    public Catalog(ArrayList<Item> object) {
        object = new ArrayList<Item>();
        this.object = object;
    }

    public ArrayList<Item> getObject() {
        return object;
    }

    public void setObject(ArrayList<Item> object) {
        this.object = object;
    }

    public void add(Item item){
        this.object.add(item);
    }

    public void list(){
        for(int i=0;i<=object.size();i++) System.out.println(object.get(i));
    }

    public void play(int i){
        File file = new File(object.get(i).getPath());
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }

        try {
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) desktop.open(file);

        } catch( IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public void save(){
        try{
            File export = new File("export.txt");
            if(export.createNewFile()){
                System.out.println("created export file");
            }
            else System.out.println("export file already exists and overwriting");
        }
        catch (IOException e){
            System.out.println("eroare la ce?");
            e.printStackTrace();
        }
        try{
            FileWriter write = new FileWriter("export.txt");
            for(int i=0;i< object.size();i++)write.write(object.get(i).toString());
            write.close();
        }
        catch (IOException e){
            System.out.println("eroare de ce?");
            e.printStackTrace();
        }
    }

    void load(){
        try{
            File obj = new File("import.txt");
            Scanner importer = new Scanner(obj);
            while(importer.hasNextLine()){
                String data1 = importer.nextLine();
                String data2 = importer.nextLine();
                String justASpace = importer.nextLine();
                Item temp = new Item (data1,data2);
                object.add(temp);
            }
        }
        catch (IOException e){
            System.out.println("eroare ceva trista");
            e.printStackTrace();
        }

    }
}
