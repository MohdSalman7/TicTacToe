package com.example.dell.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    int myActivePlayer=0;         // zero for cross and 1 for  circle

    int myGameState[]={2,2,2,2,2,2,2,2,2};

    public void imageTapped(View view)
    {

        ImageView myTapped=(ImageView) view;
      int myImageTag=Integer.parseInt(myTapped.getTag().toString());

      if(myGameState[myImageTag]==2)
      {
          myGameState[myImageTag]=myActivePlayer;
          if(myActivePlayer==0)
          {
              myTapped.setImageResource(R.drawable.cross);
              myTapped.animate().rotation(360).setDuration(1000);
              myActivePlayer=1;
          }
          else
          {
              myTapped.setImageResource(R.drawable.circle);
              myActivePlayer=0;
          }
      }




    }

    public void buttonTapped(View view)
    {
        // set my game state to 2 again
     for(int i=0;i<myGameState.length;i++)
     {
         myGameState[i]=2;
     }
        // set my active player to 0 again

        myActivePlayer=0;
        //set images to ic_launcher again

        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.layout1);
        for(int i=0;i<linearLayout.getChildCount();i++)
        {
            ((ImageView)linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
        LinearLayout linearLayout1=(LinearLayout)findViewById(R.id.layout2);
        for(int i=0;i<linearLayout1.getChildCount();i++)
        {
            ((ImageView)linearLayout1.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
        LinearLayout linearLayout2=(LinearLayout)findViewById(R.id.layout3);
        for(int i=0;i<linearLayout2.getChildCount();i++)
        {
            ((ImageView)linearLayout2.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
