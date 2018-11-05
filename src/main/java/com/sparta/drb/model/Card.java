package com.sparta.drb.model;

public class Card {
    private final int value;
    private final String suit;


    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public String getSuit(){
        return this.suit;
    }
    public int getValue(){
        return this.value;
    }
}
