package com.hrms.hrms;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Model implements IDAO {
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    private Object Stream;
    private Object FileContent;
    String filePath = "filePath";



    public File someFile;

    public Model() throws IOException{
    }


    public List<Person> getPersonList(String fileName){
        List<Person> l = new ArrayList<Person>();
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("person_ser")));
            for (int i = 0; i < 2; i++) {
                Person p = (Person) input.readObject();
                System.out.println(p);
                l.add(p);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return l;
    }

    public void writeObject(List<Person> l) throws IOException {
        //write to file
            if(output==null){
                output = new ObjectOutputStream(Files.newOutputStream(Paths.get("person_ser")));
                for (Person p : l) {
                    output.writeObject(l.get());
                }
            output.close();
        }
    }






//    public List<String> getListFromFile(String filename, String listName) throws IOException {
//        List<String> result;
//        (Stream FileContent lines = Files.lines(Paths.get(filename))){
//            result = lines.collect(Collectors.toList());
//
//
//            return null;
//        }
//    }


//
//
//    public void writeFile() throws IOException{
//        File tempFile = new File(filePath);
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//        writer.write(" ");
//    }
//
//    public void readFile() throws IOException{
//        String currentLine;
//
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//
//        while ((currentLine = reader.readLine()) != null) { //while not reached EOF
//            if (currentLine.matches("(.*)" + manipulatedString + "(.*)")) {
//                System.out.println(currentLine);
//    }}
//    public void CheckOut() throws IOException, InterruptedException {
//        File tempFile = new File("C:\\Users\\User\\IdeaProjects\\HRMS");
//        String currentLine;
//
//        BufferedReader reader = new BufferedReader(new FileReader(tempFile));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//
//        while ((currentLine = reader.readLine()) != null) { //while not reached EOF
//            if (currentLine.matches("(.*)" + manipulatedString + "(.*)")) {
//                System.out.println(currentLine);
//
//                writer.write(currentLine + System.getProperty("line.separator"));
//                writer.flush();
//            }
//            writer.close();
//            reader.close();
//
//        }
//
//
//    }
}