package com.example.form;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        et5=(EditText)findViewById(R.id.editText5);
        et6=(EditText)findViewById(R.id.editText6);

        b1=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()==0){
                    et1.setError("You must enter your name");
                }else if (et2.length()==0){
                    et2.setError("You must enter your Mobile No.");
                }else if (et3.length()==0){
                    et3.setError("You must enter your valid Email ID");
                }else if (et4.length()==0){
                    et4.setError("You must enter your Address");
                }else if (et5.length()==0){
                    et5.setError("You must enter 8 digit password");
                }else if (et6.length()==0){
                    et6.setError("You must enter atleast 4 digit");
                }else {

                }
            }
        });

    }
}