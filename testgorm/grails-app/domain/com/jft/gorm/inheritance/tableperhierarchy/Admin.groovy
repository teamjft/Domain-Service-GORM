package com.jft.gorm.inheritance.tableperhierarchy

class Admin extends User {

    String officeNumber

    static constraints = {
        officeNumber nullable: true
    }
}
