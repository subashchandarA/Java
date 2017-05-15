package sample;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark =55;
		char grade;
		String name = "Sachin Tendulkar";
		
		System.out.println("Result"+name);
        if(mark < 50)
        	{grade = 'F';
        	System.out.println("Fail"); }
        else
        {	 if (mark < 60)
        	grade = 'E';
        	else if (mark <70)
        		grade = 'D';
        	else
        		if (mark < 100)
                 grade = 'S';
        		else 
        		{
                     grade='P';
                     System.out.println("Check the mark");
        		}  
             System.out.println("Result : Pass"+"\nGrade"+grade);
             
             
        
        }        			
        			} 

}
