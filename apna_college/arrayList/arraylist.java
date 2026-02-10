import java.util.ArrayList;
import java.util.Collections;
public class arraylist{

    public static void reverseprint(ArrayList list){
        for(int i =list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

        
    }

    public static void swap( ArrayList<Integer> list , int idx1 ,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,idx2);
        list.set(idx2,temp);
    

    }

    public static int max( ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        for(int i =0;i<list.size();i++)
            {
                if(max<list.get(i)){
                    max=list.get(i);
                }

            }
            return max;
    }

    //collections.sort()- this will sort accending order 
    //collections is class ;
    //collection is a interface 



    public static void main(String[] args) {


        ArrayList<Integer>arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(7);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(8);
        arrlist.add(6);
        arrlist.add(4);
        arrlist.add(2);
        arrlist.add(3);

       //reverseprint(arrlist);

       //reverse arraylist print 
       
        //System.out.println(max(arrlist));

        System.out.println(arrlist);
        swap(arrlist, 2,3 );
        System.out.println(arrlist);


        System.out.println("sorter arraylist ");
        Collections.sort(arrlist);
        System.out.println(arrlist);


        Collections.sort(arrlist,Collections.reverseOrder());
        System.out.println("reverse order -"+arrlist);



        
    }


}