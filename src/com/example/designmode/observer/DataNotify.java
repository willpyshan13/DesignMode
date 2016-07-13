package com.example.designmode.observer;

public class DataNotify {
    public static void notifyDataChanged() {
        DataBean bean = new DataBean();
        bean.temp = 100;
        DataObervable.getInstance().notifyDataChange(bean);

        DataObervable.getInstance().addObserver(new DataOberser());
        DataObervable.getInstance().deleteObserver(new DataOberser());
    }
}
