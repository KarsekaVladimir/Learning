package com.example.hw_app;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public Collections(){

    }

    public void ColPratice(){


        //коллекции типа экземпляра класса
        ArrayList<Collections> myList = new ArrayList<Collections>();
        List<Collections> nextList = new ArrayList<Collections>();

       // nextList.add(0, "c"); и так тоже можно добавление элемента по индексу

        //обьект типа коллекции
        Collections s = new Collections();
        Collections b = new Collections();


        Collections c = new Collections();
        Collections d = new Collections();

        //добавления обьекта в коллекцию
        myList.add(s);
        myList.add(b);

        nextList.add(c);
        nextList.add(d);

        //вызов методов коллекции
        int size = myList.size();

        boolean ifIsConsist = myList.contains(s);

        boolean empty = myList.isEmpty();

    }
}
