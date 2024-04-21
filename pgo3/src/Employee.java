import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
    private String firstName;
    private String lastName;
    private String city;
    private String emailAddress;
    private String PESEL;
    private int hireYear;
    private int baseSalary = 3000;

    public Employee(String firstName, String lastName, String city, String emailAddress, String PESEL, int hireYear) {
        if (firstName.trim().equals("")){
            throw new IllegalArgumentException("First name is invalid; Name used: " + firstName);
        }
        if (lastName.trim().equals("")){
            throw new IllegalArgumentException("Last name is invalid; Name used: " + lastName);
        }
        if (city.trim().equals("")){
            throw new IllegalArgumentException("City name is invalid; Name used: " + city);
        }
        if (emailAddress.trim().equals("") || !emailAddress.contains("@")){
            throw new IllegalArgumentException("E-Mail address is invalid; E-Mail used: " + emailAddress);
        }
        if (PESEL.trim().equals("")){
            throw new IllegalArgumentException("PESEL number is invalid; PESEL used: " + PESEL);
        }
        try{
            Integer.parseInt(PESEL);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Inpus PESEL is not a number; PESEL used: " + PESEL);
        }
        if (hireYear < 0){
            throw new IllegalArgumentException("Hire year is invalid; Year used: " + hireYear);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.emailAddress = emailAddress;
        this.PESEL = PESEL;
        this.hireYear = hireYear;
    }
    public int calculateSalary(){
        int returnSalary = baseSalary;
        int todaysYear = LocalDate.now().getYear();
        returnSalary += (todaysYear - hireYear) * 1000;
        ArrayList<Bonus> currEmployeeBonus = GetBonusActivities();
        for (Bonus b : currEmployeeBonus){
            returnSalary += b.getBonus();
        }
        return returnSalary;
    }
    public ArrayList<Bonus> GetBonusActivities(){return null;}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPESEL() {
        return PESEL;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
