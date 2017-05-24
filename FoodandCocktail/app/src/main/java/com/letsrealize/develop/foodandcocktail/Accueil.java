package com.letsrealize.develop.foodandcocktail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    public Button myButton;
    public Button monBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        myButton = (Button)findViewById(R.id.button_signin);
        myButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(Accueil.this, LoginActivity.class);
                startActivity(but1);
            }
        });

        monBtn = (Button)findViewById(R.id.button_signup);
        monBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but2 = new Intent(Accueil.this, SignupActivity.class);
                startActivity(but2);
            }
        });
    }
}
