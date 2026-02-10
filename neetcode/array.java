package neetcode;

public class array {

    
    public int[] twoSum(int[] nums, int target) {
        int temp[]=new int[2];
           
       for(int i =0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            if((nums[i]+nums[j])==target){
                
            temp[0]=nums[i];
            temp[1]=nums[j];


        }

        }
        
       }
       return temp ;
    } 


        
    

    public static void main(String[] args) {

        int arr []={3,4,5,6};

        array n =new array();
        

        
        
        
        for(int i =0 ; i<arr.length;i++){
            System.out.println(n.twoSum(arr , 7));
        }
        
    }
}

    

