package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonGoPressed(View view)
    {
        //código para abrir SecondActivity:
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("resultado", 30);
        intent.putExtra("texto", "hola");
        startActivity(intent);
    }
}
