package exer;
import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args){
        HashMap<Character, Integer> charCounts = new HashMap<>();
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = myString.toCharArray();
        for (char character : charactersInString){
            if (charCounts.containsKey(character)){
                charCounts.put(character, charCounts.get(character) + 1);
            }
            else {
                charCounts.put(character, 1);
        }
    }
        for (Map.Entry<Character, Integer> oneChar : charCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
}
}
//package exer;import java.util.HashMap; import java.util.Map; public class CharCount{public static void main(String
//[] args){HashMap<Character, Integer> charCounts=new HashMap<>();
//String myString="test string"; char[] charInString=myString.toCharArray(); for(char character:charInString){
//if(charCounts.containsKey(character)){charCounts.put(character, charCounts.get(character)+1);}
//else{charCounts.put(character,1);}}for(Map.Entry<Character, Integer> oneChar:charCounts.enterySet()){System.out.println(oneChar.getKey
//()+ ": " + oneChar.getValue()):}}}
