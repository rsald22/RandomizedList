package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static ArrayList<RandomList> ml;

    public static void main(String[] args) {

        setup();

        /*
        for (int i = 0; i < ml.size(); i++){
            System.out.println(ml.get(i).getName());
        }
        */

        System.out.println("Welcome to Randomized List");
        System.out.println("Do you want to:\nOPEN a list\nCREATE a new list\nEDIT an existing" +
                " list\nDELETE a list");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter OPEN, CREATE, EDIT or DELETE\n");
        String choice = inp.nextLine();

        if (choice.equalsIgnoreCase("create")){
            createList();
        }

        inp.close();

        //MasterList.checkState(ml);

        MasterList.save();

    }

    public static void setup(){ // runs once to get instance
        ml = MasterList.getInstance();

    }

    public static void createList(){
        System.out.println("What type of list do you want to make?" +
                "\nSTRING or INTEGER");
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        System.out.println("What do you want to name this list?");
        String name = input.nextLine();
        ml.add(new RandomList(type, name));

    }

}
