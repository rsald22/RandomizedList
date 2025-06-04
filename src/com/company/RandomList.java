package com.company;

import java.util.ArrayList;

public class RandomList {

    private ArrayList list;
    private String name;

    RandomList(String type, String name){
        if (type.equalsIgnoreCase("String")){
            list = new ArrayList<String>();
        } else if (type.equalsIgnoreCase("integer") ||
                type.equalsIgnoreCase("Integer")){
            list = new ArrayList<Integer>();
            // i'm sure this will cause no problems later
        }
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }





}
