import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "company.com";
    private int mailboxCapacity = 900;

    // constructor to receive the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // call a method asking for department - return department
        this.department = setDepartment();
        // call a method returning a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Generated password: " + this.password);
        // combine elements to get an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
                department.toLowerCase() + "." + companySuffix;
    }

    // ask user for the department
    private String setDepartment() {
        System.out.print("New employee : " + firstName + ". Department code:\n1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "4 for HR\n" +
                "0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)
            return "Sales";
        else if(depChoice == 2)
            return "Development";
        else if(depChoice == 3)
            return "Accounting";
        else if (depChoice == 4)
            return "HR";
        else
            return "";
    }

    // create a random string as password
    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // set mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }


    // change password
    public void changePassword(String password) {
        this.password = password;
    }
    // getters

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    // showing info about employee
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + " MB";
    }
}
