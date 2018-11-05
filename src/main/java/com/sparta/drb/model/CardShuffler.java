package com.sparta.drb.model;

import com.sparta.drb.model.Card;
import com.sparta.drb.model.CardValue;
import com.sparta.drb.model.Deck;
import com.sparta.drb.model.Suits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class CardShuffler {

        public List createDeck(){
            List deck = new ArrayList(52);

            for(Suits suits : Suits.values()){
                for(CardValue cardValue : CardValue.values()){
                    Card card = new Card(cardValue.getValue(), suits.getSuit());
                    deck.add(card);
                }
            }
            return deck;
        }

        public void cardShuffler(List deck){
           Collections.shuffle(deck);

        }
    }

