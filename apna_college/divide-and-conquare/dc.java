





public class dc {

    public static void merge(int arr[], int si,int mid,int ei){
         int temp []=new int[arr.length];

         int i =si;//itarator 
         int j=mid+1;
         int k =0;

         while(i<=mid && j<=ei){
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
         }

         while (i<=mid) {
             temp[k++]=arr[i++];
         }
         while (j<=ei) {
             temp[k++]=arr[j++];
         }

         for(int x = si; x <= ei; x++){
             arr[x] = temp[x];
         }






    }

    public static void mersort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;

        mersort(arr, si, mid);
        mersort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    
    }

    public static void printarr(int arr []){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }

    }

    public static void quicksort(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        
        int pin = (ei-si)/2;
        quicksort(arr, si, pin-1);
        quicksort(arr, pin+1, ei);

        merge(arr,si,pin,ei);



        
            
        




    


    }



public static void main(String[] args) {
    

    int arr[]={6,3,9,5,2,8};
   // mersort(arr,0,arr.length-1);
   quicksort(arr, 0, arr.length);
   printarr(arr);
    //System.out.println(5/2);

}


    
}
