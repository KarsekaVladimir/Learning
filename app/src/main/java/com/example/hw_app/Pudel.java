package com.example.hw_app;

public class Pudel extends Dog implements Inter {

    Pudel obj = new Pudel();
    public Pudel(){

    }

    @Override
    public void test_bark() {
        super.test_bark();
        if (size>15){
            System.out.print(">15");
        }
        else if (size<3){

            System.out.print("<3");
        }
    }

    public void test_bark(int s_size){
        this.test_bark();
    }

    //имплементация интерфейсов
    public void walk(){
        obj.size = 15;
        obj.name = 1;
    }


   public void sleap(){

   }
}
