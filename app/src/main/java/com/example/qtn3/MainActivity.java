package com.example.qtn3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.name);
        editText2=findViewById(R.id.age);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameT=editText1.getText().toString().trim();
                String ageT=editText2.getText().toString().trim();
                if(nameT.equals("")|| ageT.equals("")){
                    Toast.makeText(getApplicationContext(),"Plz fill all fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                    intent.putExtra("name",nameT);
                    intent.putExtra("age",ageT);
                    startActivity(intent);
                }
            }
        });
    }
}