package FamilyTree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getName() {
        //arrange
        Person agent = new Person("Ayoub", "Boukayyour", 34, 'M');
        //act
        String name = agent.getName();
        //assert
        assertEquals("Ayoub", name);
    }

    @Test
    void setName() {
        //arrange
        Person agent = new Person("Ayoub", "Boukayyour", 34, 'M');
        //act
        agent.setName("Achmed");
        String sName = agent.getName();
        //assert
        assertEquals("Achmed", sName);

    }

    @Test
    void getMiddleName() {
        //arrange
        Person writer = new Person("Heleem", "Rooijen", "van de", 55, 'V');
        //act
        String mName = writer.getMiddleName();
        //assert
        assertEquals("van de", mName);
    }

    @Test
    void setMiddleName() {
        //arrange
        Person writer = new Person("Heleem", "Rooijen", "van de", 55, 'V');
        //act
        writer.setMiddleName("van");
        String smName = writer.getMiddleName();
        //assert
        assertEquals("van", smName);
    }

    @Test
    void getLastName() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'V');
        //act
        String glName = singer.getLastName();
        //assert
        assertEquals("Bouwer", glName);

    }

    @Test
    void setLastName() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'V');
        //act
        singer.setLastName("Patat");
        String slName = singer.getLastName();
        //assert
        assertEquals("Patat", slName);

    }

    @Test
    void getSex() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'M');
        //act
        int gSex = singer.getSex();
        //assert
        assertEquals('M', gSex);

    }

    @Test
    void setSex() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'M');
        //act
        singer.setSex('X');
        char sSex = singer.getSex();
        //assert
        assertEquals('X', sSex);
    }

    @Test
    void getAge() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'M');
        //act
        int gAge = singer.getAge();
        //assert
        assertEquals(65, gAge);
    }

    @Test
    void setAge() {
        //arrange
        Person singer = new Person("Frans", "Bouwer", 65, 'M');
        //act
        singer.setAge(80);
        int sAge = singer.getAge();
        //assert
        assertEquals(80, sAge);
    }

    @Test
    void getMother() {
        //arrange
        Person theo = new Person("Theo", "Blokker", 15, 'M');
        Person sara = new Person("Sara", "Blokker", 55, 'V');
        theo.setMother(sara);
        //act
        Person gMother = theo.getMother();
        //assert
        assertEquals(sara, gMother);
    }

    @Test
    void getFather() {
        //arrange
        Person son = new Person("Frans", "Bouwer", 15, 'M');
        Person father = new Person("Rowan", "Bouwer", 65, 'M');
        son.setFather(father);
        //act
        Person gFather = son.getFather();
        //assert
        assertEquals(father, gFather);
    }

    @Test
    void getSiblings() {
        //arrange
        Person peter = new Person("Peter", "Brug", 15, 'M');
        Person kees = new Person("Kees", "Brug", 15, 'M');
        Person leo = new Person("Leo", "Brug", 15, 'M');
        List brother = new ArrayList<>();
        brother.add(kees);
        brother.add(leo);

        peter.setSiblings(brother);

        //act
        List gSiblings = peter.getSiblings();

        //assert
        assertEquals(brother, gSiblings);

    }

    @Test
    void getChildren() {
        //arrange
        Person mother = new Person("Anouk", "Brug", 25, 'M');
        Person kees = new Person("Kees", "Brug", 15, 'M');
        Person eva = new Person("Kees", "Brug", 17, 'V');
        List children = new ArrayList<>();
        children.add(kees);
        children.add(eva);
        mother.setChildren(children);

        //act
        List gChildren = mother.getChildren();

        //aassert
        assertEquals(children, gChildren);

    }

    @Test
    void getPets() {
        //arrange
        Person kees = new Person("Kees", "Brug", 15, 'M');
        Pet cat = new Pet("Rico", 2, "Britse korthaar");
        Pet dog = new Pet("Chico", 4, "Britse korthaar");

        List pets = new ArrayList<>();

        pets.add(cat);
        pets.add(dog);

        kees.setPets(pets);

        //act

        List gPets = kees.getPets();

        //asserts
        assertEquals(pets, gPets);

    }

    @Test
    void addParents() {
        //arrange
        Person kees = new Person("Kees", "Brug", 43, 'M');
        Person marie = new Person("Marie", "Brug", 45, 'M');
        Person leo = new Person("Leo", "Brug", 15, 'M');


        //act
        leo.addParents(kees, marie, leo);
        Person father = leo.getFather();
        Person mother = leo.getMother();

        //assert

        assertEquals(father, kees);
        assertEquals(mother, marie);


    }

    @Test
    void addChild() {
        //arrange
        Person jan = new Person("Jan", "Loo", 55, 'M');
        Person marcel = new Person("Marcel", "Loo", 15, 'M');
        List<Person> children = new ArrayList<>();
        children.add(marcel);

        //act
        jan.addChild(jan, marcel);
        List<Person> kids = jan.getChildren();

        //assert
        assertEquals(children, kids);

    }

    @Test
    void addPet() {
        //arrange
        Person anouk = new Person("Anouk", "Timmerman", 34, 'V');
        Pet dog = new Pet("Rex", 8, "Terry");
        Pet cat = new Pet("Loesje", 8, "Terry");
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        //act
        anouk.addPet(anouk, dog);
        anouk.addPet(anouk, cat);

        //assert
        assertEquals(pets, anouk.getPets());
    }

    @Test
    void addSibling() {
        //arrange
        List<Person> sibblings = new ArrayList<>();
        Person andre = new Person("Andre", "Meester", 65, 'M');
        Person thomas = new Person("Thomas", "Muller", 55, 'M');
        Person rosa = new Person("Rosa", "Waldraven", 35, 'V');
        sibblings.add(andre);
        sibblings.add(thomas);

        //act
        rosa.addSibling(rosa, andre);
        rosa.addSibling(rosa, thomas);

        //assert
        assertEquals(sibblings, rosa.getSiblings());
    }

    @Test
    void getGrandChildren() {
        //arrange
        List<Person> grandChildren = new ArrayList<>();
        Person kees = new Person("Kees", "Brug", 5, 'M');
        Person marie = new Person("Marie", "Brug", 26, 'M');
        Person anouk = new Person("Marie", "Brug", 96, 'M');
        grandChildren.add(kees);

        //act
//      marie.addChild(marie, kees);
        anouk.addChild(anouk, kees);
        List<Person> grandKids = anouk.getChildren();

        //assert
        assertEquals(grandChildren, grandKids);


    }

}