package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String lastName, String middleName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);
        mother.addChild(mother, child);
        father.addChild(father, child);
    }

    public void addChild(Person parent, Person child) {
        List<Person> kids = new ArrayList<>();
        if (parent.getChildren() != null) {
            for (Person person : parent.getChildren()) {
                kids.add(person);
            }
        }
        kids.add(child);
        parent.setChildren(kids);
    }

    void addPet(Person person, Pet pet) {
        List<Pet> pets = new ArrayList<>();
        if (person.getPets() != null) {
            pets.addAll(person.getPets());
        }
        pets.add(pet);
        person.setPets(pets);
    }

    void addSibling(Person person, Person sibling) {
        List<Person> family = new ArrayList<>();
        if (person.getSiblings() != null) {
            for (Person people : person.getSiblings()) {
                family.add(people);
            }
        }
        family.add(sibling);
        person.setSiblings(family);
    }

    List<Person> getGrandChildren(Person person) {
        List<Person> grandChildren = new ArrayList<>();
        if (person.getChildren() != null) {
            for (Person children : person.getChildren()) {
                if (children.getChildren() != null) {
                    for (Person grandKid : children.getChildren()) {
                        grandChildren.add(grandKid);
                    }
                }
            }
        }
        return grandChildren;
    }
}
