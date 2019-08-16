package com.example.uas;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
   Tanggal Pengerjaan : 12 Agustus 2019
   NIM : 10116155
   Nama : Rr Savira Maulita Risani
   Kelas : AKB-4
   */

public class TemanFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teman, container, false);
        return view;
    }
}