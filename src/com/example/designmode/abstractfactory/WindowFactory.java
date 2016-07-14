package com.example.designmode.abstractfactory;

public class WindowFactory implements IAbstractFactory {

    @Override
    public IButton createButton() {
        // TODO Auto-generated method stub
        return new WindowButton();
    }

    @Override
    public IText createText() {
        // TODO Auto-generated method stub
        return new WindowText();
    }

}
