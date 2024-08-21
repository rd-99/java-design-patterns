package org.rd99.BuilderPattern;

class Person{

    // address
  public String streetAddress, postcode, city;

  // employment
  public String companyName, position;
  public int annualIncome;

  @Override
  public String toString()
  {
    return "Person{" +
      "streetAddress='" + streetAddress + '\'' +
      ", postcode='" + postcode + '\'' +
      ", city='" + city + '\'' +
      ", companyName='" + companyName + '\'' +
      ", position='" + position + '\'' +
      ", annualIncome=" + annualIncome +
      '}';
  }
}

//Person Builder
class PersonBuilder{
     protected Person person = new Person();

     public Person build(){
         return person;
     }

     public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
     }

     public PersonJobBuilder works(){
        return new PersonJobBuilder(person);
     }
}


class PersonAddressBuilder extends PersonBuilder{

    public PersonAddressBuilder(Person person){
        this.person = person;
    }
    protected PersonAddressBuilder withAddress(String streetAddress, String postcode, String city){
        person.streetAddress = streetAddress;
        person.postcode = postcode;
        person.city = city;
        return this;
    }
    PersonAddressBuilder city(String city){
        person.city = city;
        return this;
    }

}

class PersonJobBuilder extends PersonBuilder{

    public PersonJobBuilder(Person person){
        this.person = person;
    }
    PersonJobBuilder at (String companyName){
        person.companyName = companyName;
        return this;
    }
    PersonJobBuilder asA(String position){
        person.position = position;
        return this;
    }
    PersonJobBuilder earning(int annualIncome){
        person.annualIncome = annualIncome;
        return this;
    }
}

class Facets{
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                        .lives()
                            .withAddress("123 London Road", "SW12BC", "London")
                        .works()
                            .at("Fabrikam")
                            .asA("Engineer")
                            .earning(123000)
                        .build();
        System.out.println(person);
    }
}

