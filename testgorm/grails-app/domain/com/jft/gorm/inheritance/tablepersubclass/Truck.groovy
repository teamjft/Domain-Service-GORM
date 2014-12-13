package com.jft.gorm.inheritance.tablepersubclass

class Truck extends Vehicle{

    Double floorArea
    String fuelType
    String transmission
    Boolean abs
    Boolean hood

    static constraints = {
    }
}
