package com.company;

public class Player {
    String name;
    float score;

    void setName(String name_in){
        name = name_in;
    }
    void setScore(float score_in){
        score = score_in;
    }
    String getName(){
        return name;
    }
    float getScore(){
        return score;
    }

}