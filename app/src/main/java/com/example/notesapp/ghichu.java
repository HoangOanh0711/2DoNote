package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ghichu extends AppCompatActivity {

    private EditText txtTieuDe, txtGhiChu;
    private TextView txtNgayGio;
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghichu);

        txtTieuDe = findViewById(R.id.input_title);
        txtGhiChu = findViewById(R.id.input_text);

        //sự kiện ngày giờ ở header
        txtNgayGio = findViewById(R.id.txt_datetime);
        txtNgayGio.setText(
                new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm a", Locale.getDefault())
                        .format(new Date())
        );

        //sự kiện nút quay lại
        btnBack = findViewById(R.id.image_back);

    }

}