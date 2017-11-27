

public class Person {
    private String name;
    private String surname;
    private String email;
    PersonsValidator personsValidator = new PersonsValidator();


    public Person(String name, String surname, String email) {
        try{
            this.name = personsValidator.validateNameOrSurname(name);
            this.surname = personsValidator.validateNameOrSurname(surname);
            this.email = personsValidator.validateEmail(email);
        }catch (IllegalArgumentException e){
            System.out.println("Pattern doesnt match");
        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "[ name=" + name + ",surname= " + surname + ",email= " +email + " ]";
    }
}
