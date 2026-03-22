package com.example.check_box_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox javaChb;
    CheckBox jsChb;
    CheckBox phpChb;
    CheckBox phyChb;
    CheckBox cChb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        mesajVer();

    }

    public void tanimla() {

        javaChb=(CheckBox) findViewById(R.id.java);
        jsChb=(CheckBox) findViewById(R.id.js);
        phpChb=(CheckBox) findViewById(R.id.php);
        phyChb=(CheckBox) findViewById(R.id.python);
        cChb=(CheckBox) findViewById(R.id.csharp);

    }

    public void mesajVer() {
        javaChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(javaChb.isChecked()){
                    Toast.makeText(getApplicationContext(),javaChb.getText()+" seçildi", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),javaChb.getText()+" iptal edildi", Toast.LENGTH_LONG).show();
                }
            }
        });

        phpChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phpChb.isChecked()){
                    Toast.makeText(getApplicationContext(),phpChb.getText()+" seçildi", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),phpChb.getText()+" iptal edildi", Toast.LENGTH_LONG).show();
                }
            }
        });

        phyChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phyChb.isChecked()){
                    Toast.makeText(getApplicationContext(),phyChb.getText()+" seçildi", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),phyChb.getText()+" iptal edildi", Toast.LENGTH_LONG).show();
                }
            }
        });

        cChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cChb.isChecked()){
                    Toast.makeText(getApplicationContext(),cChb.getText()+" seçildi", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),cChb.getText()+" iptal edildi", Toast.LENGTH_LONG).show();
                }
            }
        });

        jsChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jsChb.isChecked()){
                    Toast.makeText(getApplicationContext(),jsChb.getText()+" seçildi", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),jsChb.getText()+" iptal edildi", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}