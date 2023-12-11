class Commercial extends Project
{
  private double squareMeters;
  private int numberOfFloors;
  private String buildingUse;

  public Commercial(String projectType, MyDate startDate, MyDate endDate, MyDate expecteDuration,
      MyDate estimatedDate, double estimatedPrice, String projectStatus, int projectId, double manHoursUsed,
      double squareMeters, int numberOfFloors, String buildingUse)
  {
    super(projectType, startDate, endDate, expecteDuration, estimatedDate,
        estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.numberOfFloors = 1;
    this.buildingUse = buildingUse;
  }

  public double getSquareMeters()
  {
    return squareMeters;
  }

  public void setSquareMeters(double squareMeters)
  {
    this.squareMeters = squareMeters;
  }

  public int getNumberOfFloors()
  {
    return numberOfFloors;
  }

  public void setNumberOfFloors(int numberOfFloors)
  {
    this.numberOfFloors = numberOfFloors;
  }

  public String getBuildingUse()
  {
    return buildingUse;
  }

  public void setBuildingUse(String buildingUse)
  {
    this.buildingUse = buildingUse;
  }

  @Override public String toString()
  {
    StringBuilder result = new StringBuilder();
    result.append("Square Meters: ").append(this.getSquareMeters()).append("\n");
    result.append("Number of Floors: ").append(this.getNumberOfFloors()).append("\n");
    result.append("Building Use: ").append(this.getBuildingUse()).append("\n");
    // ... (other details specific to Commercial class)
    return result.toString();
  }

}


