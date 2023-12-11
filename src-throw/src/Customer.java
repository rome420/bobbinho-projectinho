public class Customer
{
  String name;
  long phoneNumber;

  public Customer(String name, long phoneNumber)
  {
    this.name=name;
    this.phoneNumber=phoneNumber;
  }

  public String getName()
  {
    return name;
  }

  public long getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setName(String name)
  {
    this.name=name;
  }

  public void setPhoneNumber(long phoneNumber)
  {
    this.phoneNumber=phoneNumber;
  }
}

