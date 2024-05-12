package sprintB.us02;

import org.junit.jupiter.api.Test;
import sprintB.us01.Collaborator;
import sprintB.us01.HumanResourceManager;
import sprintB.us01.Skill;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HumanResourceManagerTest {

    /**
     * Here we test if the job contains special character
     */
    @Test
    void checkSpecialCharacterJob() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker = new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String specialData = "?Python";
        int expectedResult = 1;

        //Act
        int result = Worker.checkJob(specialData);

        //Assert
        assertEquals(expectedResult, result);
    }
    /**
     * Here we test if the job was already created
     */
    @Test
    void checkifInListCharacterJob() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker = new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String sameData = "Python";
        Worker.createJobs(sameData);
        int expectedResult = -1;
        //Act
        int result = Worker.checkJob(sameData);
        //Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Here we test if the job was created
     */
    @Test
    void checkigoodNameJob() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker = new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String job1 = "Python";
        String job2 = "Java";
        Worker.createJobs(job1);
        int expectedResult = 0;
        //Act
        int result = Worker.checkJob(job2);
        //Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Here we test if the skill contains special character
     */
    @Test
    void checkSpecialCharacterSkill() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker = new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String specialData = "?Python";
        int expectedResult = 1;

        //Act
        int result = Worker.checkSkill(specialData);

        //Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Here we test if the skill was already created
     */
    @Test
    void checkifInListCharacterSkill() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker= new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String sameData = "Python";
        Skill Python = new Skill(sameData);
        Worker.addpossibleSkill(Python);
        int expectedResult = -1;
        //Act
        int result = Worker.checkSkill(sameData);
        //Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Here we test if the skill was created
     */
    @Test
    void checkigoodNameSkill() {
        //AAA - Arrange, Act, Assert
        HumanResourceManager Worker = new HumanResourceManager("Geza","1232225@isep.ipp.pt", "06481191191");
        String job1 = "Python";
        String job2 = "Java";
        Skill Python = new Skill(job1);
        Worker.addpossibleSkill(Python);
        int expectedResult = 0;
        //Act
        int result = Worker.checkSkill(job2);
        //Assert
        assertEquals(expectedResult, result);
    }
}