package Users;

import java.util.ArrayList;

public class Mentor extends User {

    public ArrayList<String> tutoring_subjects;
    public int experience;

    public Mentor(String name , String email ,ArrayList<String> subjects, int experience){

        super(name, email);
        this.tutoring_subjects =subjects;
        this.experience =experience;
    }

    public void createAvailability(){
        System.out.println("Setting Availability");
    }
}




