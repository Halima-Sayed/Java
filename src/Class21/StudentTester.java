package Class21;

public class StudentTester {
    public static void main(String[] args) {
        Students[] student = {new SyntaxStudent(),
                new CollegeStudent(), new SchoolStudent()};
        for (Students a : student) {
            a.study();
            a.talk();
            a.Homework();

            //does a contain the object of SyntaxStudents
            //instanceof checks which object is being stored in the variables
            //if a is an instance of SyntaxStudent then perform the block of code

            if (a instanceof SyntaxStudent) {
                ((SyntaxStudent) a).appreciateProfessors();
            }else if (a instanceof CollegeStudent){
                ((CollegeStudent)a).scholorship();
            } else if (a instanceof SchoolStudent) {
                ((SchoolStudent)a).skipSchool();
            }

            //Way I learned but uses a lot of code
            /*    if (a instanceof SyntaxStudent) {
                SyntaxStudent s = (SyntaxStudent) a;
                s.appreciateProfessors();
            } else if (a instanceof CollegeStudent) {
                CollegeStudent c = (CollegeStudent) a;
                c.scholorship();
            } else if (a instanceof SchoolStudent) {
                SchoolStudent s = (SchoolStudent) a;
                s.skipSchool();
            }


             */

        }
//Without using isntanceof
  /*      Students student1=new SyntaxStudent();
        SyntaxStudent a=(SyntaxStudent) student1;
        a.appreciateProfessors();

        Students student2=new CollegeStudent();
       CollegeStudent b=(CollegeStudent) student2;
        b.scholorship();

        Students student3=new SchoolStudent();
        SchoolStudent c=(SchoolStudent) student3;
        c.skipSchool();

   */
    }
}
