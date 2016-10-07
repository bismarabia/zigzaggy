package com.rabia.bisma.zigzaggy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    RelativeLayout layout;
    Button playBtn, retryBtn;
    TextView scoreOnBoard, highScoreOnBoard, score;
    ImageView ball, gameOver, scoreBoard, logo, pillar1,
            pillar2, pillar3, pillar4, pillar5, pillar6,
            pillar7, pillar8, pillar9, pillar10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        onCreateNew();

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBtnClicker();
            }
        });
    }

    protected void onCreateNew(){
        layout = (RelativeLayout)findViewById(R.id.layout);
        playBtn = (Button)findViewById(R.id.playBtn);
        retryBtn = (Button)findViewById(R.id.retryBtn);
        scoreOnBoard = (TextView) findViewById(R.id.scoreOnBoard);
        highScoreOnBoard = (TextView) findViewById(R.id.highScoreOnBoard);
        score = (TextView) findViewById(R.id.score);
        ball = (ImageView) findViewById(R.id.ball);
        gameOver = (ImageView) findViewById(R.id.gameOver);
        scoreBoard = (ImageView) findViewById(R.id.scoreBoard);
        logo = (ImageView) findViewById(R.id.logo);
        pillar1 = (ImageView) findViewById(R.id.pillar1);
        pillar2 = (ImageView) findViewById(R.id.pillar2);
        pillar3 = (ImageView) findViewById(R.id.pillar3);
        pillar4 = (ImageView) findViewById(R.id.pillar4);
        pillar5 = (ImageView) findViewById(R.id.pillar5);
        pillar6 = (ImageView) findViewById(R.id.pillar6);
        pillar7 = (ImageView) findViewById(R.id.pillar7);
        pillar8 = (ImageView) findViewById(R.id.pillar8);
        pillar9 = (ImageView) findViewById(R.id.pillar9);
        pillar10 = (ImageView) findViewById(R.id.pillar10);

        pillar1.setVisibility(View.INVISIBLE);
        pillar2.setVisibility(View.INVISIBLE);
        pillar3.setVisibility(View.INVISIBLE);
        pillar4.setVisibility(View.INVISIBLE);
        pillar5.setVisibility(View.INVISIBLE);
        pillar6.setVisibility(View.INVISIBLE);
        pillar7.setVisibility(View.INVISIBLE);
        pillar8.setVisibility(View.INVISIBLE);
        pillar9.setVisibility(View.INVISIBLE);
        pillar10.setVisibility(View.INVISIBLE);
        ball.setVisibility(View.INVISIBLE);
        gameOver.setVisibility(View.INVISIBLE);
        retryBtn.setVisibility(View.INVISIBLE);
        score.setVisibility(View.INVISIBLE);
        scoreBoard.setVisibility(View.INVISIBLE);
        scoreOnBoard.setVisibility(View.INVISIBLE);
        highScoreOnBoard.setVisibility(View.INVISIBLE);
    }

    protected void playBtnClicker(){

        logo.setVisibility(View.INVISIBLE);
        playBtn.setVisibility(View.INVISIBLE);

        pillar1.setX(320);
        pillar1.setY(768);
        ball.setX(330);
        ball.setY(820);
        pillar2.setX(pillar1.getX() + 78);
        pillar2.setY(pillar1.getY() - 55);
        pillar3.setX(pillar2.getX() + 78);
        pillar3.setY(pillar2.getY() - 55);
        pillar4.setX(pillarPlacementX(pillar3.getX()));
        pillar4.setY(pillarPlacementY(pillar3.getY()));
        pillar5.setX(pillarPlacementX(pillar4.getX()));
        pillar5.setY(pillarPlacementY(pillar4.getY()));
        pillar6.setX(pillarPlacementX(pillar5.getX()));
        pillar6.setY(pillarPlacementY(pillar5.getY()));
        pillar7.setX(pillarPlacementX(pillar6.getX()));
        pillar7.setY(pillarPlacementY(pillar6.getY()));
        pillar8.setX(pillarPlacementX(pillar7.getX()));
        pillar8.setY(pillarPlacementY(pillar7.getY()));
        pillar9.setX(pillarPlacementX(pillar8.getX()));
        pillar9.setY(pillarPlacementY(pillar8.getY()));
        pillar10.setX(pillarPlacementX(pillar9.getX()));
        pillar10.setY(pillarPlacementY(pillar9.getY()));

        pillar1.setVisibility(View.VISIBLE);
        pillar2.setVisibility(View.VISIBLE);
        pillar3.setVisibility(View.VISIBLE);
        pillar4.setVisibility(View.VISIBLE);
        pillar5.setVisibility(View.VISIBLE);
        pillar6.setVisibility(View.VISIBLE);
        pillar7.setVisibility(View.VISIBLE);
        pillar8.setVisibility(View.VISIBLE);
        pillar9.setVisibility(View.VISIBLE);
        pillar10.setVisibility(View.VISIBLE);
        ball.setVisibility(View.VISIBLE);
        score.setVisibility(View.VISIBLE);

    }

    public float pillarPlacementX(float X){
        float pillarNewX = 0f;
        int random = (int)(Math.random()*2 + 1);
        if (random == 1){
            if (X > 600){
                pillarNewX = X - 79;
            } else
                pillarNewX = X + 78;
        } else {
            if (X < 40)
                pillarNewX = X + 78;
            else
                pillarNewX = X - 79;
        }

        return pillarNewX;
    }

    public float pillarPlacementY(float Y){
        Y -= 57;
        return Y;
    }
}
