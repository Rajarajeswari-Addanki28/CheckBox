package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
   CheckBox c1,c2,c3;
   Button reset,submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        reset = findViewById(R.id.b1);
        submit = findViewById(R.id.b2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("My expertise");
                if (c1.isChecked()) {
                    result.append("\n" + c1.getText().toString());

                }
                if (c2.isChecked()) {
                    result.append("\n" + c2.getText().toString());

                }
                if (c3.isChecked()) {
                    result.append("\n" + c3.getText().toString());

                }
                if (!c1.isChecked() && !c2.isChecked() && !c3.isChecked())
                    result.append("\n None");
                Message.message(MainActivity.this, result.toString());
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked())
                     c1.setChecked(false);
                if(c2.isChecked())
                    c2.setChecked(false);
                if(c3.isChecked())
                    c3.setChecked(false);

            }
        });


    }
    public void reset(View view) {
    }

    public void submit(View view) {
    }

    public void onCheckBoxClicked(View view) {
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.c1:
                if(checked)
                    Log.d("CheckBox1","Clicked");
                else
                    Log.d("CheckBox1","Unchecked");
                break;
            case R.id.c2:
                if(checked)
                    Log.d("CheckBox2","Clicked");
                else
                    Log.d("CheckBox2","Unchecked");
                break;
            case R.id.c3:
                if(checked)
                    Log.d("CheckBox3","Clicked");
                else
                    Log.d("CheckBox3","Unchecked");
                break;
        }
    }
}