package com.jft.gorm

import com.jft.gorm.o2m.Project
import grails.transaction.Transactional
import grails.util.Holders

class ProjectService {

    @Transactional
    def transactionImproper() {

        Project project = new Project(name: 'PROXX').save()
        project.name='PROYY'
        project.save()

        throw new Exception('Exception')

        project.name='PROZZ'
        project.save()
    }

    @Transactional
    def transactionProper() {

        Project project = new Project(name: 'PROAA').save()
        project.name='PROBB'
        project.save()

        throw new RuntimeException('RuntimeException Exception ')

        project.name='PROCC'
        project.save()

    }
}
