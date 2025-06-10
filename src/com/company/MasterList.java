package com.company;
import java.io.*;
import java.util.ArrayList;


public class MasterList implements Serializable {

    private static ArrayList<RandomList> list;

    private MasterList(){
        ;;
    }

    public static ArrayList<RandomList> getInstance(){
        makeList();
        return list;
    }

    public static void makeList(){
        try{
           FileInputStream fis = new FileInputStream("MasterList");
           ObjectInputStream ois = new ObjectInputStream(fis);
           list = (java.util.ArrayList<RandomList>) ois.readObject(); // try and retrieve prev masterlist
        } catch (Exception e){
            System.out.println(e);
        }
        if (list == null){ // if there's no previous masterlist, make a new one
            System.out.println("No List found, creating new master list");
            list = new ArrayList<>();
        } else{
            System.out.println("Master list found");
        }
    }



    public static void save(){
        try{ // create new file and write the current masterlist to it
            FileOutputStream fos = new FileOutputStream("MasterList");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static boolean checkState(ArrayList<RandomList> modList){
        //tester method
        System.out.println("ML has size: " + list.size());
        System.out.println("ModList has size: " + modList.size());

        return list.size() == modList.size();
    }




}
