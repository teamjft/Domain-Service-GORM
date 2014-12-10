package com.jft.gorm.m2m

class Category {

    String name

    static hasMany = [products:Product]

    static constraints = {
    }
}
