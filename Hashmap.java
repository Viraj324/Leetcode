/* Online Java Compiler and Editor */
import java.util.*;

public class Hashing{
    public static void main(String args[]){
        //Country example
        HashMap<String,Integer> map = new HashMap<>();
        
        //Insertion
        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 150);
        
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
        
        //Search
        if(map.containsKey("China")){
            System.out.println("The key is Present...");
        }
        else{
            System.out.println("The key is not Present...");
        }
        
        //To get the value for a particuar key
        System.out.println(map.get("China"));//key exixt
        System.out.println(map.get("IChina"));//key dosent exits
        
        //New Type of for
        System.out.println("---------------------------------");
        System.out.println("New Type of For with using array");
        int arr[] = {1,2,3,4};
        for(int val:arr){
            System.out.println(val+"\t");
        }
        System.out.println("---------------------------------");
         for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
         }
        System.out.println("---------------------------------");
        System.out.println("Set of keys....");
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        
        System.out.println("---------------------------------");
         System.out.println("Remove an element " );
         map.remove("China");
        System.out.println(map);
         
        
        
        
        
    }
}
