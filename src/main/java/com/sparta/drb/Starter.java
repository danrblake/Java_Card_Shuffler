package com.sparta.drb;

import com.sparta.drb.control.CardManager;
import com.sparta.drb.model.CardShuffler;

public class Starter
{
    public static void main( String[] args ) {
        CardManager cardManager = new CardManager();
        cardManager.run();
    }
}
