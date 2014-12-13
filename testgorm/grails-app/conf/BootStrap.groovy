import com.jft.gorm.inheritance.tablepersubclass.Bike
import com.jft.gorm.inheritance.tablepersubclass.Truck
import com.jft.gorm.inheritance.tableperhierarchy.Admin
import com.jft.gorm.inheritance.tableperhierarchy.Staff
import com.jft.gorm.m2m.Product
import com.jft.gorm.m2o.Car
import com.jft.gorm.m2o.Color
import com.jft.gorm.o2m.DeploymentDetail
import com.jft.gorm.o2m.Developer
import com.jft.gorm.o2m.Project
import com.jft.gorm.m2m.Category

class BootStrap {

    def init = { servletContext ->

        ['RED','GREEN','BLACK'].each {
            new Color(colorName: it).save(flush: true, failOnError: true)
        }
        
        ['PRO1','PRO2','PRO3'].each {
            new Project(name: it).save(flush: true, failOnError: true)
        }
        
        Project project
        DeploymentDetail deploymentDetail
        
        Developer praveen = new Developer(firstName: 'Praveen')
        
        project = Project.findByName('PRO1')
        if(project){
            Developer dev1 = new Developer(firstName: 'Manish')
            Developer dev3 = new Developer(firstName: 'Anand')

            project.addToDevelopers(dev1)
            project.addToDevelopers(praveen)
            project.addToDevelopers(dev3)

            deploymentDetail = new DeploymentDetail(host: 'localhost', port: 8080)
            project.addToDeploymentDetails(deploymentDetail)
            project.save().save(flush: true, failOnError: true)
        }
        project = Project.findByName('PRO2')
        if(project){
            Developer dev1 = new Developer(firstName: 'Aman')
            Developer dev2 = new Developer(firstName: 'Neeraj')
            Developer dev3 = new Developer(firstName: 'Vivek')

            project.addToDevelopers(dev1)
            project.addToDevelopers(dev2)
            project.addToDevelopers(dev3)

            deploymentDetail = new DeploymentDetail(host: 'localhost', port: 8181)
            project.addToDeploymentDetails(deploymentDetail)
            project.save().save(flush: true, failOnError: true)
        }
        project = Project.findByName('PRO3')
        if(project){
            Developer dev1 = new Developer(firstName: 'Abdullah')
            Developer dev2 = new Developer(firstName: 'Tinku')

            project.addToDevelopers(dev1)
            project.addToDevelopers(dev2)
            project.addToDevelopers(praveen)

            deploymentDetail = new DeploymentDetail(host: 'localhost', port: 8282)
            project.addToDeploymentDetails(deploymentDetail)
            project.save().save(flush: true, failOnError: true)
        }

        Category electronics = new Category(name: 'electronics').save()
        Category laptop = new Category(name: 'laptop').save()

        Product dellLaptop = new Product(productCode: 'inspiron1525')
        electronics.addToProducts(dellLaptop)
        laptop.addToProducts(dellLaptop)

        electronics.save()
        laptop.save()

        Admin admin = new Admin(firstName: 'Yatin', lastName: 'Makkad', officeNumber: '123').save()
        Staff staff = new Staff(firstName: 'Vaibhav', lastName: 'Sharma', cubicalNumber: '222').save()

        Bike bike = new Bike(registrationNumber: 'DLXXXXXX', sideStand: true, handleType: 'split').save()
        Truck truck = new Truck(registrationNumber: 'DLYYYYY', floorArea: 200,abs: true, fuelType: 'diesel', transmission: 'manual', hood: true).save()
    }

    def destroy = {
    }
}
