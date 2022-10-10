package week9;

import week9.measurements.ConstantSensor;
import week9.measurements.Sensor;
import week9.measurements.Thermometer;

public class Ex20 {
    public static void main(String[] args) {
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println( ten.measure() );
        System.out.println( minusFive.measure() );

        System.out.println( ten.isOn() );
        ten.off();
        System.out.println( ten.isOn() );
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
        kumpula.off();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
    }
}