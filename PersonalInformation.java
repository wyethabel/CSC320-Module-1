// CSC320 Module 1 - Option 1 by Wyeth Abel

public class PersonalInformation {

    public static void main(String[] args) {
        printInformation("Wyeth", "Abel", "1823 Example Rd.", "Example City", 12345);
    }

    public static void printInformation(String firstName, String lastName, String address, String city, int zip) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Zip: " + zip);
    }
}
