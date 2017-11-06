package exer;

import java.util.ArrayList;
import java.util.List;

public class Five {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
            words.add("pink");
            words.add("pinko");
            words.add("slink");
            words.add("penink");
            words.add("pinky");
            words.add("pinkard");
            words.add("sink");
            words.add("brink");
            words.add("stink");
            words.add("fink");
            words.add("ink");
            for (String word:words){
                if (word.length() == 5 ) {
                    System.out.println(word);
                }
//                else;

            }
    }
}
