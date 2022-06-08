package com.example.logoanimat;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgbt1;
    ImageView pilota, avioneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbt1 = (ToggleButton) findViewById(R.id.off);
        pilota = (ImageView) findViewById(R.id.pilota);
        avioneta = (ImageView) findViewById(R.id.avioneta);
    }

    public void onClick(View view) {
        //boto1
        if (view.getId() == R.id.off) {
            if (tgbt1.isChecked()) {
                tgbt1.setButtonDrawable(R.drawable.on);
                pilota();
                avioneta();

            } else {
                tgbt1.setButtonDrawable(R.drawable.off);
                pilota.clearAnimation();
                avioneta.clearAnimation();
            }
        }
    }
    private void pilota() {
        Animation animacioPilota;
        animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        pilota.startAnimation(animacioPilota);
    }
    private void avioneta() {
        Animation animacioAvioneta;
        animacioAvioneta = AnimationUtils.loadAnimation(MainActivity.this, R.anim.vuelo);
        avioneta.startAnimation(animacioAvioneta);
    }


}