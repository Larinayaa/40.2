import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestsPerson {
    private List<Person> persons;
    @BeforeEach
    public void setUp() {
        persons = List.of(
                new Person("Анна", "Ковальчук", "kovalchuk1111@gmail.com", "+3829485843",
                        new Address("66119", "Саарбрюккен", "Герхардштрассе", "14")),
                new Person("Василий", "Петров", "petrov654@gmail.com", "+7954356540",
                        new Address("58854", "Берлин", "Поштштрассе", "8"))
        );
    }
    @Test
    @DisplayName("Полное имя")
    public void testFullNames() {
        List<String> expected = List.of("Анна Ковальчук", "Василий Петров");
        List<String> actual = PersonUtils.convertPersonsToStrings(persons, Person::getFullName);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Добавить имейл")
    public void testEmails() {
        List<String> expected = List.of("kovalchuk1111@gmail.com", "petrov654@gmail.com");
        List<String> actual = PersonUtils.convertPersonsToStrings(persons, Person::getEmail);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Добавить телефон")
    public void testPhones() {
        List<String> expected = List.of("+3829485843", "+7954356540");
        List<String> actual = PersonUtils.convertPersonsToStrings(persons, Person::getPhone);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Добавить адрес")
    public void testAddres() {
        List<String> expected = List.of("66119, Саарбрюккен, Герхардштрассе, 14", "58854, Берлин, Поштштрассе, 8");
        List<String> actual = PersonUtils.convertPersonsToStrings(persons, p -> p.getAddress().toString());
        assertEquals(expected, actual);
    }
}

