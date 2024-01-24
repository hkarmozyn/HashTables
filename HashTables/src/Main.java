public class Main {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable();

        System.out.println("Size: " + hashTable.size);

        for (int i = 0; i < 5; i++) {
            String key = "Key" + i;
            String value = "Value" + i;
            boolean finished = hashTable.put(key, value);

            if (finished) {
                System.out.println("Added: " + key + " -> " + value);
            } else {
                System.out.println("Failed to add (Collision): " + key);
            }
        }

        for (int i = 0; i < 5; i++) {
            String key = "Key" + i;
            String retrievedValue = hashTable.get(key);

            if (retrievedValue != null) {
                System.out.println(" value for " + key + ": " + retrievedValue);
            } else {
                System.out.println("No key found: " + key);
            }
        }

    }
}
