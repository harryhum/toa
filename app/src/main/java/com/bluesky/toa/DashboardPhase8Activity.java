package com.bluesky.toa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bluesky.toa.activities.DashBoardActivity;
import com.bluesky.toa.activities.FanProfileActivity;
import com.bluesky.toa.activities.HomePageActivity;
import com.bluesky.toa.activities.PastProjectActivity;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardPhase8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_phase8);

        Button projectDasboardBtn1 = findViewById(R.id.imageButton8_pdb_jj);

        Button projectDasboardBtnEPF = findViewById(R.id.imageButton_edit_profile_pdb_jj);
        Button projectDasboardBtnHP = findViewById(R.id.imageButton_home_page_pdb_jj);
        Button projectDasboardBtnVPP = findViewById(R.id.imageButton_view_past_project_pdb_jj);

        projectDasboardBtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(DashboardPhase8Activity.this, DashBoardActivity.class);
                startActivity(intent);
            }
        });

        projectDasboardBtnEPF.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(DashboardPhase8Activity.this, FanProfileActivity.class);
                startActivity(intent);
            }
        });

        projectDasboardBtnHP.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(DashboardPhase8Activity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        projectDasboardBtnVPP.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(DashboardPhase8Activity.this, PastProjectActivity.class);
                startActivity(intent);
            }
        });
    }
}
