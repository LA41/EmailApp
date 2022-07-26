public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Johnny", "Bravo");
        // setting alternate email
        em1.setAlternateEmail("likikiki@email.com");
        // changing password and checking if updated
        em1.changePassword("KRAKSA11");
        System.out.println(em1.getPassword());
        // checking showInfo method
        System.out.println(em1.showInfo());
    }
}
