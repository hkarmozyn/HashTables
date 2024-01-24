import java.util.ArrayList;
public class HashTable {

    ArrayList<String> values;
    int size;

    public HashTable(){
       values = new ArrayList<String>();
       size = 0;

    }
    public void addSize(int newIndex){
        for(int i = 0; i <=newIndex; i++){
            if(values.size() <= newIndex && i >= values.size()){
                values.add(i,"");
            }
        }

    }



    public boolean put(String key, String value){
        int index = hashCode(key);
        addSize(index);
        if(!values.get(index).equals("")){
            return false;
        }
        else{
            size++;
        }
        values.add(index,value);
        return true;

    }


    public String get(String key){
        int index = hashCode(key);
        if(!values.get(index).equals("")){

            return values.get(index);
        } else{
            return null;
    }

    }


    private int hashCode(String key){
        StringBuilder output = new StringBuilder();
        int sum = 0;
        int val = (int)'0';
        for(int i = 0; i < key.length(); i++){
            int num = ((int)key.charAt(i) - val) % 997;
            sum += num;
            System.out.println(num);
            output.append(num);
        }
        System.out.println("Total: " + sum);
        return Integer.parseInt(output.toString());
    }
}
