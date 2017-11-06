
public class PracticeLoop {
public static void main(String []args){
	{
	      int[] array = {10, 20, 30, 40, 20, 10};
	      int sum = 0;
	    
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array "+sum);
	   }
	
	 int numbers[] = new int[]{45,60,5,32,43,53,54,32,65,63,98,43,23,100,520,12};
     
     
     int min = numbers[0];
     int max = numbers[0];
    
     for(int i=1; i< numbers.length; i++)
     {
             if(numbers[i] > max)
                     max = numbers[i];
             else if (numbers[i] < min)
                     min = numbers[i];
            
     }
    
     System.out.println("Largest Number is : " + max);
     System.out.println("Smallest Number is : " + min);
}
	
}
