import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addToProjects(Project project) {
        this.projects.add(project);
    }

    public double getPortfolioCost() {
        double totalCost = 0;
        for (Project project : this.projects) {
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }

    public String showPortfolio() {
        String show = "";
        for (Project project : this.projects) {
            show += project.elevatorPitch() + " ";
        }

        show += getPortfolioCost();
        return show;
    }
}