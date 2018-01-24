package com.maxminarray;

public class Mercedes extends CarSpeed {

    @Override
    public String carModel() {
        return "Cls 6.3";
    }

    @Override
    public String carType() {
        return "sedan";
    }

    @Override
    public String carColor() {
        return "Gray";
    }

    @Override
    public double timeOneKM() {
        return km / 130;

    }

}
