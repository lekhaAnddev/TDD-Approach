package com.project.four;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    EditText editText1, editText2;
    Button b1;
    int rows = 0, cols = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(com.project.four.R.layout.activity_main);
        editText1 = (EditText) findViewById(com.project.four.R.id.editText1);
        editText2 = (EditText) findViewById(com.project.four.R.id.editText2);
        b1 = (Button) findViewById(com.project.four.R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    rows = Integer.parseInt(editText1.getText().toString());
                    cols = Integer.parseInt(editText2.getText().toString());
                    if (cols >= 1) {
                        Intent i = new Intent(context, Mat.class);
                        i.putExtra("row", rows);
                        i.putExtra("col", cols);
                        startActivity(i);
                    } else if (cols < 1)
                        Universal.showAlert(context, "Improper value!", "Please enter above 0");
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    Universal.showAlert(context, "Invalid character", "Please enter numbers only.");
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(context, "Exception caught.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
