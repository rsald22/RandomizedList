package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static ArrayList<RandomList> ml;

    public static void main(String[] args) {

        setup();

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

        MasterList.checkState(ml);

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
        String name = "";
        boolean created = false;
        do{
            System.out.println("Name of list? ");
            name = input.nextLine();
            created = MasterList.createList(type, name);
        }
        while (created == false);





        System.out.println("List successfully created");
        System.out.println("Do you want to add to this list?");
        String selection = input.nextLine();
        if (selection.equalsIgnoreCase("y") || selection.equalsIgnoreCase("yes")){
            edit(name);
        }
    }

    public static void edit(String listName){
        /*
            Have the editting / adding bit in the random list class
            but use this side for input getting + accessing the masterlist as needed?
         */

        System.out.println("HELLO WORLD");
    }

}
