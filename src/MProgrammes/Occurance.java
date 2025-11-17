package MProgrammes;

public class Occurance {
	
	public  static void FindOccuranceNUmberInAGivenArray() {
		
		   
		        int []x={1,11,2,12,3,11};
		       
		        for(int i=0;i<x.length;i++){
		             int occurance=1;
		            for(int j=i+1;j<x.length;j++){
		                
		                if(x[i]==x[j]){
		                    occurance++;
		                }
		                    
		                }
		    System.out.println("number : "+ x[i]+" " +   "occurance is :  "  + occurance);
		          
		           
		            }
		        }
		

    public static void main(String[] args) {
    	
           FindOccuranceNUmberInAGivenArray();
	}

    }
