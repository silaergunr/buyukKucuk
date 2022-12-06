package com.example.buyukkucuk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidstudio123.R;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button button_kontrol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kontrol = findViewById(R.id.button_kontrol);
        editText1 = findViewById(R.id.textnumber1);
        editText2 = findViewById(R.id.textnumber2);
    }

    public void kontrol(View view){
        int sayi1 = Integer.parseInt(editText1.getText().toString());
        int sayi2 = Integer.parseInt(editText2.getText().toString());
        if(sayi1>sayi2){
            Toast.makeText(MainActivity.this, "1. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
        if(sayi2>sayi1){
            Toast.makeText(MainActivity.this, "2. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
        if(sayi1==sayi2){
            Toast.makeText(MainActivity.this,"Sayılar Birbirine Eşittir.", Toast.LENGTH_LONG).show();
        }
    }
}