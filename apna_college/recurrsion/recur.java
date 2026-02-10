package recurrsion;
public class recur {


    public static  void printdec(int n){

        if (n==1) {
            System.out.println(n);
            return;
            
        }

        System.out.println(n +"");
        printdec(n-1);

    }

    public static void printinc(int n){
        
        if (n==1) {
            System.out.println(n);
            return;
            
        }
        
        printinc(n-1);
        System.out.println(n+" ");

    }

    public static int  fact(int n){

       
        if(n==0){
            return 1;
        }
         int fmn1=fact(n-1);
         int fn = n* fact(n-1);
         return fn;
        
    }
    public static int sum(int n){

        if(n==0){
            return 1;
        }
        int smn1=sum(n-1);
        int sn= n+sum(n-1);
        return sn;

    }

    public static int fib(int n){
        if(n==0){
            return n;
        } 
        if(n==1){
            return n;
        }
        int fbn1 = fib(n-1);
        int fbn2 = fib(n-2);
        int fn = fbn1+fbn2;
        return fn;

    }
    public static boolean sorted(int arr [], int i ){
        if(i==arr.length-1){
            return true;
        }


            if (arr[i]>arr[i+1]) {
                return false;
                
            } 
            return sorted(arr, i+1);
    }

    public static int firstoccurance(int arr[],int key, int i){
        if (i==arr.length) {
            return -1;
            
        }

        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }

    public static int lastoccrance(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
            
        }
        int isfound=lastoccrance(arr, key, i); 
        if (isfound==-1 && arr[i]==key) {
            return i;
            
        }
        return isfound ;

        
    
    }

    public static int power(int x , int n){
        if(n==1){
            return 1;
        }
        int xn1= power(x, n-1);
        int xn = x*xn1;
        return xn;
    }
    public static int tilling(int n){
        if (n==0 || n==1) {
            return 1;
            
        }

        //vertical 
        int vertical = tilling(n-1);

        int horizontal = tilling(n-2);

        int tw = vertical+horizontal;

        return tw;

    }


  public static void main(String[] args) {

    int arr []={1,2,345,6,7,8,9,10};
     int  n=5;
     //printdec(n);
     //printinc(n);
     //System.out.println(fact(n));
     // System.out.println(sum(n));
     //System.out.println(fib(n));
     System.out.println(tilling(n));
     


    
  } 
    
    
}
