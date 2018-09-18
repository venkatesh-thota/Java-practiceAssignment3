public class StudentMarks{

    int numOfStudents;
    int []stuGrades;

    public Error gradeChecker(int numOfStudents,int []stuGrades){
        for(int i=0;i<numOfStudents;i++){
            if(stuGrades[i]>100||stuGrades[i]<0)
            {
                return new Error("Grade is out of range,not in range in between 0-100");
            }
        }
        return null;
    }
}
