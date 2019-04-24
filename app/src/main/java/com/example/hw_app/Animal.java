package com.example.hw_app;

public class Animal {
    String kind, color;
    int size, high;
    int lengs;
    boolean Availability;



    //конструктор 1
    public Animal(String kind, int size, int lengs, boolean Availability) {
        kind = "Dog";
        size = 15;
        Availability = true;
        lengs = 14;
    }

    //конструктор 2
    public Animal(String color, int high) {
        color = "Dog";
        high = 15;

    }

    //конструктор 3
    public Animal(Integer amount) {
        amount = 2;
    }

    //функция выводящая на печать значение переменных по дэфолту
    public void print() {
        lengs = lengs + size;
        System.out.println(kind);
        System.out.println(size);
        System.out.println(Availability);



    }

//создание 2х экземпляров класса в соответсвии с конструктором
    Animal ket = new Animal("red", 15);

    Animal ketF = new Animal("ket", 12, 45, true);

    Animal MyKat = new Animal(5);

    public Animal getKet() {
        return ket;
    }

    public Animal getKetF() {
        return ketF;
    }

    public void Action() {

        System.out.println("sasdasd");

    }

    //треинровка с гетер-сеттер
    public String getColor(String Color) {
        return Color;
    }

    public void  setColor(String Color){

        this.color=color;
    }
}


