package com.example.designmode.observer;

import java.util.Observable;
import java.util.Observer;

import android.util.Log;

//通过java api的方式实现的 观察者模式
public class DataOberser implements Observer {

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof DataObervable) {
            Log.d("", "DataOberser update");
        }
    }

}
