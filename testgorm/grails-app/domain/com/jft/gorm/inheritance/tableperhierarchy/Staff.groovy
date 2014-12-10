package com.jft.gorm.inheritance.tableperhierarchy

class Staff extends User {

    String cubicalNumber

    static constraints = {
        cubicalNumber nullable: true
    }
}
