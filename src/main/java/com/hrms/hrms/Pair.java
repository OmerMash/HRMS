package com.hrms.hrms;


public class Pair<Key,Value> {
    private Key key;
    private Value value;

    //Constructor of Pairs
    public Pair(Key key, Value value){
        this.key = key;
        this.value = value;
    }

    public Key getKey(){ return this.key; }
    public Value getValue(){ return this.value; }

    public void setKey(Key key){ this.key = key; }
    public void setValue(Value value){ this.value = value; }
}
//Notice that it doesn't have to be in a "Key-Value" fashion, it can be any 2 variables,
//For example Pair<X,Y>, getX(), getY(), etc.
