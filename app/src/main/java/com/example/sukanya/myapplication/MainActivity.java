package com.example.sukanya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText name;
    private EditText password;
    private Button  login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.et1);
        password = (EditText)findViewById(R.id.et2);
        login =(Button)findViewById(R.id.button1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
public void validate(String username ,String password)
{
if ((username.equalsIgnoreCase("edureka"))&&(password.equalsIgnoreCase("edureka123"))) {
    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
    startActivity(intent);
}

else
    {
        Toast.makeText(MainActivity.this,
                "Please Enter Valid credentials", Toast.LENGTH_LONG).show();
        login.setEnabled(false);
    }

}
}
