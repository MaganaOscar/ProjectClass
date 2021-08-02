public class ProjectTest {
    public static void main(String[] args) {
        Project tester1 = new Project();
        Project tester2 = new Project("Game");
        Project tester3 = new Project("Bad Game", "is fun");

        System.out.println(tester1.getName());
        System.out.println(tester2.getName());
        System.out.println(tester3.getName());
        System.out.println(tester1.getDescription());
        System.out.println(tester2.getDescription());
        System.out.println(tester3.getDescription());
        tester3.setName("Good Game");
        System.out.println(tester3.getName());
        tester3.setDescription("is boring");
        System.out.println(tester3.getDescription());
        System.out.println(tester3.elevatorPitch());
        tester3.setInitialCost(123.21);
        System.out.println(tester3.getInitialCost());
        System.out.println(tester3.elevatorPitch());

        Portfolio portfolio = new Portfolio();
        System.out.println(portfolio.getProjects());
        portfolio.addToProjects(tester1);
        tester2.setInitialCost(35.92);
        portfolio.addToProjects(tester2);
        portfolio.addToProjects(tester3);
        System.out.println(portfolio.getPortfolioCost());
        System.out.println(portfolio.showPortfolio());

    }
}