package ru.osmanov.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer num1;
    private Integer num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button4);
        final EditText et1 = findViewById(R.id.editText1);
        final EditText et2 = findViewById(R.id.editText2);
        TextView textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = Integer.valueOf(et1.getText().toString());
                    num2 = Integer.valueOf(et2.getText().toString());
                    if (num1.equals(num2)) {
                        textView.setText("Равно!");
                    } else {
                        textView.setText("Не равно!");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}