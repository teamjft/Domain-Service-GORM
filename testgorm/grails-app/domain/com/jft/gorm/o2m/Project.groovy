package com.jft.gorm.o2m

class Project {

    String name
    String manager

    static hasMany = [
            developers:Developer,
            deploymentDetails:DeploymentDetail
    ]

    static constraints = {
    }

    String toString(){
        this.name
    }

    static mapping = {
        developers lazy: true
        deploymentDetails lazy: false
    }
}
