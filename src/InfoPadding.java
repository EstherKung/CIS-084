public class InfoPadding {
    public static void main(String[] args) {
        String firstName = "Esther";
        String lastName = "Kung";
        String email = "estherk3476@gmail.com";
        int id = 1017310;
        System.out.printf("%s %-25s %s %s \n", "First name:", firstName, "Last Name:", lastName);
        System.out.printf("%s %-30s %s %s \n", "Email:", email, "Student ID:", id);
    }
}
