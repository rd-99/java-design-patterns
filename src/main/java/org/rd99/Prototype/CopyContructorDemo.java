package org.rd99.Prototype;


class Employee{
    public String name;
    public Address address;
    public Employee(String name , Address address){
        this.name = name;
        this.address = address;
    }
    public Employee(Employee EmployeeToBeCloned){
        this.address = EmployeeToBeCloned.address;
        this.name = EmployeeToBeCloned.name;
    }
}

class Address{
    public String streetAddress , city , country;

    public Address(String streetAddress , String city , String country){
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }
    public Address(Address toBeCloned){
        this.country = toBeCloned.country;
        this.city = toBeCloned.city;
        this.streetAddress = toBeCloned.streetAddress;
    }
    @Override
    public String toString(){
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}

public class CopyContructorDemo{

}