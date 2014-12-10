package com.jft.gorm.o2m

class DeploymentDetail {

    String host
    Integer port

    static belongsTo = [project: Project]

    static constraints = {
    }

    String toString(){
        this.host+':'+this.port
    }
}
