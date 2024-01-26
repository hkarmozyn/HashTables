/*
HK
1/26/23
CZ
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of HashTable
        HashTable hashTable = new HashTable();

        // Print the initial size of the hash table
        System.out.println("Size: " + hashTable.size);

        // Loop to add key-value pairs to the hash table
        for (int i = 0; i < 5; i++) {
            // Create a key and value pair
            String key = "Key" + i;
            String value = "Value" + i;

            // Attempt to put the key-value pair into the hash table
            boolean finished = hashTable.put(key, value);

            // Check if the key-value pair was successfully added
            if (finished) {
                System.out.println("Added: " + key + " -> " + value);
            } else {
                // Print a message if there was a collision and the pair wasn't added
                System.out.println("Failed to add (Collision): " + key);
            }
        }

        // Loop to retrieve and print values from the hash table
        for (int i = 0; i < 5; i++) {
            // Create a key to retrieve its corresponding value
            String key = "Key" + i;

            // Retrieve the value associated with the key from the hash table
            String retrievedValue = hashTable.get(key);

            // Check if a value was successfully retrieved
            if (retrievedValue != null) {
                System.out.println("Value for " + key + ": " + retrievedValue);
            } else {
                // Print a message if no value was found for the key
                System.out.println("No key found: " + key);
            }
        }
    }
}
