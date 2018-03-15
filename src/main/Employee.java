package main;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int employeeID;
    private static List<IPriced> stationeries = new ArrayList<>();

    public Employee(int employeeID){
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getStationeriesSize(){
        return stationeries.size();
    }

    public IPriced getStationery(int index){
        return stationeries.get(index);
    }

    public Employee addNew(IPriced stationery){
        stationeries.add(stationery);
        return this;
    }

    public double getWholeAmount(){
        double wholeAmount = 0;
        for(IPriced stationary : stationeries) {
            wholeAmount += stationary.getPrice();
        }
        return (double)Math.round(wholeAmount * 100d) / 100d;
    }
}
