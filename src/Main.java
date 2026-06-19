import Users.User;

public class Main {

    public static void main (String[] args){

        User ranil = new User("Ranil Nickrmasinghe" , "sirikotha@gamil.com");
        User sajith=new User("Sajith Labdasa" , "autocrati@gamil.com");
        System.out.println(ranil.name);
        System.out.println(sajith.email);
    }
}
