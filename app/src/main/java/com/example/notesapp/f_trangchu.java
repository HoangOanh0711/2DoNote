package com.example.notesapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class f_trangchu extends Fragment {

    private ImageView btn_ThemNote;

    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState) {
        View v= inflater.inflate(R.layout.fragment_f_trangchu, container, false);

        btn_ThemNote = (ImageView) v.findViewById(R.id.image_addbutton);
        btn_ThemNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ghichu.class);
                startActivity(intent);
            }
        });
        return v;
    }
}