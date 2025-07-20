public class Cardetails {
    // Instance variables
    String engineType;
    int displacement;
    String maxPower;
    String maxTorque;
    byte numberOfCylinders;
    byte valvesPerCylinder;
    String fuelSupplySystem;
    boolean turboCharger;
    String transmissionType;
    String gearbox;
    String driveType;

    public static void main(String[] args) {
        // Local variables
        String engineType = "mHAWK 4 Cylinder";
        int displacement = 2184;
        String maxPower = "130bhp@3750rpm";
        String maxTorque = "300Nm@1600-2800rpm";
        byte numberOfCylinders = 4;
        byte valvesPerCylinder = 4;
        String fuelSupplySystem = "CRDi";
        boolean turboCharger = true;
        String transmissionType = "Manual";
        String gearbox = "6-Speed";
        String driveType = "RWD";

        System.out.println("Engine Type: " + engineType);
        System.out.println("Displacement: " + displacement);
        System.out.println("Max Power: " + maxPower);
        System.out.println("Max Torque: " + maxTorque);
        System.out.println("No. of Cylinders: " + numberOfCylinders);
        System.out.println("Valves Per Cylinder: " + valvesPerCylinder);
        System.out.println("Fuel Supply System: " + fuelSupplySystem);
        System.out.println("Turbo Charger: " + turboCharger);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Gearbox: " + gearbox);
        System.out.println("Drive Type: " + driveType);
    }
}
