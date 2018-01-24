package com.maxminarray;

public class Toyota extends CarSpeed {

    @Override
    public String carModel() {
        return "Land Gruser";
    }

    @Override
    public String carType() {
        return "jeep";
    }

    @Override
    public String carColor() {
        return "White";
    }

    @Override
    public double timeOneKM() {
        return km / 110;
    }

}
