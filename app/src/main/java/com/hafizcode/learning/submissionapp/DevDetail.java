package com.hafizcode.learning.submissionapp;

import android.app.ActionBar;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DevDetail extends AppCompatActivity {
    private ImageView imgMe, imgGithub, imgFB, imgWA;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dev_detail_layout);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setSubtitle("Creator");
        }

        imgMe = findViewById(R.id.img_item_my);
        imgGithub = findViewById(R.id.githubicon);
        imgFB = findViewById(R.id.facebook);
        imgWA = findViewById(R.id.whatsapp);

        Glide.with(this.getApplicationContext()).load(R.drawable.hafiz).apply(new RequestOptions().override(600,600)).into(imgMe);
        Glide.with(this.getApplicationContext()).load(R.drawable.github).apply(new RequestOptions()).into(imgGithub);
        Glide.with(this.getApplicationContext()).load(R.drawable.fb).apply(new RequestOptions()).into(imgFB);
        Glide.with(this.getApplicationContext()).load(R.drawable.wa).apply(new RequestOptions()).into(imgWA);

        imgWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+6285321349681";
                String Message = "Hallo Hafiz Saya Punya Saran Untuk Anda : ";
                String URL = "https://api.whatsapp.com/send?phone='" + phoneNumber + "' &text=" + Message + "";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(URL));
                startActivity(i);
            }
        });

        imgGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String URL = "https://github.com/hafizcode02";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(i);
            }
        });

        imgFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookID = "codehafiz02";
                String facebookURL = "https://www.facebook.com/" + facebookID;
                String facebookUrlSceme = "fb://page/" + facebookID;
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookURL);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    } else {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrlSceme)));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookURL)));
                }
            }
        });

    }

}
