package com.hrms.hrms;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class Person implements Serializable {

    public int personCounter = 0;
    public int age;
    String ID;
    String name;
    String profession;
    String experience_y;

    public Person(String full_name_tf, int age_tf, String id_tf, String profession_tf, String YOE_tf ) {
        name = full_name_tf;
        age = age_tf;
        ID = id_tf;
        profession = profession_tf;
        experience_y = YOE_tf;
        personCounter++;
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + age + " " + profession + " " + experience_y;
    }

}
