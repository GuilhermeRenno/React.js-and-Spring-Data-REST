package com.greglturnquist.payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //(1)anotação JPA que denota a classe inteira para armazenamento em uma tabela relacional.
public class Employee {
    private @Id @GeneratedValue Long id;/*  (2) são anotações JPA para anotar a chave primária e que é gerada automaticamente quando necessário.
    Essa entidade é usada para rastrear informações de funcionários — neste caso, seus nomes e descrições de cargos. */
    private String firstName;
    private String lastName;
    private String description;

    public Employee(){}

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
            return Objects.equals(o, employee.id) &&
                    Objects.equals(o, employee.firstName) &&
                    Objects.equals(o, employee.lastName) &&
                    Objects.equals(o, employee.description);
    }
    
    @Override
    public int hashCode(){

        return Objects.hash(id,firstName,lastName,description);
    } 

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;

    }

    public String getLastName(){

        return lastName;
    }

    public void setLastName(String lastName){

        this.lastName=lastName;
    }

    public String getDescription(){

        return description;
    }

    public void setDescription(String description){

        this.description=description;
    }
    
    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", firstName=" + firstName +'\'' +
                ", lastName=" + lastName + '\'' + 
                ", description=" + description + '\'' +

                '}';

    }

}
