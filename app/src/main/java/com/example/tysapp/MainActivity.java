package com.example.tysapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (button1.getText().toString()) {
                    case "Trigger":
                        button1.setText("Obsession");
                        break;
                    case "Obsession":
                        button1.setText("Urge");
                        break;
                    case "Urge":
                        button1.setText("Compulsion");
                        break;
                    case "Compulsion":
                        button1.setText("Trigger");
                        break;
                    default:
                        button1.setText("Trigger");
                        break;
                }
            }
        });
    }
}