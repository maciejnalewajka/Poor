package com.poor;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mylayout;
    AnimationDrawable anim;
    int val = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        anim();
        if(Locale.getDefault().getDisplayLanguage().equals("polski")){
            TextView text = findViewById(R.id.textView);
            text.setText(R.string.jestem);
        }
    }

    public void click(View view) {
        View obraz = findViewById(R.id.obraz_id);
        switch (val){
            case 1:
                obraz.setBackgroundResource(R.drawable.round2);
                val = 2;
                break;
            case 2:
                obraz.setBackgroundResource(R.drawable.round);
                val = 1;
                break;
        }
    }

    public void anim(){
        mylayout = findViewById(R.id.pierwszy);
        anim = (AnimationDrawable) mylayout.getBackground();
        anim.setEnterFadeDuration(10);
        anim.setExitFadeDuration(3000);
        anim.start();
    }
}
