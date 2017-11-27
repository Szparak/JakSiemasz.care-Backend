import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PersonGenerator personGenerator = new PersonGenerator();

        personGenerator.generatePersons();

        List<Person> personList = personGenerator.getPersonList();

        Comparator<Person> personComparator = Comparator.comparing(Person::getName);
        personComparator = personComparator.thenComparing(Person::getSurname);
        personComparator = personComparator.thenComparing(Person::getEmail);

        Collections.sort(personList, personComparator);


        for(Person person: personList)
            System.out.println(person.toString());


    }


}
