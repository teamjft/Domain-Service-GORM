package com.jft.gorm.m2o

class Car {

    String registrationNumber

    Engine engine
    Color color

    static constraints = {
        engine nullable: false
    }
}
