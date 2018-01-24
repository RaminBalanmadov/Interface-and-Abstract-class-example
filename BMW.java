package com.maxminarray;

public class BMW extends CarSpeed {

    @Override
    public String carModel() {
        return "X6";
    }

    @Override
    public String carType() {
        return "jeep";
    }

    @Override
    public String carColor() {
        return "Black";
    }

    @Override
    public double timeOneKM() {
        return km / 150;
    }

}
