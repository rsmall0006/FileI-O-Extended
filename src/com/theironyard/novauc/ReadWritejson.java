package com.theironyard.novauc;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by Merlin on 2/20/17.
 */
public class ReadWritejson {
    File data = new File("people.csv");
    Scanner ss = new Scanner(data);


    public static HashMap<String, ArrayList<Person>> info = new HashMap();


    public ReadWritejson() throws IOException{
    }

    public void allPeople(){
        while (ss.hasNext()){
            String nexline = ss.nextLine();
            String[] delineator = nexline.split(",");
            Person people = new Person(Integer.valueOf(delineator[0]), delineator[1], delineator[2], delineator[3], delineator[4], (delineator[5]));
//            Person p = personFromCSV(line);


            if (info.containsKey(people.getCountry())){
                info.get(people.getCountry()).add(people);
//                info.put(p.getCountry, new ArrayList<>(Persons());

            }
            else {
                info.put(people.getCountry(), new ArrayList<Person>());
                info.get(people.getCountry()).add(people);
            }
        }
    }

    File datas = new File("people.json");

    public void writeJSON() throws IOException{
        JsonSerializer serializer = new JsonSerializer();

        String jsonformattedPeople = serializer.deep(true).serialize(info);
//        String jsonformattedPeople = jsonSerializer.deep(true).serialize(info);//..(info) is the object...
        FileWriter fw = new FileWriter(datas);

        fw.write(jsonformattedPeople);
        fw.close();
    }
}
