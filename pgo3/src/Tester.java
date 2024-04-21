import java.util.ArrayList;

public class Tester extends Employee{
    private ArrayList<Test> tests = new ArrayList<>();
    public Tester(String firstName, String lastName, String city, String emailAddress, String PESEL, int hireYear) {
        super(firstName, lastName, city, emailAddress, PESEL, hireYear);
    }
    public void addTestType(String testName){
        Test t = new Test(testName);
        tests.add(t);
        System.out.println("Added test " + testName + " to tester " + this.getFirstName() + " " + this.getLastName());
    }
}
