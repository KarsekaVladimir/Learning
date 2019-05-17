package com.example.hw_app;

public class Mass extends Animal  {

    public void fun() {
 //массив примитивов
        int[] mass = new int[10];
        mass[0]=10;
//массив обьектов
        Animal[] pet = new Animal[10];
        pet[1].size=15;
        System.out.println(pet[1]);
    }
}
