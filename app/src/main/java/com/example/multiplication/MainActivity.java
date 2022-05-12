package com.example.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;
    String mul="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView =findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = Integer.parseInt(editText.getText().toString());

                for (int i=1;i<=10;i++){
                    //mul = mul + i*t +"\n";
                    mul = mul + t + " * " + i + " = " + i*t + "\n";

                }

                textView.setText(mul);

            }
        });
    }
}