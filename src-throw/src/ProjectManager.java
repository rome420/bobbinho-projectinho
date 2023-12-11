import java.util.ArrayList;
import java.util.List;

public class ProjectManager
{
  private List<Project> projects;
  private List<Customer> customers;

  public ProjectManager()
  {
    projects = new ArrayList<>();
    customers = new ArrayList<>();
  }

  // Project-related methods

  public void addProject(Project project, boolean isFinished)
  {
    projects.add(project);
    project.setFinishedProjects(isFinished);
  }

  public void removeProject(Project project, boolean isFinished)
  {
    projects.remove(project);
    project.setFinishedProjects(isFinished);
  }

  public List<Project> getAllProjects()
  {
    return projects;
  }

  public Project findProjectById(double projectId)
  {
    for (Project project : projects)
    {
      if (project.getId() == projectId)
      {
        return project;
      }
    }
    return null;
  }

  public void addCustomer(Customer customer)
  {
    customers.add(customer);
  }

  public void removeCustomer(Customer customer)
  {
    customers.remove(customer);
  }

  public List<Customer> getAllCustomers()
  {
    return customers;
  }

  public Customer findCustomerByName(String name)
  {
    for (Customer customer : customers)
    {
      if (customer.getName().equals(name))
      {
        return customer;
      }
    }
    return null;
  }

  public List<Project> getProjectsByType(String projectType)
  {
    List<Project> projectsByType = new ArrayList<>();

    for (Project project : projects)
    {
      if (projectType.equalsIgnoreCase("Commercial") && project instanceof Commercial)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("Industrial") && project instanceof Industrial)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("RoadConstruction") && project instanceof RoadConstruction)
      {
        projectsByType.add(project);
      }
      else if (projectType.equalsIgnoreCase("Residential") && project instanceof Residential)
      {
        projectsByType.add(project);
      }
    }

    return projectsByType;
  }

  public Commercial createDefaultCommercialProject()
  {
    // You can set default values for Commercial projects here
    Commercial commercial = new Commercial("Commercial", new MyDate(26, 8, 2001), new MyDate(0,
        0, 0000), new MyDate(0),new MyDate(0,0,0000), 0, "New Build", 0, 0, 0, 1, "Default Building Use");

    // Set specific default values for Commercial
    double estimatedPrice = 500000;
    MyDate expectedDuration = new MyDate(18);

    // Validate the estimated price and duration
    if (estimatedPrice >= 500000 && estimatedPrice <= 2000000
        && expectedDuration.getMonth() >= 12 && expectedDuration.getMonth() <= 24)
    {
      commercial.setEstimatedPrice(estimatedPrice);
      commercial.setExpectedDuration(expectedDuration);
      commercial.calculateAndSetEstimatedDate();
    }
    else
    {
      commercial.setEstimatedPrice(0);
      commercial.setExpectedDuration(new MyDate(0)); // Use the new method to set duration directly
    }
    return commercial;
  }

  public static void displayCommercialDetails(Commercial commercialProject) {
    System.out.println("Square Meters: " + commercialProject.getSquareMeters());
    System.out.println("Number of Floors: " + commercialProject.getNumberOfFloors());
    System.out.println("Building Use: " + commercialProject.getBuildingUse());
  }

  public void updateCommercialDetails(Commercial commercialProject, MyDate expectedDuration, double estimatedPrice,
      double squareMeters, int numberOfFloors, String buildingUse) {
    if (estimatedPrice >= 500000 && estimatedPrice <= 2000000
        && expectedDuration.getMonth() >= 12 && expectedDuration.getMonth() <= 24
        && squareMeters >= 0 && numberOfFloors >= 0) {
      commercialProject.setEstimatedPrice(estimatedPrice);
      commercialProject.setExpectedDuration(expectedDuration);
      commercialProject.setSquareMeters(squareMeters);
      commercialProject.setNumberOfFloors(numberOfFloors);
      commercialProject.setBuildingUse(buildingUse);
      // Update other details as needed
    } else {
      // Handle invalid values as needed
    }
  }




  public Residential createDefaultResidentialProject() {
      Residential residential = new Residential("Residential",
          new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0), new MyDate(00,00,0000),0,
          "in-progress", 0, 0, 0, 1, 1, 1, true);

      double estimatedPrice = 100000;
      MyDate expectedDuration = new MyDate(0,9,0);

      if (estimatedPrice >= 100000 && estimatedPrice <= 500000
          && expectedDuration.getMonth() >= 6 && expectedDuration.getMonth() <= 12) {
        residential.setEstimatedPrice(estimatedPrice);
        residential.setExpectedDuration(expectedDuration);
        residential.calculateAndSetEstimatedDate();

      } else {
        residential.setEstimatedPrice(0);
        residential.setExpectedDuration(new MyDate(0)); // Use the new method to set duration directly
      }

      return residential;
    }
  public static void displayResidentialDetails(Residential residentialProject) {
    System.out.println("Square Meters: " + residentialProject.getSquareMeters());
    System.out.println("Number of Kitchens: " + residentialProject.getNumberOfKitchens());
    System.out.println("Number of Bathrooms: " + residentialProject.getNumberOfBathrooms());
    System.out.println("Other Rooms with Plumbing: " + residentialProject.getOtherRoomsWithPlumbing());
    System.out.println("Is New Build: " + residentialProject.getIsNewBuild());
  }

  public void updateResidentialDetails(Residential residentialProject,MyDate expectedDuration, double estimatedPrice,
      double squareMeters,int numberOfKitchens, int numberOfBathrooms,
      int otherRoomsWithPlumbing, boolean isNewBuild){
      if (estimatedPrice >= 100000 && estimatedPrice <= 500000
          && expectedDuration.getMonth() >= 6 && expectedDuration.getMonth() <= 12)
      {
        residentialProject.setEstimatedPrice(estimatedPrice);
        residentialProject.setExpectedDuration(expectedDuration);
        residentialProject.setSquareMeters(squareMeters);
        residentialProject.setNumberOfKitchens(numberOfKitchens);
        residentialProject.setNumberOfBathrooms(numberOfBathrooms);
        residentialProject.setOtherRoomsWithPlumbing(otherRoomsWithPlumbing);
        residentialProject.setNewBuild(isNewBuild);
        // Update other details as needed
      }
      else
      {

      }
    }




  public Industrial createDefaultIndustrialProject() {
    // You can set default values for Industrial projects here
    Industrial industrial = new Industrial("Industrial", new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0),
        new MyDate(0,0,0000),0, "New Build", 0, 0, 0, "null");

    // Set specific default values for Industrial
    double estimatedPrice = 2000000; // Set the default estimated price to 8000000
    MyDate expectedDuration = new MyDate(30);
    // Validate the estimated price and duration
    if (estimatedPrice >= 2000000 && estimatedPrice <= 10000000
        && expectedDuration.getMonth() >= 24 && expectedDuration.getMonth() <= 36) {
      industrial.setEstimatedPrice(estimatedPrice);
      industrial.setExpectedDuration(expectedDuration);
    } else {
      industrial.setEstimatedPrice(0);
      industrial.setExpectedDuration(new MyDate(0));
      industrial.calculateAndSetEstimatedDate();
    }

    return industrial;
  }
  public static void displayIndustrialDetails(Industrial industrialProject) {
    System.out.println("Square Meters: " + industrialProject.getSquareMeters());
    System.out.println("Facility Type: " + industrialProject.getFacilityType());
  }
  public void updateIndustrialDetails(Industrial industrialProject, MyDate expectedDuration, double estimatedPrice,
      double squareMeters, String facilityType) {
    if (estimatedPrice >= 2000000 && estimatedPrice <= 10000000
        && expectedDuration.getMonth() >= 24 && expectedDuration.getMonth() <= 36) {
      industrialProject.setEstimatedPrice(estimatedPrice);
      industrialProject.setExpectedDuration(expectedDuration);
      industrialProject.setSquareMeters(squareMeters);
      industrialProject.setFacilityType(facilityType);
      // Update other details as needed
    } else {
      // invalid value maybe squaremeters<0
    }
  }




  public RoadConstruction createDefaultRoadConstructionProject() {
    // You can set default values for Road Construction projects here
    RoadConstruction roadConstruction = new RoadConstruction(
        "RoadConstruction", new MyDate(26, 8, 2001), new MyDate(0, 0, 0000), new MyDate(0),
        new MyDate(0,0,0000),0, "New Build", 0, 0, 0, 10, 0, "none");

    double estimatedPrice = 1000000; // Set the default estimated price to 3000000
    MyDate expectedDuration = new MyDate(18); // Set the default duration to 18 months

    if (estimatedPrice >= 1000000 && estimatedPrice <= 5000000
        && expectedDuration.getMonth() >= 12 && expectedDuration.getMonth() <= 24) {
      roadConstruction.setEstimatedPrice(estimatedPrice);
      roadConstruction.setExpectedDuration(expectedDuration);
    } else {
      roadConstruction.setEstimatedPrice(0);
      roadConstruction.setExpectedDuration(new MyDate(0));
      roadConstruction.setExpectedDuration(expectedDuration);

    }

    return roadConstruction;
  }
  public static void displayRoadConstructionDetails(RoadConstruction roadConstructionProject) {
    System.out.println("Road Length (km): " + roadConstructionProject.getRoadLengthKilometers());
    System.out.println("Road Width (m): " + roadConstructionProject.getRoadWidthMeters());
    System.out.println("Number of Road Alterations: " + roadConstructionProject.getNumberOfRoadAlterations());
    System.out.println("Challenges: " + roadConstructionProject.getChallenges());
  }

  public void updateRoadConstructionDetails(RoadConstruction roadConstructionProject, MyDate expectedDuration, double estimatedPrice,
      double roadLengthKilometers, double roadWidthMeters, int numberOfRoadAlterations, String challenges)
  {
    if (estimatedPrice >= 1000000 && estimatedPrice <= 5000000
        && expectedDuration.getMonth() >= 12 && expectedDuration.getMonth() <= 24
        && roadLengthKilometers >= 0 && roadWidthMeters >= 0)
    {
      roadConstructionProject.setEstimatedPrice(estimatedPrice);
      roadConstructionProject.setExpectedDuration(expectedDuration);
      roadConstructionProject.setRoadLengthKilometers(roadLengthKilometers);
      roadConstructionProject.setRoadWidthMeters(roadWidthMeters);
      roadConstructionProject.setNumberOfRoadAlterations(numberOfRoadAlterations);
      roadConstructionProject.setChallenges(challenges);
      // Update other details as needed
    }
    else
    {
      // Handle invalid values as needed
    }
  }


  public Project createDefaultProject(String projectType) {
    Project project;

    switch (projectType) {
      case "RoadConstruction":
        project = createDefaultRoadConstructionProject();
        break;
      case "Residential":
        project = createDefaultResidentialProject();
        break;
      case "Commercial":
        project = createDefaultCommercialProject();
        break;
      case "Industrial":
        project = createDefaultIndustrialProject();
        break;

      default:
        throw new IllegalArgumentException("Unknown project type: " + projectType);
    }

    return project;
  }
  public Project createProjectForCustomer(String projectType, MyDate startDate) {
    Project project = createDefaultProject(projectType);
    project.setStartDate(startDate);

    // Additional settings or validations if needed

    addProject(project, false); // Assuming the project is not finished initially
    return project;
  }

}