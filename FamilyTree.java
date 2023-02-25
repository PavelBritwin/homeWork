package Java_OOP.homeWork;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private String name;
    private List<Human> family;

    public List<Human> getFamily() {
        return family;
    }

    public FamilyTree(String name, List<Human> family) {
        this.name = name;
        this.family = family;
    }

    public void includeInFamily(Human... humans){
        for (Human h : humans){
            this.family.add(h);
        }
    }

    public List<Human> searchHuman(String name){
        List<Human> h = new ArrayList<>();
        for (Human human : family){
            if (human.getName().equalsIgnoreCase(name))
                h.add(human);
        }
        return h;
    }
}