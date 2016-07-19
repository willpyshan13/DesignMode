package com.example.designmode.decorator;

import android.util.Log;

public class HorizontalScrollBarDecorator extends WindowsDecorator {

    public HorizontalScrollBarDecorator(IWindows windows) {
        super(windows);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        super.draw();
        Log.e("", "horizontal");
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription() + " with horizontal";
    }

}
