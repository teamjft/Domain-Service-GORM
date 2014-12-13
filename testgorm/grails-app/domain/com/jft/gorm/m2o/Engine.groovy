package com.jft.gorm.m2o

class Engine {

    String number

    static belongsTo = [car:Car]

    static constraints = {
        car nullable: true, unique: true // remove this unique constraint then their would not be any strong constraint reporting when we try to set multiple parent
    }
}
