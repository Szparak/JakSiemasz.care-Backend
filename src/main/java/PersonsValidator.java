import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonsValidator implements Validator<String> {

    private final Pattern nameAndSurnamePattern;
    private final Pattern emailPattern;

    public PersonsValidator() {
        this.nameAndSurnamePattern = Pattern.compile("[a-zA-Z]+");
        this.emailPattern = Pattern.compile("\\w+@\\w+\\.[a-z]+");
    }

    @Override
    public String validate(String o1, Pattern pattern) {
        Matcher matcher = pattern.matcher(o1);
        if(matcher.matches()){
            return o1;
        }else
            throw new IllegalArgumentException();
    }

    public String validateNameOrSurname(String nameOrSurname){
        return validate(nameOrSurname, nameAndSurnamePattern);
    }

    public String validateEmail(String email){
        return validate(email, emailPattern);
    }
}
