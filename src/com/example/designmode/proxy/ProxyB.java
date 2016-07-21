package com.example.designmode.proxy;

import java.lang.reflect.Method;

public class ProxyB extends ISubjectProxy {

    public ProxyB(Subject subject) {
        super(subject);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }

}
