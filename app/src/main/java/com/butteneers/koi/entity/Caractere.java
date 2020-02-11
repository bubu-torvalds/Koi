package com.butteneers.koi.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Caractere {

    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "sound")
    private String sound;
    @ColumnInfo(name = "hiragana")
    private String hiragana;
    @ColumnInfo(name = "katakana")
    private String katakana;


    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana;
    }
}
