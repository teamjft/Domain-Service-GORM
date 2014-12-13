package com.jft.gorm.o2m



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DeploymentDetailController {

    def scaffold = true
}
