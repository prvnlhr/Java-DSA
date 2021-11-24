package Queue;

import Stack.StackEmptyException;
import java.util.Queue;
import java.util.Scanner;


public class StackUsingTwoQueuesUse{
	
	 public static void main(String[] args) {
		 
	        StackUsingQueues<Integer> s = new StackUsingQueues<>();
		        Scanner sc = new Scanner(System.in);
		        int choice; 
		        int input;
		            
		        while(true){
		                
		            choice = sc.nextInt();
		                
		            switch(choice){
		                case 1:
		                    input = sc.nextInt();
		                    s.push(input);
		                    break;
		                case 2:

		                    Integer ele = s.pop();

		                    if(ele != null) {
		                        System.out.println(ele);
		                    } else {
		                        System.out.println(-1);
		                    }
		                    break;
		                case 3:
		                    Integer elem = s.top();
		                    if(elem != null) {
		                        System.out.println(elem);
		                    } else {
		                        System.out.println(-1);
		                    }
		                    break;
		                case 4 :
		                    System.out.println(s.getSize());
		                    break;
		                case 5 : // Test
		                    Queue<Integer> q = s.getQueue();
		                    while(!q.isEmpty()) {
		                        Integer e = q.peek();
		                        q.remove();
		                        System.out.print(e + " ");
		                    }   
		                    System.out.println();
		                    return;
		                default:
		                    return;
		            }
		        }
		 } 
		 
	 }
//	        StackUsingTwoQueues<Integer> s = new StackUsingTwoQueues<Integer>();       
//	        
//	        int [] arr = { 5 , 10 , 20 , 30 , 50 , 60 };
//	        
//	        s.push(5);
//	        s.push(10);
//	        s.push(30);
//	        s.push(40);
//	        try {
//			System.out.print(s.top());
//			} catch (StackEmptyException e) {
//				// TODO Auto-generated catch block
//			}
//	        try {
//				System.out.println(s.pop());
//			} catch (StackEmptyException e) {
//				// TODO Auto-generated catch block
//			}
//	        Queue<Integer> p = s.getQueue();
//            while(!p.isEmpty()) {
//                Integer e = p.peek();
//                p.remove();
//                System.out.print(e + " ");
//            }   
//            System.out.println();
//	}
//
//}
