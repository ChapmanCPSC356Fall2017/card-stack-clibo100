package edu.chapman.cardshuffle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Stack;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Stack<Card> deck = new Stack<Card>();
    private TextView uppertext;
    private TextView lowertext;
    private ImageView upperimage;
    private ImageView centerimage;
    private ImageView lowerimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uppertext = (TextView) findViewById(R.id.uppertext);
        upperimage = (ImageView) findViewById(R.id.upperimage);
        centerimage = (ImageView) findViewById(R.id.centerimage);
        lowerimage = (ImageView) findViewById(R.id.lowerimage);
        lowertext = (TextView) findViewById(R.id.lowertext);

        for (int i = 1; i <= 13; ++i){
            deck.push(new Card("hearts", i));
            deck.push(new Card("diamond", i));
            deck.push(new Card("spade", i));
            deck.push(new Card("clover", i));
        }
        Collections.shuffle(deck);

    }

    public void onClickCard(View view) {

    }

    public void setCardView(String suit, int number)
    {

    }
}

