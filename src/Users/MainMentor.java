package Users;

import java.util.ArrayList;

public class MainMentor extends Mentor{

    int percentage_Cut;

    public MainMentor(String name , String email , ArrayList<String> subjects, int experience ,int pc){
        super(name,email,subjects,experience);
        this.percentage_Cut=pc;
        System.out.println("Main Mentor con");

    }


}
