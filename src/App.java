import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class App {

    private static Enumeration<String> keys;

    public static void main(String[] args) throws Exception {
        Hashtable<String, String> myLibrary = new Hashtable<>();

        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to myLibrary!");

        // populate hash-table
        myLibrary.put("004 P276i2004", "Introduction to computing systems");
        myLibrary.put("005.8 Y841h", "The hacker's handbook");
        myLibrary.put("616.8552 M831D", "A dictionary of speech therapy");
        myLibrary.put("509.17671 T853S", "Science in medieval Islam: an illustrated introduction");
        myLibrary.put("530.1 W62A1928", "Archimedes; or, The future of physics");
        myLibrary.put("530 M56I", "An introduction to modern physics");
        myLibrary.put("600 OG1M1946", "... Machines and tomorrow's world");
        myLibrary.put("620 G942", "Guiding principles for the nation's critical infrastructure.");
        myLibrary.put("620 An784a", "Advanced engineering and technology");
        myLibrary.put("005 H537", "High integrity software");
        myLibrary.put("005 P362s", "Software reliability methods");

        while (flag) {
            System.out.println("Current books in the library: " + myLibrary.size());
            printSelection();
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.print("Enter call number: ");
                    String callNumber = sc.nextLine();
                    if (myLibrary.get(callNumber) != null) {
                        System.out.println("Call number returned this book:" + myLibrary.get(callNumber));
                    } else {
                        System.out.println("Book not found in the library!");
                    }
                    break;
                case 2:
                    System.out.print("Enter call number of the book to be removed: ");
                    String toRemove = sc.nextLine();
                    if (myLibrary.get(toRemove) != null) {
                        System.out.println(myLibrary.get(toRemove) + " is removed!");
                        myLibrary.remove(toRemove);
                    } else {
                        System.out.println("Invalid call number! Book not removed.");
                    }
                    break;
                case 3:
                    System.out.println("Put a book in the library");
                    System.out.print("Call number: ");
                    String hashKey = sc.nextLine();
                    System.out.print("Book title: ");
                    String hashValue = sc.nextLine();
                    myLibrary.put(hashKey, hashValue);
                    System.out.println("Book inserted!");
                    break;
                case 4:
                    System.out.println("Library is cleared!");
                    myLibrary.clear();
                    System.out.println("Current books in the library: " + myLibrary.size());
                    System.out.println("----------PROGRAM END----------");
                    flag = false;
                    break;
                case 5:
                    keys = myLibrary.keys();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\tCALL NUMBER\t\t|\tBOOK TITLE");
                    while (keys.hasMoreElements()) {
                        String temp = keys.nextElement();
                        System.out.println(temp + "\t\t\t| " + myLibrary.get(temp));
                    }
                    System.out.println("----------------------------------------------------------------");
                    break;

                case 6:
                    System.out.println("EXITING...");
                    flag = false;
                    break;
                default:
                    System.out.println("Inavlid input detected! Try again.");
                    break;
            }
        }
        ;
    }

    // 5 Operations
    public static void printSelection() {
        System.out.println("[1] Retrieve a book");
        System.out.println("[2] Remove a book");
        System.out.println("[3] Insert a book");
        System.out.println("[4] Clear the library");
        System.out.println("[5] Get total number of books stored");
        System.out.println("[6] EXIT");
    }
}