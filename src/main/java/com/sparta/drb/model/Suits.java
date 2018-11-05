package com.sparta.drb.model;

public enum Suits {
    CLUBS {
        @Override
        public String getSuit(){
            return "This is a CLUB";
        }
    },
    DIAMONDS {
        @Override
        public String getSuit(){
            return "This is a DIAMOND";
        }
    },
    HEARTS {
        @Override
        public String getSuit(){
            return "This is a HEART";
        }
    },
    SPADES {
        @Override
        public String getSuit(){
            return "This is a SPADE";
        }
    };


    public abstract String getSuit();
}
