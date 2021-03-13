package edu.hamdard.android.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private Button loginId;
    private Button logoutId;
    private TextView textviewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginId = (Button) findViewById(R.id.loginId);
        logoutId = (Button) findViewById(R.id.logout);
        textviewId=(TextView)findViewById(R.id.textviewId);



    }
    class handler implements View.OnClickListener{


        @Override
        public void onClick(@org.jetbrains.annotations.NotNull View v) {
            if (v.getId()==R.id.loginId){
                Toast.makeText(MainActivity.this,"Login Button is Clicked",Toast.LENGTH_SHORT).show();
            }
            if (v.getId()==R.id.logout){
                Toast.makeText(MainActivity.this,"Logout Button is Clicked",Toast.LENGTH_SHORT).show();
            }
        }
    }


}