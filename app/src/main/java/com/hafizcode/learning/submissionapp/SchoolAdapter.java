package com.hafizcode.learning.submissionapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ListViewHolder> {
    private ArrayList<School> listSchool;
    private Context mContext;

    public SchoolAdapter(ArrayList<School> list, Context con) {
        this.listSchool = list;
        mContext = con;
    }


    @NonNull
    @Override
    public SchoolAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final School school = listSchool.get(position);
        Glide.with(holder.itemView.getContext()).load(school.getPhotoSekolah()).apply(new RequestOptions().override(250, 250)).into(holder.imgPhoto);
        holder.tvSchoolName.setText(school.getNamaSekolah());
        holder.tvSchoolWebsite.setText(school.getWebSekolah());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Contoh perpindahan Menggunakan Context
//                mContext.startActivity(new Intent(mContext, SchoolDetail.class));
                int photoSchool = 0;
                Intent intent = new Intent(mContext, SchoolDetail.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(SchoolDetail.namaSekolah, school.getNamaSekolah());
                intent.putExtra(SchoolDetail.alamatSekolah, school.getAlamatSekolah());
                intent.putExtra(SchoolDetail.emailSekolah, school.getEmailSekolah());
                intent.putExtra(SchoolDetail.telpSekolah, school.getTelpSekolah());
                intent.putExtra(SchoolDetail.webSekolah, school.getWebSekolah());
                intent.putExtra(SchoolDetail.visiSekolah, school.getVisiSekolah());
                intent.putExtra(SchoolDetail.photoSekolah, school.getPhotoSekolah());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSchool.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvSchoolName, tvSchoolWebsite;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_school);
            tvSchoolName = itemView.findViewById(R.id.school_name);
            tvSchoolWebsite = itemView.findViewById(R.id.school_detail);
        }
    }
}
