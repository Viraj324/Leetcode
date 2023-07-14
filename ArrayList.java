import java.util.*;

class ArrayList1{
    public static void main(String[] args) {
        /*
         * Different types of Object datatypes in java are 
         * Integer | Float | Double | String | Boolean
         * All these datatypes Start with an Captial casing such as Capital 'I' for Integer
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();*/

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        //Get Elements 
        //To get the elements at the zeroth Index
        int elements = list.get(1);
        System.out.println(elements);

        //Add element in between
        list.add(1,1);
        //Previously the list was : [1, 2, 3]
        //Now the updated  list is: [1, 1, 2, 3]
        System.out.println(list);

        //Set element 
        //Zeroth elemet la 5  value set keli
        list.set(0, 5);
        //Previously the list was : [1, 1, 2, 3]
        //Now the updated  list is: [5, 1, 2, 3]
        System.out.println(list);

        //Delete Element 
        list.remove(3);
        //Previously the list was : [5, 1, 2, 3] 
        //Now the updated  list is: [5, 1, 2] 
        System.out.println(list);

        //Size 
        int size = list.size();
        System.out.println(size);

        //Itterate the ArrayList
        for(int i = 0;i<size;i++){
            System.out.println(list.get(i));
        }

        //Sorting the arrayList
        Collections.sort(list);
        System.out.println(list);
    }
}
