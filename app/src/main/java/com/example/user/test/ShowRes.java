package com.example.user.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 7/30/15.
 */
public class ShowRes extends Activity implements View.OnClickListener {
    TextView TvRes;
    Button BtFin;
    int num1,num2,res;
    Character sym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_res);
        TvRes = (TextView)findViewById(R.id.TvRes);
        BtFin = (Button)findViewById(R.id.BtFin);
        BtFin.setOnClickListener(this);
        Bundle bu;
        bu = getIntent().getExtras();
        num1 = bu.getInt("number1");
        num2 = bu.getInt("number2");
        sym = bu.getChar("symbol");
        if(sym == '+')
            res = num1+num2;
        else res = num1-num2;
        TvRes.setText(Integer.toString(res));
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
