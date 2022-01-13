package com.havefun.kotlincode.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.havefun.kotlincode.BR;

public class User extends BaseObservable {

    private String name;
    private String age;


    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
