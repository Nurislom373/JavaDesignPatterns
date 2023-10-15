package org.khasanof.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/14/2023 9:40 PM
 */
public class VehicleFactory {

    private final Map<String, Vehicle> vehicles = new HashMap<>();

    /**
     * To count different types of vehicles
     * in a given moment.
     */
    public int totalObjectsCreated() {
        return vehicles.size();
    }

    public synchronized Vehicle getVehicleFromFactory(String color) throws Exception {
        Vehicle vehicleType = vehicles.get(color);
        if (Objects.nonNull(vehicleType)) {
            System.out.println("\n\t Using an existing vehicle now.");
        } else {
            switch (color) {
                case "car" -> {
                    System.out.println("Making a car for the first time.");
                    vehicleType = new Car("One car is ready");
                    vehicles.put("car", vehicleType);
                }
                case "bus" -> {
                    System.out.println("Making a bus for the first time.");
                    vehicleType = new Bus("One bus is ready");
                    vehicles.put("bus", vehicleType);
                }
                case "future" -> {
                    System.out.println("Making a future vehicle for the first time.");
                    vehicleType = new FutureVehicle("One future vehicle(Vehicle 2050) is ready");
                    vehicles.put("future", vehicleType);
                }
                default -> throw new Exception("Unknown vehicle type.");
            }
        }
        return vehicleType;
    }

}
