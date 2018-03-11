package main;

import main.stationeries.Marker;
import main.stationeries.Pen;
import main.stationeries.Pencil;
import main.stationeries.Ruler;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int employeeID;

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee(int employeeID){
        this.employeeID = employeeID;
    }

    private static List<IStationery> stationeries = new ArrayList<>();

    public int getStationeriesSize(){
        return stationeries.size();
    }

    public IStationery getStationery(int index){
        return stationeries.get(index);
    }

    public Employee addNew(IStationery stationery){
        stationeries.add(stationery);
        return this;
    }

    public double getWholeAmount(){
        double wholeAmount = 0;
        for(IStationery stationary : stationeries) {
            wholeAmount += stationary.getPrice();
        }
        return (double)Math.round(wholeAmount * 100d) / 100d;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(32);
        Employee employee2 = new Employee(158);
        Employee employee3 = new Employee(284);

        System.out.println("The whole amount of stationary employee with id " + employee1.employeeID
                + ": "+ employee1.addNew(new Pen(234.4)).addNew(new Pencil(32.5)).addNew(new Marker(210.5))
                .addNew(new Ruler(32.5)).getWholeAmount() + " rub");

        System.out.println("The whole amount of stationary employee with id " + employee2.employeeID
                + ": "+ employee2.addNew(new Pen(12.8)).addNew(new Pen(167.3)).addNew(new Marker(196.1))
                .addNew(new Pencil(62.0)).getWholeAmount() + " rub");

        System.out.println("The whole amount of stationary employee with id " + employee3.employeeID
                + ": "+ employee3.addNew(new Pencil(34.2)).addNew(new Pen(264.3)).addNew(new Marker(365.2))
                .addNew(new Pen(1093.0)).getWholeAmount() + " rub");


    }
}
