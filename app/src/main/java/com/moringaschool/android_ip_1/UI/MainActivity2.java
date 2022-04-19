package com.moringaschool.android_ip_1.UI;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.android_ip_1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.homeBtn) LinearLayout homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        homeBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this, WelcomeActivity.class);
                startActivity(intent);
            }

        });

        //get data passed from MainActivity
        Intent intent = getIntent();
        String inputUserName = intent.getStringExtra("inputUserName");

        Log.d("MainActivity2", "In the onCreate method!");

        String.format("Welcome back, Kiongoss %s", inputUserName);
        Toast.makeText(MainActivity2.this, inputUserName, Toast.LENGTH_LONG).show();

    }

}