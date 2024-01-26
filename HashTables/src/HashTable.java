/*
HK
1/26/23
CZ
 */
import java.util.ArrayList;
public class HashTable {

    ArrayList<String> values; // Stores the values in the hash table
    int size; // size

    // Constructor to initialize the hash table
    public HashTable(){
        values = new ArrayList<String>(); // Initialize the ArrayList
        size = 0; // Set the initial size to 0
    }


    public void addSize(int newIndex){
        // Expand the ArrayList up to the required index
        for(int i = 0; i <= newIndex; i++){
            // Check if the index is beyond the current size of the ArrayList
            if(values.size() <= newIndex && i >= values.size()){
                // Add empty strings to increase the size of the ArrayList
                values.add(i,"");
            }
        }
    }


    public boolean put(String key, String value){
        // Compute the hash code for the key
        int index = hashCode(key);
        // Ensure the ArrayList is large enough to hold the new element
        addSize(index);
        // Check for an existing element at the computed index
        if(!values.get(index).equals("")){
            return false; // Return false if there's a collision
        }
        else{
            size++; // Increment the size of the hash table
        }
        // Add the value at the computed index
        values.add(index, value);
        return true; // Return true to indicate successful addition
    }


    public String get(String key){
        // Compute the hash code for the key
        int index = hashCode(key);
        // Check if the index contains a non-empty string
        if(!values.get(index).equals("")){
            return values.get(index); // Return the value if it exists
        } else{
            return null; // Return null if the key is not found
        }
    }

    protected int hashCode(String key){
        StringBuilder output = new StringBuilder();
        int sum = 0;
        int val = (int)'0';
        for(int i = 0; i < key.length(); i++){
            // Compute a numeric value for each character in the key
            int num = ((int)key.charAt(i) - val) % 997;
            sum += num;
            System.out.println(num);
            output.append(num);
        }
        System.out.println("Total: " + sum);
        // Convert the computed value to an integer and return it
        return Integer.parseInt(output.toString());
    }
}
