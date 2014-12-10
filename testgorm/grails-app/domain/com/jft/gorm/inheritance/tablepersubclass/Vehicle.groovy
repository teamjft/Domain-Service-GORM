package com.jft.gorm.inheritance.tablepersubclass

class Vehicle {

    String registrationNumber

    static constraints = {
    }

    static mapping = {
        tablePerSubclass(true)
    }
}
