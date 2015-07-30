package com.example.user.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button BtOk;
    EditText EtN1;
    EditText EtN2;
    TextView TvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtOk = (Button)findViewById(R.id.BtOk);
        BtOk.setOnClickListener(this);
        EtN1 = (EditText)findViewById(R.id.EtN1);
        EtN2 = (EditText)findViewById(R.id.EtN2);
        TvResult = (TextView)findViewById(R.id.TvResult);
    }



    @Override
    public void onClick(View v) {
        if(v == BtOk){
            int number1 = Integer.parseInt(EtN1.getText().toString());
            int number2 = Integer.parseInt(EtN2.getText().toString());
            Intent IntNext = new Intent(this,PickAct.class);
            IntNext.putExtra("number1",number1);
            IntNext.putExtra("number2",number2);
            startActivity(IntNext);

        }
    }
}
