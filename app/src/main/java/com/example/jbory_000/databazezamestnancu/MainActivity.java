package com.example.jbory_000.databazezamestnancu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vyberMenu(View view) {
        switch (view.getId()) {
            case R.id.btnZamestnanci:
                //prechod na aktivitu zamestnanci
                Intent intent = new Intent(getApplicationContext(), ZamestnanciListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnProjekty:
                //prechod na aktivitu zamestnanci
                intent = new Intent(getApplicationContext(), ProjektyListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnOAplikaci:
                //prechod na aktivitu zamestnanci
                intent = new Intent(getApplicationContext(), OAplikaci.class);
                startActivity(intent);
                break;
        }
    }
}
