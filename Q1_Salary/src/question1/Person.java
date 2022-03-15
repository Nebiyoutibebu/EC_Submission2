package question1;

public class Person {

    private String name;
    private String gender;
    private double salary;

    public Person( String name, String gender,double salary) {

        super();

        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getGender() {
        return gender;
    }

}