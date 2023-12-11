import java.util.ArrayList;
import java.util.List;

public class ProjectTest {
  public static void main(String[] args) {

    /* there are multiple different projects created here i would say that project 5
    is the structure we should standardize but each of them have diffrent structures
    on how to create them and they all work*/

    ProjectManager projectManager = new ProjectManager();
    List<Project> projectList = new ArrayList<>(); // Create a list to store projects

    // Project 1
    MyDate startDate1 = new MyDate(23, 11, 2016);
    Project project1 = projectManager.createProjectForCustomer("Commercial", startDate1);
    projectList.add(project1);

    // Display initial details of project1
    System.out.println("Before Update (Project 1):");
    System.out.println(project1.generateProgressReport());

    // Update details of project1
    project1.setProjectId(1001);
    project1.setStartDate(new MyDate(23, 11, 2016));
    project1.setExpectedDuration(new MyDate(0, 18, 0));
    project1.calculateAndSetEstimatedDate();
    project1.setEndDate(new MyDate(23, 5, 2018));
    project1.setEstimatedPrice(500000.0);
    project1.setProjectStatus("New Build");
    project1.setFinishedProjects(false);
    project1.setManHoursUsed(190.98);

    // Display updated details of project1
    System.out.println("\nAfter Update (Project 1):");
    System.out.println(project1.generateProgressReport());

    System.out.println("_____________________________________________________");

    // Project 2
    MyDate startDate2 = new MyDate(23, 11, 2016);
    Project project2 = projectManager.createProjectForCustomer("Commercial", startDate2);
    projectList.add(project2);

    // Display initial details of project2
    System.out.println("\nBefore Update (Project 2):");
    System.out.println(project2.generateProgressReport());

    // Update details of project2
    project2.setProjectId(1002);
    project2.setStartDate(new MyDate(23, 11, 2016));
    project2.setExpectedDuration(new MyDate(0, 18, 0));
    project2.calculateAndSetEstimatedDate();
    project2.setEndDate(new MyDate(23, 5, 2018));
    project2.setEstimatedPrice(500000.0);
    project2.setProjectStatus("New Build");
    project2.setFinishedProjects(false);
    project2.setManHoursUsed(123.77);

    // Display updated details of project2
    System.out.println("\nAfter Update (Project 2):");
    System.out.println(project2.generateProgressReport());

    System.out.println("_____________________________________________________");

    // Project 3
    MyDate startDate3 = new MyDate(24, 11, 2016);
    Project project3 = projectManager.createProjectForCustomer("Residential", startDate3);
    projectList.add(project3);

    // Display initial details of project3
    System.out.println("\nBefore Update (Project 3):");
    System.out.println(project3.generateProgressReport());

    // Update details of project3
    project3.setProjectId(1003);
    project3.setStartDate(new MyDate(23, 11, 2016));
    project3.setExpectedDuration(new MyDate(0, 9, 0));
    project3.calculateAndSetEstimatedDate();
    project3.setEndDate(new MyDate(23, 8, 2017));
    project3.setEstimatedPrice(100000.0);
    project3.setProjectStatus("In-Progress");
    project3.setFinishedProjects(true);
    project3.setManHoursUsed(100.0);

    // Display updated details of project3
    System.out.println("\nAfter Update (Project 3):");
    System.out.println(project3.generateProgressReport());

    System.out.println("_____________________________________________________");

    MyDate startDate4 = new MyDate(12, 11, 2017);

    // Create a new project with default values based on project type and start date
    Project project4 = projectManager.createProjectForCustomer("Industrial",
        startDate4);
    projectList.add(project4);

    System.out.println("Project ID: " + project4.getId());
    System.out.println("Project Type: " + project4.getProjectType());
    System.out.println("Start Date: " + project4.getStartDate());
    System.out.println("Expected Duration: " + project4.expectedDuration());
    System.out.println("Estimated Date: " + project4.getEstimatedDate());
    System.out.println("End Date: " + project4.getEndDate());
    System.out.println("Estimated Price: $" + project4.getEstimatedPrice());
    System.out.println("Project Status: " + project4.getProjectStatus());
    System.out.println("Is Finished: " + project4.getFinishedProjects());
    System.out.println("Man Hours Used: " + project4.getManHoursUsed());

    if (project4 instanceof Industrial)
    {
      Industrial industrial=(Industrial) project4;
      System.out.println(industrial.toString());
    }

    // Update project details
    System.out.println("\nAfter Update:");
    project4.setProjectId(9001);
    project4.setStartDate(new MyDate(20, 4, 2023));
    project4.setExpectedDuration(new MyDate(0, 18, 0));
    project4.calculateAndSetEstimatedDate();
    project4.setEndDate(new MyDate(29, 1, 2025));
    project4.setEstimatedPrice(1234567.8);
    project4.setProjectStatus("finnished");
    project4.setFinishedProjects(false);
    project4.setManHoursUsed(9000.0);

    // Print updated details
    System.out.println("Project ID: " + project4.getId());
    System.out.println("Start Date: " + project4.getStartDate());
    System.out.println("Expected Duration: " + project4.expectedDuration());
    System.out.println("Estimated Date: " + project4.getEstimatedDate());
    System.out.println("End Date: " + project4.getEndDate());
    System.out.println("Estimated Price: $" + project4.getEstimatedPrice());
    System.out.println("Project Status: " + project4.getProjectStatus());
    System.out.println("Is Finished: " + project4.getFinishedProjects());
    System.out.println("Man Hours Used: " + project4.getManHoursUsed());

    if (project4 instanceof Industrial)
    {
      Industrial industrial = (Industrial) project4;
      ((Industrial) project4).setSquareMeters(78.9);
      ((Industrial) project4).setFacilityType("Powerplaint");
      System.out.println(industrial.toString());
    }

    System.out.println("_____________________________________________________");

    MyDate startDate5 = new MyDate(23, 3, 2003);
    Project project5 = projectManager.createProjectForCustomer("RoadConstruction", startDate5);
    projectList.add(project5);

    // Display initial details of project3
    System.out.println("\nBefore Update (Project 5):");
    System.out.println(project5.generateProgressReport());

    // Update details of project5
    project5.setStartDate(new MyDate(26, 6, 2001));
    project5.setExpectedDuration(new MyDate(0, 23, 0));
    project5.calculateAndSetEstimatedDate();
    project5.setEndDate(new MyDate(23, 2, 2003));
    project5.setEstimatedPrice(100000.0);
    project5.setProjectStatus("In-Progress");
    project5.setFinishedProjects(true);
    project5.setManHoursUsed(100.0);

    // Check if it's a RoadConstruction project and update specific variables
    if (project5 instanceof RoadConstruction) {
      RoadConstruction roadConstructionProject1 = (RoadConstruction) project5;
      roadConstructionProject1.setRoadLengthKilometers(575);
      roadConstructionProject1.setRoadWidthMeters(40.75);
      roadConstructionProject1.setNumberOfRoadAlterations(4);
      roadConstructionProject1.setChallenges("steep hills tourdefranceEuesque");
    }

    // Display updated details of project3
    System.out.println("\nAfter Update (Project 5):");
    System.out.println(project3.generateProgressReport());





    // Display information about projects in the list
    System.out.println("\nInformation about projects in the list:");
    for (Project p : projectList) {
      System.out.println(p.generateProgressReport());
      System.out.println("_____________________________________________________");
    }

    projectManager.saveProjectsToXML("projects.xml");
  }

}

