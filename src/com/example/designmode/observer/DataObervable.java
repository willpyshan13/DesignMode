package com.example.designmode.observer;

import java.util.Observable;

public class DataObervable extends Observable {
    private static volatile DataObervable instance;

    public static DataObervable getInstance() {
        if (instance == null) {
            synchronized (DataObervable.class) {
                if (instance == null) {
                    instance = new DataObervable();
                }
            }
        }
        return instance;
    }

    public void notifyDataChange(DataBean data) {
        setChanged();
        notifyObservers(data);
    }
}
