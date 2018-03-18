package main.stationeries;

import main.IPriced;

public class Ruler implements IPriced {
    private double price;

    public Ruler(double price){
        setPrice(price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            throw new UnsupportedOperationException("Incorrect price value");
        }
    }
}
