import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    private List<String> names = new ArrayList<>(Arrays.asList(
            "Kuba", "Jan", "Kasia" , "Kamil" , "Magda"
    ));
    private List<String> surnames = new ArrayList<>(Arrays.asList(
            "Pernal" , "Jakistam" , "Psikuta" , "Dyzma" , "Kiler"
    ));
    private List<String> emails = new ArrayList<>(Arrays.asList(
            "toja@um.com" , "toTy999@gmail.com" , "jakisMail@o2.pl" , "KaskaMail@gmail.com" , "razdwatrzy@wp.pl"
    ));
    private List<Person> personList = new ArrayList<>();



    public void generatePersons(){
        Random random = new Random();

        for(int i=0; i<surnames.size(); i++)
            personList.add(new Person(names.get(random.nextInt(names.size())), surnames.get(random.nextInt(surnames.size())),
                    emails.get(random.nextInt(emails.size()))));

    }

    public List<Person> getPersonList() {
        return personList;
    }
}
