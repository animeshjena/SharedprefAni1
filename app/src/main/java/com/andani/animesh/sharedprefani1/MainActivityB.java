package com.andani.animesh.sharedprefani1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivityB extends ActionBarActivity {
public  static final String Default="N/A";EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_b);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);

    }
public void load(View v)
{
    SharedPreferences sharedPreferences=getSharedPreferences("data",Context.MODE_PRIVATE);
    String username=sharedPreferences.getString("username",Default);
    String password=sharedPreferences.getString("password",Default);
    if(username.equals(Default)||password==Default)
    {
        Toast.makeText(this,"data not found",Toast.LENGTH_LONG).show();
    }
    else
    {
        Toast.makeText(this,"data successfully loaded",Toast.LENGTH_LONG).show();
        e1.setText(username);
        e2.setText(password);
    }
}
    public void back(View v)
    {
        Toast.makeText(this,"we are going back",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
