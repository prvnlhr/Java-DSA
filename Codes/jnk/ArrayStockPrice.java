package jnk;

import java.util.Scanner;

public class ArrayStockPrice {
	
	public static int maxprofit(int[] stockprices) {
	//Self Solved but exceeds time limit;
		int maxProfit=Integer.MIN_VALUE;
		int i;
		int j=0;
		
		for(i=0; i<stockprices.length-1;i++) {

			for( j=i; j<stockprices.length-1; j++) {
                 int current_maxProfit=(stockprices[j]-stockprices[i]);
	            
                 if(current_maxProfit>maxProfit){
					maxProfit=current_maxProfit;
					System.out.println(stockprices[j]+" "+stockprices[i]);
                   }
                 }
			  }
		
		return maxProfit;
	}
	
	//CN solution using Math.max function...didnt understood the math max function on 8/04/2020
//    int min=stockprices[0];
//    int maxProfit=0;
//    
//    for(int i=1;i<stockprices.length;i++){
//    	
//    	if(stockprices[i]<min) 
//    		min=stockprices[i];
//    		maxProfit=Math.max(maxProfit, stockprices[i]-min);
//    	          
//    		
//            System.out.println("min"+":"+min+" "+stockprices[i]+"-"+min+"="+" "+(stockprices[i]-min)+" "+maxProfit );
//    	
//    }
//    
//	return maxProfit;
//	}

      public static int[] takeinput(){

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] stockprices=new int[n];

		for(int i=0; i<stockprices.length;i++) {
			stockprices[i]=s.nextInt();
		}
		return stockprices;
	}

	public static void main(String[] args) {

		int stockprices[]=takeinput();
		int maxProfit=maxprofit(stockprices);
		System.out.println(maxProfit);
		
     }
  }
