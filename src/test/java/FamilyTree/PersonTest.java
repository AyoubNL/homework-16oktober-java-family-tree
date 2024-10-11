package FamilyTree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @BeforeEach
    void setUp() {

        Person agent = new Person("Ayoub", "Boukayyour", 34, 'M');

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
    }

    @Test
    void getMiddleName() {
    }

    @Test
    void setMiddleName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }

    @Test
    void addParents() {
    }

    @Test
    void addChild() {
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getGrandChildren() {
    }
}