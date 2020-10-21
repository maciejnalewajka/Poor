package com.poor;

import android.graphics.drawable.AnimationDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    View obraz;
    boolean bool = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        obraz = findViewById(R.id.obraz_id);
        anim();
        if(Locale.getDefault().getDisplayLanguage().equals("polski")){
            TextView text = findViewById(R.id.textView);
            text.setText(R.string.jestem);
        }
    }

    public void click(View view) {
        if (bool) {
            obraz.setBackgroundResource(R.drawable.round2);
            bool = false;
        }
        else{
            obraz.setBackgroundResource(R.drawable.round);
            bool = true;
        }
    }

    private void anim(){
        mylayout = findViewById(R.id.pierwszy);
        animationDrawable = (AnimationDrawable) mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
    }
}
