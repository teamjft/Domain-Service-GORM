package com.jft.gorm.inheritance.tableperhierarchy

class User {

    String firstName
    String lastName
    
    static constraints = {

    }

    static mapping = {
        tablePerHierarchy(true)
    }
}
