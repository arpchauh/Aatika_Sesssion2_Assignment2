package aatika;

public class Session2_Assignment2 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=100;i++){
			int k=0;
			for(j=2;j<i;j++){
				
				if(i%j==0){
					
					k=1;
					break;
				}
			}
			if(k==0){
				
				System.out.println(i);
			}
			
		
		}

	}

}
