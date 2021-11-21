
package section_5;

import java.util.Scanner;
public class Section_5 
{
    public static void main(String[] args) 
    {
 
        Scanner input =new Scanner (System.in);
        MemberFactory getMember=new MemberFactory();
        System.out.println("Enter your member factory : ");
        String member=input.next();
        System.out.println("Enter salary : ");
        int salary =input.nextInt();
        System.out.println("Enter number of years work : ");
        int noOfYearsWork=input.nextInt();
        Staff st =getMember.getMemberFactory(member);
        st.getSalary(salary);
        st.getYearsOfWork(noOfYearsWork);
    
    }
}
