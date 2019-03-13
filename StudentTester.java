import java.util.*;

class StudentTester
{
public static ArrayList <Student> squeue = new ArrayList<>();

public static void main(String[] args) 
    	{
	    int n;
	    Scanner sc = new Scanner(System.in);
	    n = Integer.parseInt(sc.nextLine());
	    while(n>0){
	       String [] arr_queue = sc.nextLine().split(" ");
	       if(arr_queue.length == 1){
		    if(!squeue.isEmpty()){
		        squeue.remove(0);
		    }
		}
		else
		{
		    Student st = new Student(Integer.parseInt(arr_queue[3]),arr_queue[1],Double.parseDouble(arr_queue[2]));
		    insertStudent(st);
		}      
		 n=n-1;
	        }
		if(squeue.size() > 0){
		    for(int j = 0;j <squeue.size();j++)
		    {
		        System.out.println(squeue.get(j).getName());
		    }
		}
		else
		{
		    System.out.println("EMPTY");
		}
		    
    }

	
	
    
    	public static void insertStudent(Student st)
    	{
        int pos = 0;
	int j;
        for(j = 0;j < squeue.size() ;j++){
            if(squeue.get(pos).compare(st))
	    {
                pos = j+1;
            }
	    else
	    {
                break;
            }
        }
       		 squeue.add(pos,st);
    	}
    
 }


