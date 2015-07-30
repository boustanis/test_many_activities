package com.example.user.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 7/30/15.
 */
public class PickAct extends Activity implements View.OnClickListener{
    Button BtAdd;
    Button BtRem;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick);
        BtAdd = (Button)findViewById(R.id.BtAdd);
        BtRem = (Button)findViewById(R.id.BtRem);
        BtAdd.setOnClickListener(this);
        BtRem.setOnClickListener(this);
        Bundle bu;
        bu = getIntent().getExtras();
        num1 = bu.getInt("number1");
        num2 = bu.getInt("number2");
    }


    @Override
    public void onClick(View v) {
        Intent IntNext = new Intent(this,ShowRes.class);
        IntNext.putExtra("number1",num1);
        IntNext.putExtra("number2",num2);
        Character sym;
        if(v == BtAdd){
            sym = '+';
        }
        else sym = '-';
        IntNext.putExtra("symbol",sym);
        startActivity(IntNext);
    }
}
