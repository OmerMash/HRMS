package com.hrms.hrms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    private IAlgoSearch algoSearch;

    @FXML
    private Label welcomeText;
    @FXML
    private TextField full_name_tf;
    @FXML
    private TextField age_tf;
    @FXML
    private TextField id_tf;
    @FXML
    private TextField profession_tf;
    @FXML
    private TextField YOE_tf;
    @FXML
    private Label person_creation_label;
    public List<Person> l ;
    public Model myModel;


    public HelloController() {
        //create model object
        try {
            myModel = new Model();
        } catch (IOException e) {
            e.printStackTrace();
        }
        l = myModel.getPersonList("person_ser");

    }

    public void setAlgoSearch(IAlgoSearch algoSearch) {
        this.algoSearch = algoSearch;
    }

//    public List<Person> personSearch() {
//        return algoSearch.search();
//    }

    @FXML
    protected void onAddButtonClick() throws IOException {
        Person p = new Person(full_name_tf.getText(), Integer.parseInt(age_tf.getText()), id_tf.getText(), profession_tf.getText(), YOE_tf.getText());
        System.out.println("Person num: #" + p.personCounter + "created");
        System.out.println(full_name_tf.getText());
        System.out.println(age_tf.getText());
        System.out.println(id_tf.getText());
        System.out.println(profession_tf.getText());
        System.out.println(YOE_tf.getText());
        System.out.println();
        person_creation_label.setText("Person Created");
        l.add(p);
//        myModel.writeReadObject(Boolean.TRUE,p);
    }

    @FXML
    public void writeListToFile() throws IOException{
        myModel.writeObject(l);
    }

}