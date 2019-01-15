package Day2.Assignment9;

public class Student {

    static int sId = 550;
    int studentId;
    char studentType;
    String studentName;

    public Student(){
        studentId = sId;
        sId++;
        System.out.println(sId);
        studentType = 'G';
        studentName = "Kush";
    }

    public Student(char sType, String fname, String lname){
        studentId = sId;
        sId++;
         studentType = sType;
         studentName = fname + lname;
    }

    public static void displayDetails(Student obj){
         System.out.println(obj.sId + " " + obj.studentName + " " + obj.studentType);
    }

    public static void main(String[] args) {

         Student s1 = new Student('D', "Bony", "Thomas");
         s1.displayDetails(s1);

         Student s2 = new Student('H', "Dinil", "Bose");
         s2.displayDetails(s2);
    }
}
