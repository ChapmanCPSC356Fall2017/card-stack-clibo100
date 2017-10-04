package edu.chapman.cardshuffle;

import android.graphics.Color;
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
            deck.push(new Card("heart", i));
            deck.push(new Card("diamond", i));
            deck.push(new Card("spade", i));
            deck.push(new Card("club", i));
        }
        Collections.shuffle(deck);
        setCardView(deck.peek().getSuit(), deck.peek().getNumber());

    }

    public void onClickCard(View view) {
        deck.pop();
        if (deck.isEmpty())
        {
            finish();
        }
        else
        {
            setCardView(deck.peek().getSuit(), deck.peek().getNumber());
        }
    }

    public void setCardView(String suit, int number)
    {
        if (suit == "club")
        {
            uppertext.setTextColor(Color.BLACK);
            lowertext.setTextColor(Color.BLACK);
            upperimage.setImageResource(R.drawable.club);
            centerimage.setImageResource(R.drawable.club);
            lowerimage.setImageResource(R.drawable.club);
        }
        else if (suit == "spade")
        {
            uppertext.setTextColor(Color.BLACK);
            lowertext.setTextColor(Color.BLACK);
            upperimage.setImageResource(R.drawable.spade);
            centerimage.setImageResource(R.drawable.spade);
            lowerimage.setImageResource(R.drawable.spade);
        }
        else if (suit == "diamond")
        {
            uppertext.setTextColor(Color.RED);
            lowertext.setTextColor(Color.RED);
            upperimage.setImageResource(R.drawable.diamond);
            centerimage.setImageResource(R.drawable.diamond);
            lowerimage.setImageResource(R.drawable.diamond);
        }
        else if (suit == "heart")
        {
            uppertext.setTextColor(Color.RED);
            lowertext.setTextColor(Color.RED);
            upperimage.setImageResource(R.drawable.heart);
            centerimage.setImageResource(R.drawable.heart);
            lowerimage.setImageResource(R.drawable.heart);
        }

        if (number == 1)
        {
            uppertext.setText("A");
            lowertext.setText("A");
        }
        else if (number == 11)
        {
            uppertext.setText("J");
            lowertext.setText("J");
        }
        else if (number == 12)
        {
            uppertext.setText("Q");
            lowertext.setText("Q");
        }
        else if (number == 13)
        {
            uppertext.setText("K");
            lowertext.setText("K");
        }
        else
        {
            uppertext.setText(number);
            lowertext.setText(number);
        }

    }
}

