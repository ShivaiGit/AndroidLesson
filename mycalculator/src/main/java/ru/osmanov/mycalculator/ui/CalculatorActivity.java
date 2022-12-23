package ru.osmanov.mycalculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import ru.osmanov.mycalculator.R;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView{

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultView = findViewById(R.id.tv_result);

    }

    @Override
    public void showResult(String result) {
        resultView.setText(result);
    }
}