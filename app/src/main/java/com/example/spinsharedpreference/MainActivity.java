package com.example.spinsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spinsharedpreference.DetailsActivity;
import com.example.spinsharedpreference.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country = {"Select country","India", "USA", "China", "Japan", "Other"};


    EditText uname, pwd;
    Button btnlogin;
    Intent intent;
    SharedPreferences pref;
    Spinner spin;
    String cname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        btnlogin = (Button) findViewById(R.id.Loginbutton);
        pref = getSharedPreferences("user details", MODE_PRIVATE);
//        intent = new Intent(MainActivity.this, DetailsActivity.class);
//        startActivity(intent);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        if (cname.equals("Select country")) {

            Toast.makeText(this, "please select country", Toast.LENGTH_SHORT).show();
        } else {
            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intent = new Intent(MainActivity.this, DetailsActivity.class);
                    startActivity(intent);

                }
            });
        }

    }
//    public Spinner getSpin() {
//        return spin;
//    }
//        L.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String username = uname.getText().toString();
//                String password = pwd.getText().toString();
//
//                if (username.equals("azhar")&& password.equals("sheikh")){
//                    SharedPreferences.Editor editor = pref.edit();
//                    editor.putString("username",username);
//                    editor.putString("password",password);
//                    editor.apply();
//        Toast.makeText(getApplicationContext(), "Login Succesful", Toast.LENGTH_SHORT).show();
//        startActivity(intent);
//        }
//                else {
//                    Toast.makeText(getApplicationContext(),"Credentials are not Valid",Toast.LENGTH_SHORT).show();
//                }
//            }
//            }
//        });

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();
        cname = country[position];
        SharedPreferences.Editor editor = pref.edit();
                    editor.putString("cname",cname);
                    editor.apply();
       Toast.makeText(getApplicationContext(), "Add Succesful", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

