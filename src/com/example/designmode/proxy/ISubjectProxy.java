package com.example.designmode.proxy;

import java.lang.reflect.InvocationHandler;

public abstract class ISubjectProxy implements InvocationHandler {

    protected Subject subject;

    public ISubjectProxy(Subject subject) {
        this.subject = subject;
    }
}
