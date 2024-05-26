public class Hello {
    int age;
    float height;
    String name;
    String password;

    void printUserData() {
        age = 10;
        height = 170;
        name = "Olamide";
        int nameLength = name.length();

        password = "123456";
        if (password.contains("123456") || password.contains("abcdef")) {
            System.out.println("Password is too easy");
        }
    }

    public static void main(String[] args) { // Corrected method name to 'main'
        Hello dan = new Hello();
    }
}