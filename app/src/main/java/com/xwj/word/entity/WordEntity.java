package com.xwj.word.entity;

import android.databinding.BaseObservable;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by goldze on 2017/7/17.
 */

public class WordEntity extends BaseObservable implements Parcelable {
    private String id;
    private String word_name;
    private String sex;
    private String Bir;
    private String hobby;
    private Boolean is_CRI;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return word_name;
    }

    public void setName(String name) {
        this.word_name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBir() {
        return Bir;
    }

    public void setBir(String bir) {
        Bir = bir;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public WordEntity() {
    }

    public Boolean getMarry() {
        return is_CRI;
    }

    public void setMarry(Boolean marry) {
        is_CRI = marry;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.word_name);
        dest.writeString(this.sex);
        dest.writeString(this.Bir);
        dest.writeString(this.hobby);
        dest.writeValue(this.is_CRI);
    }

    protected WordEntity(Parcel in) {
        this.id = in.readString();
        this.word_name = in.readString();
        this.sex = in.readString();
        this.Bir = in.readString();
        this.hobby = in.readString();
        this.is_CRI = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Creator<FormEntity> CREATOR = new Creator<FormEntity>() {
        @Override
        public FormEntity createFromParcel(Parcel source) {
            return new FormEntity(source);
        }

        @Override
        public FormEntity[] newArray(int size) {
            return new FormEntity[size];
        }
    };
}

