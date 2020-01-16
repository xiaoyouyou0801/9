package com.example.a9.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a9.Main2Activity;
import com.example.a9.R;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText editTextName,editTextPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=(Button) this.findViewById(R.id.button);
        editTextName=(EditText) this.findViewById(R.id.editText);
        editTextPwd=(EditText) this.findViewById(R.id.editText2);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Login();
            }
        });
    }
    private  void Login(){
        String name=editTextName.getText().toString();
        String pwd=editTextPwd.getText().toString();
        if(name.equals("admin")&&pwd.equals("admin")){

            Intent intent=new Intent();
            intent.setClass(this,Main2Activity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"登录失败",Toast.LENGTH_LONG).show();

        }
    }


}
