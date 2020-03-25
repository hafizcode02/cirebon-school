package com.hafizcode.learning.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class SchoolDetail extends AppCompatActivity {

    public static final String namaSekolah = "namaSekolah";
    public static final String alamatSekolah = "alamatSekolah";
    public static final String emailSekolah = "emailSekolah";
    public static final String telpSekolah = "telpSekolah";
    public static final String visiSekolah = "visiSekolah";
    public static final String webSekolah = "webSekolah";
    public static final String photoSekolah = "photoSekolah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setSubtitle("School Detail");
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nama = intent.getStringExtra(namaSekolah);
        String alamat = intent.getStringExtra(alamatSekolah);
        String email = intent.getStringExtra(emailSekolah);
        String telp = intent.getStringExtra(telpSekolah);
        String visi = intent.getStringExtra(visiSekolah);
        String web = intent.getStringExtra(webSekolah);
        int picture = bundle.getInt(photoSekolah);


        TextView nSekolah = findViewById(R.id.school_name);
        TextView aSekolah = findViewById(R.id.school_address);
        TextView dSekolah = findViewById(R.id.school_detvis);
        TextView kSekolah = findViewById(R.id.identity_1);
        ImageView imgSchool = findViewById(R.id.img_item_school_detail);

        nSekolah.setText(nama);
        aSekolah.setText(alamat);
        dSekolah.setText(visi);
        kSekolah.setText(telp + "\n" + email + "\n" + web);

        Glide.with(getApplicationContext()).load(picture).apply(new RequestOptions().override(400, 400)).into(imgSchool);
    }
}
