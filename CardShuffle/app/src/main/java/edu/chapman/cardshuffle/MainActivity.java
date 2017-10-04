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
        else if (number == 2)
        {
            uppertext.setText("2");
            lowertext.setText("2");
        }
        else if (number == 3)
        {
            uppertext.setText("3");
            lowertext.setText("3");
        }
        else if (number == 4)
        {
            uppertext.setText("4");
            lowertext.setText("4");
        }
        else if (number == 5)
        {
            uppertext.setText("5");
            lowertext.setText("5");
        }
        else if (number == 6)
        {
            uppertext.setText("6");
            lowertext.setText("6");
        }
        else if (number == 7)
        {
            uppertext.setText("7");
            lowertext.setText("7");
        }
        else if (number == 8)
        {
            uppertext.setText("8");
            lowertext.setText("8");
        }
        else if (number == 9)
        {
            uppertext.setText("9");
            lowertext.setText("9");
        }
        else if (number == 10)
        {
            uppertext.setText("10");
            lowertext.setText("10");
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

    }
}

