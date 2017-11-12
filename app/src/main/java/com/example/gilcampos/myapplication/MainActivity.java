package com.example.gilcampos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(
                 new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView signInText = (TextView)findViewById(R.id.signInText);
                        signInText.setText("Good job Alex");
                    }
                }
        );
    }
}
