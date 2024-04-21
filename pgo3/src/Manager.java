import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> goals = new ArrayList<>();
    public Manager(String firstName, String lastName, String city, String emailAddress, String PESEL, int hireYear) {
        super(firstName, lastName, city, emailAddress, PESEL, hireYear);
    }
    public void addGoals(Goal g){
        goals.add(g);
        System.out.println("Added goal " + g.getName() + " to manager " + this.getFirstName() + " " + this.getLastName());
    }
    @Override public ArrayList<Bonus> GetBonusActivities(){
        ArrayList<Bonus> currGoals = new ArrayList<>();
        for (Goal goal : goals){
            currGoals.add(goal);
        }
        return currGoals;
    }
}
