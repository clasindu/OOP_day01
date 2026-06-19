package Users;

public class User {

    public String name;
    public String email;

    public User(String name , String email){
        this.name  = name;
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("Name :" + this.name + " , Email: " +this.email );
    }

    public void fullInfo(){
        this.displayInfo();
    }

}
