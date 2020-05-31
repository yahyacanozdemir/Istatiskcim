package com.example.istatiskcim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splashScreen extends AppCompatActivity {

    ImageView title ;
    LottieAnimationView table ;

    Animation fromBottom,fromSide,fromUp ;
    int gosterim_suresi = 5000;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

      table = (LottieAnimationView) findViewById(R.id.tableLottie);
      title = findViewById(R.id.title);

     /*   fromBottom = AnimationUtils.loadAnimation(this,R.anim.frombottom) ;
        bird.setAnimation(fromBottom);
*/
        fromSide = AnimationUtils.loadAnimation(this,R.anim.fromright);
        title.setAnimation(fromSide);

        fromUp = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        table.setAnimation(fromUp);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        }, gosterim_suresi);

    }
}
