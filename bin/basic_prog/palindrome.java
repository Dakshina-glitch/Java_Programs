class Palindrome{  
 public static void main(String args[]){  
  int remain,sum=0;    
  int input=454, temp;  
  
  temp=input;    
  while(input>0){    
   remain=input%10; 
   sum=(sum*10)+remain;    
   input=input/10;    
  }    
  if(temp==sum)    
   System.out.println("Palindrome");    
  else    
   System.out.println("not Palindrome");    
}  
} 
