package main.java;

public class Person implements Greeter {
    protected String firstName;
    protected String lastName;
    public Person(String firstName, String lastName) throws IllegalArgumentException{
        try {
            this.firstName = firstName;
            this.lastName = lastName;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Could not create Person");
        }
    }
    public String sayHello(){
        return "Hello from "+firstName+" "+lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
