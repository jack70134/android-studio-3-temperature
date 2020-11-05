package com.example.android_num3_thermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(temperature1);
        Button button1 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(temperature2);
    }
    private View.OnClickListener temperature1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText tmpc = (EditText)findViewById(R.id.editView);
            double c = Double.parseDouble(tmpc.getText().toString());
            double f = (c * 9 / 5) + 32;
            TextView trans_Ans = (TextView)findViewById(R.id.textView3);
            trans_Ans.setText(""
                    + nf.format(f));
        }
    };
    private View.OnClickListener temperature2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText tmpf = (EditText)findViewById(R.id.editView);
            double f = Double.parseDouble(tmpf.getText().toString());
            double c = (f - 32) * 5 / 9;
            TextView trans_Ans = (TextView)findViewById(R.id.textView3);
            trans_Ans.setText(""
                    + nf.format(c));

        }
    };
}