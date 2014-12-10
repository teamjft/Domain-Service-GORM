package com.jft.gorm.m2o


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CarController {

    static scaffold = true
}
