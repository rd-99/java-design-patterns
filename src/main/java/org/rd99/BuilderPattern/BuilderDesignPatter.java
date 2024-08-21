package org.rd99.BuilderPattern;

class Person{

    String name;
    String position;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

//allow generic type to be passed to the builder becuase we want to create a builder for person
//Generic type T is the type of the builder itself
class PersonBuilder <T extends PersonBuilder<T>>{
    
        protected Person person = new Person();
    
        public T withName(String name){
            person.name = name;
            return self();
        }
    
        protected T self(){
            return (T) this;
        }
    
        public Person build(){
            return person;
        }
}

class EmployeeBuilder implements PersonBuilder<EmployeeBuilder>{

    public EmployeeBuilder worksAt(String position){
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self(){
        return this;
    }
    
}

class BuilderDesignPattern{
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder();
        Person person = eb.withName("Rahul").worksAt("Developer").build();
        System.out.println(person);
    }
}