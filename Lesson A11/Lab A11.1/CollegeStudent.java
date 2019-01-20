/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */
	

/**
 * A class that sets and prints the info of a college student
 */
public class CollegeStudent extends Student {

	//Your code goes here
	private String major;
	private int year;
	
	/**
   * Constructor
   * @param name - student's name
   * @param age - student's age
   * @param gender - student's gender
   * @param idNum - student's id
   * @param gpa - student's gpa
   * @param year - student's year
   * @param major - student's major
   */
	public CollegeStudent(String name, int age, String gender,
	String idNum
	,double gpa, int year, String major)
	{
	   super(name,age,gender,idNum, gpa);
	   this.major=major;
	   this.year=year;
	}
	
	/**
	 * Method to set the year
	 * @param year - year of student
	 */
	public void setYear(int year){
	   this.year=year;
	}
	
	/**
	 * Method to set the major
	 * @param major - the student's major
	 */
	public void setMajor(String major)
	{
	   this.major=major;
	}
	
	/**
	 * Method to get the year
	 * @return - year of student
	 */
	public int getYear(){
	   return year;
	}
	
	/**
	 * Method to get major
	 * @return - the student's major
	 */
	public String getMajor()
	{
	   return major;
	}
	
	/**
   * Method to create a string with the student's information
   * @return string with student's information
   */
	public String toString()
	{
	   return super.toString()+", year: "+year+", major: "+major;
	}
	
}

/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */
	
	
	/**
	 * A class that sets and prints the info of a teacher
	 */
public class Teacher extends Person{
	//Your code goes here
	private String subject;
	private double salary;

	/**
	 * Constructor
	 * @param name - person's name
	 * @param age - person's age
	 * @param gender - person's gender
	 * @param subject - subject the teacher teaches
	 * @param salary - teacher's salary
	 */
	public Teacher(String name, int age, String gender, String subject, double salary)
   {
      super(name,age,gender);
      this.subject = subject;
      this.salary=salary;
   }
   
   /**
    * Method to set the teacher's salary
    * @param salary - teacher's salary
    */
   public void setSalary(double salary)
   {
      this.salary=salary;
   }
   
   /**
    * Method to set the teacher's subject
    * @param subject - teacher's subject
    */
   public void setSubject(String subject)
   {
      this.subject=subject;
   }

   /**
    * Method to get teacher's salary
    * @return - teacher's salary
    */
   public double getSalary(){
      return salary;
   }
   
   /**
    * Method to get teacher's subject
    * @return - teacher's subject
    */
   public String getSubject(){
      return subject;
   }
   
   /**
    * Method to create a string with the teacher's information
    * @return string with teacher's information
    */
   public String toString()
   {
      return super.toString()+", subject: "+subject+", salary: "+salary;
   }
}


