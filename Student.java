import java.util.*;

class Student
{
	//fields
	private int tno;
	private String name;
	private double cgpa;
	
	//Student constructor
	public Student(int tno,String name,double cgpa)
	{
		this.tno=tno;
		this.name=name;
		this.cgpa=cgpa;

	}
	//returns the token number assigned to each student
	public int getToken() 
	{
        	return this.tno;
   	}
	// returns name of the student
	public String getName() 
	{
      		return this.name;
   	}
	//returns cgpa of the student
   	public double getCgpa() 
	{
      		return this.cgpa;
	}

	
	public boolean compare(Student st)
   	{
       	// first priority on basis of cgpa
        if (this.cgpa > st.cgpa)
	{
            return true; 
        }
	else if(this.cgpa < st.cgpa)
	{  
           return false;
	}
	// second priority on basis of name
        if(this.name.compareTo(st.name) < 0)
	{
           return true;
	}
	else if(this.name.compareTo(st.name) > 0)
	{
           return false;
        }
	// if the name and cgpa is same and give priority to the student with less token number
        else{
            if(this.tno < st.tno){ 
               return false;
            }
        }
        return true;
	}
}
