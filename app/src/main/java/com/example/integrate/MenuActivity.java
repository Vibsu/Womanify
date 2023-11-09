package com.example.integrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button addcontactsbtn,instrbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addcontactsbtn=(Button) findViewById(R.id.button);
        instrbtn=(Button)findViewById(R.id.button2) ;

        getSupportActionBar().hide();

        addcontactsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(intent);
            }
        });
        instrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),InstructionsActivity.class);
                startActivity(intent);
            }
        });
    }


}
