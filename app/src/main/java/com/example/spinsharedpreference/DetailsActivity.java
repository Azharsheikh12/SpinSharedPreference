package com.example.spinsharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    SharedPreferences prf;
    Intent intent;
String cnma;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        TextView result = (TextView) findViewById(R.id.resultview);
        Button btnLogOut = (Button) findViewById(R.id.btnLogOut);
        prf = getSharedPreferences("cname",MODE_PRIVATE);



//        intent = new Intent(DetailsActivity.this,MainActivity.class);
//        startActivity(intent);
       // result.setText("Hello,"+prf.getString("spinner",null));

//        btnLogOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences.Editor editor = prf.edit();
//                editor.clear();
//                editor.apply();
//                startActivity(intent);
//            }
//        });

    }
}
