import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks = new StudentMarks();
    @Test
    public void gradeChecker() {
        int numOfStudents=5;
        int stuGrades[]={23,87,98,45,-56};
        Error expected= new Error("Grade is out of range,not in range in between 0-100");
        assertEquals(expected,studentMarks.gradeChecker(numOfStudents,stuGrades));
    }
}