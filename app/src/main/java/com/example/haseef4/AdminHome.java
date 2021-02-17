package com.example.haseef4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_staff);

        ImageView staff=findViewById(R.id.staff);
        ImageView staff_icons=findViewById(R.id.staff_icons);

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             goTostaff();
         }
    });
      staff_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTostaff();
            }
        });
    }
   private void goTostaff(){
       Intent intent = new Intent(this, staff1.class);
       startActivity(intent);
    }

    }


