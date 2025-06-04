package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static ArrayList<RandomList> lists = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("Welcome to Randomized List");
        System.out.println("Do you want to:\nOPEN a list\nCREATE a new list\nEDIT an existing" +
                " list\nDELETE a list");
        Scanner inp = new Scanner(System.in);   
        System.out.println("Enter OPEN, CREATE, EDIT or DELETE");
        String choice = inp.nextLine();

        if (choice.equalsIgnoreCase("create")){
            createList();
        }


        inp.close();

    }

    public static void createList(){
        System.out.println("What type of list do you want to make?" +
                "\nSTRING or INTEGER");
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        System.out.println("What do you want to name this list?");
        String name = input.nextLine();
        // should do a check here to see if that name is already taken too -- no duplicates
        lists.add(new RandomList(type, name));

    }

}
