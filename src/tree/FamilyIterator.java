package tree;

import java.util.*;
import java.util.Iterator;

public class FamilyIterator implements Iterator<Human> {
    private int generationIndex;
    private ArrayList<Human> generations;

    public FamilyIterator(ArrayList<Human> generations) {
        this.generations = generations;
    }

    @Override
    public boolean hasNext() {
        return generationIndex < generations.size();
    }

    @Override
    public Human next() {
        return generations.get(generationIndex++);
    }
}
