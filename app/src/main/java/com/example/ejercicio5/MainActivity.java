package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();




    }

    private void initListeners(){
        textresultado = findViewById(R.id.textresultado);
        Button btntoast = findViewById(R.id.btntoast);
        Button btncound = findViewById(R.id.btncount);

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        btncound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer cont = Integer.parseInt(textresultado.getText().toString());
                cont ++;
                textresultado.setText(cont.toString());
            }
        });
    }
}