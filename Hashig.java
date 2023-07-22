//HashSet
/* Online Java Compiler and Editor */
import java.util.*;

public class Hashing{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        //Search Conatinas
        if(set.contains(1)){
            System.out.println("The Value is Present...");
        } //Returns a boolean value
        else{
            System.out.println("The Value is not  Present...");
        }
        
        //Delete Function 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("The Value 1 is not  Present...\n We deleted 1");
        }
        
        //Size 
        System.out.println("The size of set : "+set.size());
        
        //To print all the elements of the set
        System.out.println(set);
        
        
        //Itterator 
        Iterator it = set.iterator();
        //It has 2 mjor functions
        //hasnest() ,ncxt();
        //hasnext() :- Returns next,If the next value is present in the array, else return false
        //next():- Return the next value in the array
        //Loop to traverse an array
        while(it.hasNext()){
            System.out.println(it.next());
            
        }
        
    }
}
