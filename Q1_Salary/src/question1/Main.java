package question1;
import java.util.*;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) {
        List< Person > Persons = Arrays.asList(

                new Person("Mendez", "male",20000),
                new Person("Jane","female" ,36000),
                new Person("Ben","male" ,14000),
                new Person("Ana","female", 22000),
                new Person("Tim","male" ,18000),
                new Person("Tina","female" ,46000),
                new Person("Mark","male" ,2000),
                new Person("Marry","female", 60000),
                new Person("Alex","male", 16000),
                new Person("Alexa","female", 6000)


        );

        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
                Persons.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getSalary)));

        System.out.println("Average Salary : "+avgSalaryOfMaleAndFemaleEmployees);


        Optional<Person> highestPaidWrapper = Persons.stream().max(Comparator.comparingDouble(Person::getSalary));

        Person richestPerson = highestPaidWrapper.get();

        System.out.println("Highest Paid is : "+richestPerson.getName());


        Optional<Person> LowestPaidWrapper = Persons.stream().min(Comparator.comparingDouble(Person::getSalary));

        Person poorestPerson = LowestPaidWrapper.get();

        System.out.println("lowest Paid is : "+poorestPerson.getName());

    }


}
