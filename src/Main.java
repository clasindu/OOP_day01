import Users.MainMentor;
import Users.Mentor;
import Users.Student;
import Users.User;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

//        User ranil = new User("Ranil Nickrmasinghe" , "sirikotha@gamil.com");
//        User sajith=new User("Sajith Labdasa" , "autocrati@gamil.com");
//        System.out.println(ranil.name);
//        System.out.println(sajith.email);
//
//
//        ranil.displayInfo();
//        sajith.displayInfo();


        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Sinhala");
        subjects.add("English");
        subjects.add("Mathematics");
        Mentor tharana = new Mentor("Tharana" ,"tav@gamil.com", subjects ,4);
//        tharana.displayInfo();
//        System.out.println(tharana.tutoring_subjects);


//        Student chama = new Student("Chamath Lasindu" ,"abc@gmail.com" ,1228);
//        chama.displayInfo();


        MainMentor tutor = new MainMentor("Dilshara" ,"dilshara@gmail.com" , subjects ,4,2);
        tutor.displayInfo();

    }


}
