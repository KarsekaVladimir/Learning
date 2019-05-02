package com.example.hw_app;

public class Pudel extends Dog {

    public Pudel(){

    }

    @Override
    public void Test_Bark() {
        super.Test_Bark();
        if (size>15){
            System.out.print(">15");
        }
        else if (size<3){

            System.out.print("<3");
        }
    }

    public void Test_Bark(int s_size){
        this.Test_Bark();
    }
}
