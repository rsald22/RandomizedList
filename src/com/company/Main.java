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

        //MasterList.checkState(ml);

        MasterList.save();

    }

    public static void setup(){ // runs once to get instance
        ml = MasterList.getInstance();

    }

    public static void createList(){
        String name = "";
        System.out.println("What type of list do you want to make?" +
                "\nSTRING or INTEGER");
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        boolean nameOption = false;

        /*
            THIS BIT SHOULD BE IN A METHOD IN THE MASTERLIST FUNCTION.
         */
        while (nameOption == false) {

            if (ml.size() == 0){
                System.out.println("What do you want to name this list?");
                name = input.nextLine();
                ml.add(new RandomList(type, name));
            } else {
                for (int i = 0; i < ml.size(); i++) {
                    if (ml.get(i).getName().equals(name)) {
                        System.out.println("Name already in use");
                        break;
                    } else {
                        ml.add(new RandomList(type, name));
                        nameOption = true;
                    }
                }
            }
        }

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
    }

}
