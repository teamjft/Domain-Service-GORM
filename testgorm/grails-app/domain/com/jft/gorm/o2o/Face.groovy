package com.jft.gorm.o2o

class Face {

    Long id
    /* owning side is face */
    static hasOne = [nose:Nose]

    static constraints = {
        nose unique: true, nullable: true
    }

    static mapping = {

    }
}
