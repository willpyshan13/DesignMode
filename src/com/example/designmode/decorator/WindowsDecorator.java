package com.example.designmode.decorator;

public abstract class WindowsDecorator implements IWindows {

    private IWindows window;

    public WindowsDecorator(IWindows windows) {
        this.window = windows;
    }

    @Override
    public void draw() {
        window.draw();

    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return window.getDescription();
    }

}
