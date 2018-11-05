package com.sparta.drb.control;

import com.sparta.drb.model.Card;
import com.sparta.drb.model.CardShuffler;
import com.sparta.drb.model.Deck;

import java.util.Arrays;
import java.util.List;

public class CardManager {
    public void run(){
        CardShuffler cardShuffler = new CardShuffler();
        List deck1 = cardShuffler.createDeck();
        System.out.println(deck1);
        cardShuffler.cardShuffler(deck1);
        System.out.println(deck1);
    }
}
