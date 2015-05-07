package com.andani.animesh.sharedprefani1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity
{
    TextView t1,t2;EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
    }
    public void gotoB(View v)
    {
        Toast.makeText(this,"moving to Activity B",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,MainActivityB.class);
        startActivity(intent);
    }
   public void save(View v)
   {
       //Toast.makeText(this,"data saved successfully",Toast.LENGTH_LONG);
       SharedPreferences sharedPreferences=getSharedPreferences("data", Context.MODE_PRIVATE);
       SharedPreferences.Editor editor=sharedPreferences.edit();
       editor.putString("username",e1.getText().toString());
       editor.putString("password",e2.getText().toString());
       editor.commit();
       Toast.makeText(this,"data saved successfully",Toast.LENGTH_LONG);
   }
}
