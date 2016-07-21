package com.example.designmode.proxy;

import java.lang.reflect.Method;

public class ProxyA extends ISubjectProxy {

    public ProxyA(Subject subject) {
        super(subject);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }

}
