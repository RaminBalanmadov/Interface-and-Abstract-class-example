package com.maxminarray;

public class Result {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println("BMW-nin modeli :" + bmw.carModel());
        System.out.println("BMW-nin tipi :" + bmw.carType());
        System.out.println("BMW-nin rengi :" + bmw.carColor());
        System.out.println("BMW-nin 1 km-i getdiyi zaman :" + bmw.timeOneKM()+" deq");
        
        System.out.println("***************************************************");
       
        Mercedes mercedes = new Mercedes();
        System.out.println("Mercedes-nin modeli :" + mercedes.carModel());
        System.out.println("Mercedes-nin tipi :" + mercedes.carType());
        System.out.println("Mercedes-nin rengi :" + mercedes.carColor());
        System.out.println("Mercedes-nin 1 km-i getdiyi zaman :" + mercedes.timeOneKM()+" deq");
        System.out.println("***************************************************");
        
        Toyota toyota = new Toyota();
        System.out.println("Toyota-nin modeli :" + toyota.carModel());
        System.out.println("Toyota-nin tipi :" + toyota.carType());
        System.out.println("Toyota-nin rengi :" + toyota.carColor());
        System.out.println("Toyota-nin 1 km-i getdiyi zaman :" + toyota.timeOneKM()+" deq");
        
        
    }
}
