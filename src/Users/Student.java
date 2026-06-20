package Users;

public class Student extends User{

    public int studentID;

    public Student(String name , String email,int studentID){
        super(name,email);
        this.studentID = studentID;
    }

    void requestSession(){
        System.out.println(name + "requested a tutoring session");
    }

    public int getStudentID(){
        int tempid = studentID +1;
        return tempid;
    }

    public void getStudentID(int studentID){

        this.studentID = studentID;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID:" +this.studentID);
    }
}
