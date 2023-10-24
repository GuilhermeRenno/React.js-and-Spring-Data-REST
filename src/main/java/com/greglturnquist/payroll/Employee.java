package com.greglturnquist.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity (1)
public class Employee {
    private @Id @GeneratedValue Long id; (2)
    private String firstName;
    private String lastName;
    private String description;

    private Employee(){}

    public Employee(String firstName,String lastName,String description){

        this.firstName=firstName;
        this.lastName=lastName;
        this.description=description;

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
         if(o == null || getClass() !=o.getClass()) return false;
         Employee employee =(Employee) o;

    }


}
