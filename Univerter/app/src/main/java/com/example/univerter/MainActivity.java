package com.example.univerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView tv1, tv2;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        tv1 = findViewById(R.id.textView);
        et = findViewById(R.id.user_input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kgValue = et.getText().toString();
                int kgVal = Integer.parseInt(kgValue);
                double pound = kgVal * 2.205;
                tv1.setText("The corresponding pounds is " + pound);
                Toast.makeText(MainActivity.this, "Hi click listener", Toast.LENGTH_SHORT).show();
            }
        });
    }
}