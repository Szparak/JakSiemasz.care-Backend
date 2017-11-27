import java.util.regex.Pattern;

public interface Validator<T> {

    T validate(T o1, Pattern pattern);
}
