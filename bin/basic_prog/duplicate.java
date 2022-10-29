class Duplicate {
    public static void main(String args[]) {
        
        int nums[]={3,1,3,4,2}; 
        int one=0,two=0;
        
        do{
            one=nums[one];
            two=nums[nums[two]];
        }
        while(one!=two);
        
        two=0;
        while(one!=two){
            one=nums[one];
            two=nums[two];
        }
         System.out.println("Duplicate : "+one);
    }
}
