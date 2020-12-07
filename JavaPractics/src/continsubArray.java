
public class continsubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[]input = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
		 int sum = 23;
		 int currentSum = 0;
		 int p = 0;
		  for(int i = 0 ; i< input.length ; i++) {
			  currentSum = input[i];
			  
			  for(int j = i+1 ; j <= input.length ;j++) {
				  if(currentSum == sum) {
					   p = j-1;
					   System.out.println("Subarray index ->" + i +","+ p); 
					   break;
					 
				  }else if(currentSum < sum && i!=j){
					  currentSum = currentSum+input[j];
				  }
			  }
			 
		  }
		
			
		}
		
		
		
		
	
}
