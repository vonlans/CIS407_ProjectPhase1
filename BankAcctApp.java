BankAcctApp.java:
public class BankAcctApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerID("C001");
        customer1.setCustomerSSN("123456789");
        customer1.setCustomerLastName("Smith");
        customer1.setCustomerFirstName("John");
        customer1.setCustomerStreet("123 Main St");
        customer1.setCustomerCity("City");
        customer1.setCustomerState("ST");
        customer1.setCustomerZip("12345");
        customer1.setCustomerPhone("1234567890");

        Customer customer2 = new Customer();
        customer2.setCustomerID("C002");
        customer2.setCustomerSSN("987654321");
        customer2.setCustomerLastName("Johnson");
        customer2.setCustomerFirstName("Sarah");
        customer2.setCustomerStreet("456 Elm St");
        customer2.setCustomerCity("City");
        customer2.setCustomerState("ST");
        customer2.setCustomerZip("54321");
        customer2.setCustomerPhone("9876543210");

        System.out.println("Customer 1:");
        System.out.println(customer1.toString());

        System.out.println("\nCustomer 2:");
        System.out.println(customer2.toString());
    }
}
Customer.java:
public class Customer {
    private String customerID;
    private String customerSSN;
    private String customerLastName;
    private String customerFirstName;
    private String customerStreet;
    private String customerCity;
    private String customerState;
    private String customerZip;
    private String customerPhone;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerSSN() {
        return customerSSN;
    }

    public void setCustomerSSN(String customerSSN) {
        this.customerSSN = customerSSN;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID +
                "\nCustomer SSN: " + customerSSN +
                "\nCustomer Last Name: " + customerLastName +
                "\nCustomer First Name: " + customerFirstName +
                "\nCustomer Street: " + customerStreet +
                "\nCustomer City: " + customerCity +
                "\nCustomer State: " + customerState +
                "\nCustomer Zip: " + customerZip +
                "\nCustomer Phone: " + customerPhone;
    }
}
import java.util.Scanner;

public class DataEntry {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static String getStringWithLimit(int limit) {
        String input = scanner.nextLine();
        if (input.length() > limit) {
            input = input.substring(0, limit);
        }
        return input;
    }

    public static String getNumericString() {
        String input = scanner.nextLine();
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid input. Please enter numeric characters only.");
        }
        return input;
    }

    public static int getInteger() {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter an integer.");
        }
    }

    public static int getIntegerWithRange(int min, int max) {
        int input = getInteger();
        if (input < min || input > max) {
            throw new IllegalArgumentException("Invalid input. Please enter an integer within the specified range.");
        }
        return input;
    }

    public static String getDate() {
        return scanner.nextLine();
    }
}
