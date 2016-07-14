package com.example.designmode.abstractfactory;

public class MacFactory implements IAbstractFactory {

    @Override
    public IButton createButton() {
        // TODO Auto-generated method stub
        return new MacButton();
    }

    @Override
    public IText createText() {
        // TODO Auto-generated method stub
        return new MacText();
    }

}
