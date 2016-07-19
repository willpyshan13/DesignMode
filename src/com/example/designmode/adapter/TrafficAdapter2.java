package com.example.designmode.adapter;

public class TrafficAdapter2 implements ITakeTaxi {
    TakeBus takebud;

    public TrafficAdapter2(TakeBus takeBus) {
        this.takebud = takeBus;
    }

    public String takeBus() {
        return takebud.takeBus();
    }

    @Override
    public String takeTaxi() {
        // TODO Auto-generated method stub
        return "take taxi";
    }

}
