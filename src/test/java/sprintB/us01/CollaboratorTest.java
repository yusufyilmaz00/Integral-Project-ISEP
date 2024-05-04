package sprintB.us01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollaboratorTest {

    @Test
    void checkSpecialCharacterJob() {
        //AAA - Arrange, Act, Assert
        Collaborator Worker = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191");
        String specialData = "?Python";
        int expectedResult = 1;

        //Act
        int result = Worker.checkSkill(specialData);

        //Assert
        assertEquals(expectedResult, result);
    }
    @Test
    void checkifInListCharacterJob() {
        //AAA - Arrange, Act, Assert
        Collaborator Worker = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191");
        String sameData = "Python";
        Skill Python = new Skill(sameData);
        Worker.addSkill(Python);
        int expectedResult = -1;
        //Act
        int result = Worker.checkSkill(sameData);
        //Assert
        assertEquals(expectedResult, result);
    }
    @Test
    void checkigoodNameJob() {
        //AAA - Arrange, Act, Assert
        Collaborator Worker = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191");
        String job1 = "Python";
        String job2 = "Java";
        Skill Python = new Skill(job1);
        Worker.addSkill(Python);
        int expectedResult = 0;
        //Act
        int result = Worker.checkSkill(job2);
        //Assert
        assertEquals(expectedResult, result);
    }

}