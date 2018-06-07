package com.project.four;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class MainActivityTwo extends AppCompatActivity {
    TextView tcost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.project.four.R.layout.activity_main1);
        tcost = (TextView) findViewById(com.project.four.R.id.cost);
        seeTraverse();
    }

    public void seeTraverse() {
        MatrixTraverse mat = new MatrixTraverse(Mat.arr);
        List<String> trList = mat.traverse(Mat.arr);
        tcost.setText(" " + trList.get(2) + "\n Traverse Cost:  " + trList.get(0) + " \n and path " + trList.get(1));
    }
}
