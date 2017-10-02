package edu.chapman.cardshuffle;

/**
 * Created by Sierra on 10/2/2017.
 */

public class Card
{
    String suit;
    int number;

    public Card(String suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
