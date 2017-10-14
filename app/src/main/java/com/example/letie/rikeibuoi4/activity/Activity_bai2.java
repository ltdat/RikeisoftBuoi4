package com.example.letie.rikeibuoi4.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.letie.rikeibuoi4.R;

import java.util.Locale;

public class Activity_bai2 extends AppCompatActivity {


    private Button btnEnglish;
    private Button btnJapanese;
    private Button btnRussian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        btnEnglish=(Button)findViewById(R.id.btnEnglish);
        btnJapanese=(Button)findViewById(R.id.btnJapanese);
        btnRussian=(Button)findViewById(R.id.btnRussian);

        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ganNgonNgu("en");
            }
        });
        btnJapanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ganNgonNgu("ja");
            }
        });
        btnRussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ganNgonNgu("ru");
            }
        });
    }


    public void ganNgonNgu(String language){
        Locale locale = new Locale(language);
        Configuration config= new Configuration();
        config.locale=locale;
        getBaseContext().getResources().updateConfiguration(
                config,
                getBaseContext().getResources().getDisplayMetrics()
        );
        Intent intent = new Intent(Activity_bai2.this,Activity_bai2.class);
        startActivity(intent);
    }
}
