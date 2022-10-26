import java.util.Hashtable;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Hashtable<String, String> myLibrary = new Hashtable<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to myLibrary!");

        myLibrary.put("004 P276i2004", "Introduction to computing systems");
        myLibrary.put("005.8 Y841h", "The hacker's handbook");
        myLibrary.put("616.85506032 M831D", "A dictionary of speech therapy");
        myLibrary.put("509.17671 T853S", "Science in medieval Islam: an illustrated introduction");
        myLibrary.put("530.1 W62A1928", "Archimedes; or, The future of physics");
        myLibrary.put("530 M56I", "An introduction to modern physics");
        myLibrary.put("600 OG1M1946", "... Machines and tomorrow's world");
        myLibrary.put("620 G942", "Guiding principles for the nation's critical infrastructure.");
        myLibrary.put("620 An784a", "Advanced engineering and technology");
        myLibrary.put("005 H537", "High integrity software");
        myLibrary.put("005 P362s", "Software reliability methods");

        System.out.println("myLibrary's size: " + myLibrary.size());
        System.out.println("Retrieving book: " + myLibrary.get("005.8 Y841h"));
        System.out.println("Removing book: "+ myLibrary.get("005.8 Y841h"));
        myLibrary.remove("005.8 Y841h");
        System.out.println("myLibrary's size (Post-removal): " + myLibrary.size());

        System.out.println("Clearing the library.....");
        myLibrary.clear();
        System.out.println("All cleared!.. Current books in library: " + myLibrary.size());

    }
}