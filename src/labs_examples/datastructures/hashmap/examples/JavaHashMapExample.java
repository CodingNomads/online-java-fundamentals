package labs_examples.datastructures.hashmap.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class JavaHashMapExample {

    public static void main(String[] args){
        // create the hashmap
        // the "key" will be the email, a String
        // and the "value" will the Person object
        HashMap<String, Integer> capitalCityPopulations = new HashMap();

        // "put" a few capital cities with their population
        capitalCityPopulations.put("Ottawa", 1077900);
        capitalCityPopulations.put("Lima", 11204000);
        capitalCityPopulations.put("Nairobi", 5541172);

        // demonstrate "getting" an
        // element out of the HashMap
        int limaPopulation = capitalCityPopulations.get("Lima");
        System.out.println(limaPopulation);

        // demonstrate iterating through
        // the entries of a HashMap
        Set entries = capitalCityPopulations.entrySet();
        Iterator iterator = entries.iterator();
        // loop through the entries
        while(iterator.hasNext()) {
        // get each Entry individually
        Map.Entry city = (Map.Entry)iterator.next();
        // print out the entry's key and value
        System.out.print(
            "The key is: "+ city.getKey() + " and the value is: " + city.getValue());
        }
    }
}
