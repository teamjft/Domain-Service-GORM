package com.jft.gorm.m2m

class Product {

    String productCode

    static belongsTo = Category

    static hasMany = [categories:Category]

    static constraints = {
    }
}
