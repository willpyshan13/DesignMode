package com.example.designmode;

import java.lang.reflect.Proxy;

import com.example.designmode.abstractfactory.MacFactory;
import com.example.designmode.builder.Computer;
import com.example.designmode.factory.IAnimalCreator;
import com.example.designmode.factory.IAnimalCreator2;
import com.example.designmode.factory.Monkey;
import com.example.designmode.factory.MonkeyCreator;
import com.example.designmode.proxy.ISubjectProxy;
import com.example.designmode.proxy.ProxyA;
import com.example.designmode.proxy.RealSubject;
import com.example.designmode.proxy.Subject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
    IAnimalCreator animalCreator;
    IAnimalCreator2 animalCreator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalCreator = new MonkeyCreator();
        animalCreator.createAnimal();

        animalCreator2.createAnimal(Monkey.class);

        MacFactory macFactory = new MacFactory();
        macFactory.createButton().show();
        macFactory.createText().show();

        Subject subject = new RealSubject();
        ISubjectProxy proxy = new ProxyA(subject);
        Subject subject2 = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), proxy);

        subject2.operationA();
        subject2.operationB();

        Computer computer = new Computer.Builder().setCPU("inter-skylake-i7").setGPU("GTX-Titan")
                .setMemoryType("ddr4-2133MHz").setMemorySize(16).setStorageType("ssd").setStorageSize(512)
                .setScreenType("IPS").setScreenSize(28).setOSType("Ubuntu/Window10").create();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
