/**
 * A class representing a type of project
 *
 * @author Ildo Mota
 * @version 1.0 December 2023
 */
public class RoadConstruction extends Project { // aa
  private double roadLengthKilometers;
  private double roadWidthMeters;
  private int numberOfRoadAlterations;
  private String challenges;

  public RoadConstruction(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,MyDate estimatedDate,
      double estimatedPrice, String projectStatus, int projectId, double manHoursUsed,
      double roadLengthKilometers,double roadWidthMeters,int numberOfRoadAlterations,String challenges) {
    super(projectType, startDate, endDate, expectedDuration,estimatedDate, estimatedPrice, projectStatus,projectId,manHoursUsed);

    this.roadLengthKilometers =roadLengthKilometers ;
    this.roadWidthMeters = roadWidthMeters;
    this.numberOfRoadAlterations = 0;
    this.challenges = "None";

  }

  public double getRoadLengthKilometers() {
    return roadLengthKilometers;
  }

  public double getRoadWidthMeters() {
    return roadWidthMeters;
  }

  public int getNumberOfRoadAlterations() {
    return numberOfRoadAlterations;
  }

  public String getChallenges() {
    return challenges;
  }


  public void setRoadLengthKilometers(double roadLengthKilometers) {
    this.roadLengthKilometers = roadLengthKilometers;
  }

  public void setRoadWidthMeters(double roadWidthMeters) {
    this.roadWidthMeters = roadWidthMeters;
  }

  public void setNumberOfRoadAlterations(int numberOfRoadAlterations) {
    this.numberOfRoadAlterations = numberOfRoadAlterations;
  }

  public void setChallenges(String challenges) {
    this.challenges = challenges;
  }

  @Override public String toString()
  {
    StringBuilder result = new StringBuilder();
    result.append("Lenght of Road in Kilometers: ").append(this.getRoadLengthKilometers()).append("\n");
    result.append("Width of Road in Meters: ").append(this.getRoadWidthMeters()).append("\n");
    result.append("Number Of Road Alterations: ").append(this.getNumberOfRoadAlterations()).append("\n");
    result.append("Challenges: ").append(this.getChallenges()).append("\n");

    // ... (other details specific to Commercial class)
    return result.toString();
  }


}

