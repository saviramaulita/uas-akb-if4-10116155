package com.example.uas;

/*
   Tanggal Pengerjaan : 12 Agustus 2019
   NIM : 10116155
   Nama : Rr Savira Maulita Risani
   Kelas : AKB-4
   */

public class ScreenItem {

    String Title,Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
