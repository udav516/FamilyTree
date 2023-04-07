package tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class FamilyTree implements Iterable {
    private final ArrayList<Human> famTree = new ArrayList<>();

    public void addHuman(Human human) {
        famTree.add(human);
        if (human.getMother() != null)
            human.getMother().addChild(human);

        if (human.getFather() != null)
            human.getFather().addChild(human);
    }

    public String findHuman(String name) {
        for (Human human : famTree)
            if (human.getName().contains(name)) {
                return human.toString();
            }
        return null;
    }

    public String sortByName(String name) {
        for (Human human : famTree) {
            Comparator<Human> Comparator = null;
            famTree.sort(java.util.Comparator.comparing(Human::getName));
            return human.getName();
        }
        return null;
    }

    public LocalDate sortByBirthDate(LocalDate birthDate) {
        for (Human human : famTree) {
            Comparator<Human> Comparator = null;
            famTree.sort(java.util.Comparator.comparing(Human::getBirthDate));
            return human.getBirthDate();
        }
        return null;
    }

    @Override
    public String toString() {
        return famTree.toString();
    }
}