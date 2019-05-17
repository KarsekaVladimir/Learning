package com.example.hw_app;

import android.graphics.Color;

public  class Dog  {

//пустой конструктор
    public Dog(){

    }
// обьявленеи примитивов
    int size;
    int name;
    private int type;

//getter for variables size
   int getType(){
        return type;
    }

//setter for variables size
    void setType(int typeA){
       size=typeA;
    }


//класс лая без параметра
    public void bark(){
        if(size >60){
            System.out.print("1");
        }
        else if (size>14){
            System.out.print("2");
        }
        else if (size>7){
            System.out.print("3");
        }

    }
//класс лая с передачей параметра
    public  void BarkPar(int quan, int xyan){
        if (quan<5 && xyan>5) {
            System.out.print("1");
        }
    }
//обьявление экземпляров класса
    Dog small = new Dog();
    Dog midle = new Dog();
    Dog big = new Dog();

//процедура для работы
    public void test_bark(){
        small.size = 5;
        small.bark();

        midle.size= 15;
        midle.bark();

        big.size = 65;
        big.bark();
//
        big.BarkPar(5, 6);

//use getter and setter for size

        big.setType(15);
        big.getType();

    }


}








