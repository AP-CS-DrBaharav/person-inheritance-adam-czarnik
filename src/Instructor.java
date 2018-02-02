public class Instructor extends Person {

    private int salary;
    
    public Instructor(String str, int yob, int sal) {
        super(str, yob);
        salary = sal;
    }
    
    public String toString() {
        return super.toString() + " :: " + salary;
    }
    
}