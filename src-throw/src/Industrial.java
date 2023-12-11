class Industrial extends Project {
  private double squareMeters;
  private String facilityType;

  public Industrial(String projectType, MyDate startDate, MyDate endDate, MyDate expectedDuration,MyDate estimatedDate,
      double estimatedPrice, String projectStatus, int projectId, double manHoursUsed,
      double squareMeters,String facilityType) {
    super(projectType, startDate, endDate, expectedDuration,estimatedDate, estimatedPrice, projectStatus, projectId, manHoursUsed);
    this.squareMeters = squareMeters;
    this.facilityType=facilityType;
  }

  public double getSquareMeters() {
    return squareMeters;
  }

  public String getFacilityType() {
    return facilityType;
  }

  public void setSquareMeters(double squareMeters) {
    this.squareMeters = squareMeters;
  }

  public void setFacilityType(String facilityType) {
    this.facilityType = facilityType;
  }

  @Override public String toString()
  {
    StringBuilder result = new StringBuilder();
    result.append("Square Meters: ").append(this.getSquareMeters()).append("\n");
    result.append("Type Of Facility: ").append(this.getFacilityType()).append("\n");

    return result.toString();
  }

}