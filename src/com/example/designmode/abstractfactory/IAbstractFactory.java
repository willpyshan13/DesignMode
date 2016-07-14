package com.example.designmode.abstractfactory;

public interface IAbstractFactory {
    IButton createButton();

    IText createText();
}
