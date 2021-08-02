public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
        this("Test Name", "Test description");
    }

    public Project(String name) {
        this.name = name;
        this.description = "Test description 2";
        this.initialCost = 0;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getInitialCost() {
        return initialCost;
    }

    public String elevatorPitch() {
        String pitch = String.format("%s (%f): %s", name, initialCost, description);
        return pitch;
    }
}