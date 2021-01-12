
public class Person {
  private String firstName;
  private String lastName;
  private Double salary;
  private float height;
  private Boolean minor;
  private Gender gender;
// create constructor to accept all fields, google how to create all args constructor in java
 public Person(String firstName,String lastName,Double salary,float height,Boolean minor,Gender gender){

  this.firstName = firstName;
  this.lastName = lastName;
  this.salary = salary;
  this.height = height;
  this.minor = minor;
  this.gender = gender;

  }

  public void setfirstName(String newfirstName){

firstName = newfirstName;

  }
  public String getnewfirstName() {

return firstName;

  } 

  public void setlastName(String newlastName){

    lastName = newlastName;
    
      }
      public String getnewlastName() {
    
    return lastName;
    
      } 
      public void setsalary(Double newsalary){

       salary = newsalary;
        
          }
          public Double getnewsalary() {
        
        return salary;
        
          } 
          public void setheight(float newheight){

            height = newheight;
            
              }
              public float getnewheight() {
            
            return height;
            
              } 
              public void setminor(Boolean newminor){

                minor = newminor;
                
                  }
                  public Boolean getnewminor() {
                
                return minor;
                
                  } 
                  public void setgender(Gender newgender){

                    gender = newgender;
                    
                      }
                      public Gender getnewgender() {
                    
                    return gender;
                    
                      } 
  

 public void personDisplay(){

System.out.println("FirstName:"+getnewfirstName());
System.out.println();
System.out.println("LastName:"+getnewlastName());
System.out.println();
System.out.println("salary:"+getnewsalary()+" "+"L.E");
System.out.println();
System.out.println("Height:"+getnewheight()+" "+"Meter");
System.out.println();
System.out.println("Minor:"+getnewminor());
System.out.println();
System.out.println("Gender:"+getnewgender());











 }

}
