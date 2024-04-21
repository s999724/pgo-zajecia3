import java.util.ArrayList;

public class Developer extends Employee{
    private ArrayList<Technology> technologies = new ArrayList<>();
    public Developer(String firstName, String lastName, String city, String emailAddress, String PESEL, int hireYear) {
        super(firstName, lastName, city, emailAddress, PESEL, hireYear);
    }
    public void addTechnology(Technology t){
        technologies.add(t);
        System.out.println("Added technology " + t.getName() + " to developer " + this.getFirstName() + " " + this.getLastName());
    }
}
