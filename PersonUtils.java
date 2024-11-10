import java.util.List;
import java.util.stream.Collectors;

public class PersonUtils {
    public static List<String> convertPersonsToStrings(List<Person> persons, PersonStringConverter converter) {
        return persons.stream()
                .map(converter::personToString)
                .collect(Collectors.toList());
    }
}
