public  class Person {
    
    private String name;
    private int yearOfBirth;
    
    public Person(String str, int yob) {
        name = str;
        yearOfBirth = yob;
    }
    
    public String toString(){
        return name + " " + yearOfBirth;
    }
    
}