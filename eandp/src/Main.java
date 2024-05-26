public class Main {
    public static void main(String[] args) {
        // Assuming a Person class exists with the methods setName and setPassword
        Person person = new Person();
        person.setName("Olamide Adesina");
        System.out.println(person.getName());

        person.setPassword("12345678");
        System.out.println(person.getPassword());

        Person student = new Person("Olamide", "securePassword123", "Bingham University", "BHU/22/04/05/0072");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Password: " + student.getPassword());
        System.out.println("Student School Name: " + student.getSchoolName());
        System.out.println("Student Martic No: " + student.getMarticNo());

        Person staff = new Person("Jane Smith", "SecurePassword456", "Bingham University", 987654);
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Password: " + staff.getPassword());
        System.out.println("Staff School Name: " + staff.getSchoolName());
        System.out.println("Staff No: " + staff.getStaffNo());


        Physics physics = new Physics();
        physics.calculateVelocity(23, 2);
        physics.calculatevelocity(23, 53, 2);
    }
}