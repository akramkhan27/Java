package a20marka.animal;

import a20marka.vehicle.Bike;

public class Cat {
    public static void main(String[] args) {
        System.out.println();
        // Activa a1=new Activa(); // can't access outside the package

        // inner can accessable only this way and inner class should be public
        Bike b1=new Bike();
        Bike.Activa ac= b1.new Activa();
    }
}
