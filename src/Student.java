public class Student extends Person {
    
    private String major;

    public Student(String str, int yob, String sttr) {
        super(str, yob);
        major = sttr;
    }
    
    public String toString() {
        return super.toString() + " :: " + major;
    }
    
}