package com.hafizcode.learning.submissionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSchool;
    private ArrayList<School> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSchool = findViewById(R.id.rv_sekolah);
        rvSchool.setHasFixedSize(true);

        list.addAll(SchoolData.getSchoolData());
        showListData();

    }

    private void showListData() {
        rvSchool.setLayoutManager(new LinearLayoutManager(this));
        SchoolAdapter schoolAdapter = new SchoolAdapter(list, getApplicationContext());
        rvSchool.setAdapter(schoolAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int SelectedMode) {
        switch (SelectedMode) {
            case R.id.dev_detail:
                Intent intent = new Intent(MainActivity.this, DevDetail.class);
                startActivity(intent);
                break;
        }
    }
}
