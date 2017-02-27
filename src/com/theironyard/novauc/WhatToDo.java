package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Merlin on 2/26/17.
 */
public class WhatToDo {
    public void whatToDo() throws IOException{
        Scanner s = new Scanner(System.in);
        ReadWritejson fw = new ReadWritejson();
        while (true){
            System.out.println("You must first type in the command [all people] in order to add all of the data from the people.csv file to the HashMap.\nThen you will be able to view the HashMap by typing the command [HashMap].\nThen, when you are ready, you can write this data to a json file by typing the command [json].\nWhenever you are done, you can simply type in the command [done].\nHow would you like to proceed? (all people / HashMap / json / done)\nEnter your command and then press enter.");
            switch (s.nextLine()){
                case "all people" :
                    System.out.println("All of the data from the people.csv file has been added to the HashMap.");
                    fw.allPeople();
                    break;
                case "HashMap" :
                    System.out.println("This is the HashMap below");
                    System.out.println(fw.info);
                    break;
                case "json" :
                    System.out.println("The data has now been written to a json file.");
                    fw.writeJSON();
                    break;
                case "done" :
                    System.out.println("Have a great day.");
                    System.exit(0);
                    break;
                default:
//                    return;
                    System.out.println("Command not understood");
                    break;
            }
        }

    }

}
