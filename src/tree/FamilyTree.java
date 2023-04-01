package tree;

import java.util.ArrayList;

public class FamilyTree {
    private final ArrayList<Human> famTree = new ArrayList<>();

    public void addHuman(Human human) {
        famTree.add(human);
        if (human.getMother() != null)
            human.getMother().addChild(human);

        if (human.getFather() != null)
            human.getFather().addChild(human);
    }

    public void findHuman(String name) {
        for (Human value : famTree)
            if (value.getName().contains(name)) {
                System.out.println(value);
            }
    }

    @Override
    public String toString() {
        return famTree.toString();
    }


}