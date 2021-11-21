
package section_5;

public class TeachingAssistant implements Staff
{
    @Override
    public void getSalary(int salary) 
    {
        System.out.println("The Salary = "+ salary);
    }

    @Override
    public void getYearsOfWork(int noOfYearsWork) 
    {
        System.out.println( "The number of years work = "+(noOfYearsWork));
    }
    
}
