import java.util.ArrayList;
import java.util.List;

public class Project
{
  private static int lastAssignedId = 1000;
  private String projectType;
  private MyDate startDate;
  private MyDate endDate;
  private MyDate estimatedDate;
  private MyDate expectedDuration;
  private double estimatedPrice;
  private String projectStatus;
  private boolean isFinished;
  private int projectId;
  private double manHoursUsed;

  public Project(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,MyDate estimatedDate,double estimatedPrice, String projectStatus,
      int projectId, double manHoursUsed)
  {
    this.projectType = projectType;
    this.startDate = startDate;
    if (endDate == null) {
      this.endDate = new MyDate(); // You can set a default value or leave it as null
    } else {
      this.endDate = endDate;
    }
    this.expectedDuration = expectedDuration;
    this.estimatedPrice = estimatedPrice;
    this.projectStatus = projectStatus;
    // Assuming the default value for isFinished is false when a project is created
    this.isFinished = false;
    this.projectId = ++lastAssignedId;
    this.manHoursUsed = 0;
    this.estimatedDate=estimatedDate;
  }

  // Getter methods...
  public String getProjectType()
  {
    return projectType;
  }

  public MyDate getStartDate()
  {
    return startDate;
  }

  public MyDate getEndDate()
  {
    return endDate;
  }

  public MyDate expectedDuration()
  {
    return expectedDuration;
  }

  public MyDate getEstimatedDate(){return estimatedDate;}

  public double getEstimatedPrice()
  {
    return estimatedPrice;
  }

  public String getProjectStatus()
  {
    return projectStatus;
  }

  public Boolean getFinishedProjects()
  {
    return isFinished;
  }

  public int getId()
  {
    return projectId;
  }

  public double getManHoursUsed()
  {
    return manHoursUsed;
  }

  // Setter methods...
  public void setProjectType(String projectType)
  {
    this.projectType = projectType;
  }



  public void setStartDate(MyDate startDate) {
    this.startDate = startDate;
    calculateAndSetEstimatedDate(); // Recalculate estimated date when start date changes
  }

  public void setEndDate(MyDate endDate) throws IllegalArgumentException {
    if (startDate != null && endDate != null && endDate.isBefore(startDate)) {
      throw new IllegalArgumentException("End date cannot be before the start date");
    }
    this.endDate = endDate;
  }


  public void setExpectedDuration(MyDate expectedDuration) {
    if (expectedDuration.getMonth() < 0) {
      throw new IllegalArgumentException("Expected duration months cannot be negative");
    }
    this.expectedDuration = expectedDuration; // Use expectedDuration instance variable
    calculateAndSetEstimatedDate(); // Recalculate estimated date when duration changes
  }

    public void calculateAndSetEstimatedDate() {
      // Ensure both startDate and expectedDuration are set
      if (startDate != null && expectedDuration != null) {
        this.estimatedDate = startDate.add(expectedDuration);
      }
    }

  public void setEstimatedPrice(double estimatedPrice) {
    if (estimatedPrice < 0) {
      throw new IllegalArgumentException("Estimated price cannot be negative");
    }
    this.estimatedPrice = estimatedPrice;
  }

  public void setProjectStatus(String projectStatus)
  {
    this.projectStatus = projectStatus;
  }

  public void setFinishedProjects(boolean isFinished)
  {
    this.isFinished = isFinished;
  }

  public void setProjectId(int projectId)
  {
    this.projectId = projectId;
  }

  public void setManHoursUsed(double manHoursUsed) throws IllegalArgumentException {
    if (manHoursUsed < 0) {
      throw new IllegalArgumentException("Man hours used cannot be negative");
    }
    this.manHoursUsed = manHoursUsed;
  }

  public String generateProgressReport() {
    StringBuilder report = new StringBuilder();

    // Basic project information
    report.append("Project ID: ").append(projectId).append("\n");
    report.append("Project Type: ").append(projectType).append("\n");
    report.append("Start Date: ").append(startDate).append("\n");
    report.append("Expected Duration: ").append(expectedDuration).append("\n");
    report.append("Estimated Date: ").append(estimatedDate).append("\n");
    report.append("End Date: ").append(endDate).append("\n");
    report.append("Estimated Price: $").append(estimatedPrice).append("\n");
    report.append("Project Status: ").append(projectStatus).append("\n");
    report.append("Is Finished: ").append(isFinished).append("\n");
    report.append("Man Hours Used: ").append(manHoursUsed).append("\n");

    if (projectStatus.equalsIgnoreCase("in-progress")) {
      report.append("Project is in-progress.").append("\n");
    } else if (projectStatus.equalsIgnoreCase("completed")) {
      report.append("Project is completed.").append("\n");
    }

    // Append subclass-specific details
    if (this instanceof Residential) {
      report.append(((Residential) this).toString());
    } else if (this instanceof Commercial) {
      report.append(((Commercial) this).toString());
    } else if (this instanceof Industrial) {
      report.append(((Industrial) this).toString());
    } else if (this instanceof RoadConstruction) {
      report.append(((RoadConstruction) this).toString());
    }

    return report.toString();
  }


}

