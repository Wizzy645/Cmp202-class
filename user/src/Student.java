public class Student extends User {
    String matricNo = "BHU/22/04/05/0072";
    String adminNo = " yrrigopy9y8y8oyo8y";


    public String registerCourse() {
        if (matricNo.equals("") || adminNo.equals((""))){
            return "you can't register course";
        }else {
            return "Succesful";
        }
    }

    public String uploadResult(String password) {
        return "Result uploaded for " + matricNo + " with password: " + password;
    }
}
