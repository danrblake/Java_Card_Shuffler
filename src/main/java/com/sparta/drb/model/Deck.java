package com.sparta.drb.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards){
        this.cards = cards;
    }

    public List<Card> getDeck(){
        return cards;
    }
}
