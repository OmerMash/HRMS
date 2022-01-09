package com.hrms.hrms;

import java.util.ArrayList;
import java.util.List;

 class searchByAge implements IAlgoSearch{
     @Override
    public List<Person> search(List<Person> l, int minAge, int maxAge, String profession) {
        List<Person> result = new ArrayList<Person>();
        for(Person p : l){
            if(p.age >= minAge && p.age <= maxAge){
                result.add(p);
            }
        }
         return result;
    }


//    @Override
//    public ArrayList<Person> search(List<Person> p) {
//        ArrayList<Person> L1 = new ArrayList<Person>();
//        for( p : L1){
//            if((Integer.parseInt(p.age) < 30)) L1.add(p);
//        }
//        return L1;
//        return null;
//    }
}
