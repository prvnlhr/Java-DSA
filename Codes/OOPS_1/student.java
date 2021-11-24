package OOPS_1;

public class student {
	
	//we are creating a class which has name and roll no of a student
	
	 String name;
   	private int rollno;
   	
   	
//   	public int getRollno() {
//   		return rollno;
//   	}
//	
//   	public void setRollno(int num) {
//   		
//   		if(num>0) {
//   		 rollno=num;
//   		}
//   		else {
//   		 rollno=0;;
//   		}
//   	}
//
//}

 //so we are passing a number int num to set function which eventually is the rollno.
//if we directly write rollno at place of num we will get answer=0 even if we are passing value 100
//because rollno=100 is assigned to local rollno which have no effect so we get value of local variable instead of 100
// so what we can do is we can use this keyword...
//      

//    public int getRollno() {
// 	   return rollno;
//    }
//    
//    public void setRollno(int rollno) {
// 	   if(rollno>0) {
// 		    rollno=rollno;    //if we use rollno=rollno we get answer=0 even we are passing 100
// 	   }
// 	   else {
// 		   rollno=0;
// 	    }
//     }
//   }
   	
   public int getRollno() {
	   return rollno;
   }
   
   public void setRollno(int rollno) {
	   if(rollno>0) {
		   this.rollno=rollno;    //using this.rollno stores the value of rollno same as what we have pass
		                          //and not like local variable
	   }
	   else {
		   this.rollno=0;
	   }
     }
   }