package tree;

import java.time.LocalDate;

public interface Iterable {
    String sortByName(String name);

    default LocalDate sortByBirthDate(LocalDate birthDate) {
        return null;
    }
}
