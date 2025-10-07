package Chapter02;

import java.util.HashMap;

public class WordDictionary {
    HashMap<String, String> wordDictionary = new HashMap<>();

    public void addWord(String english, String korean){
        wordDictionary.put(english, korean);
    }

    public String find(String english){
        for (String key : wordDictionary.keySet()){
            if (english.toLowerCase().equals(key.toLowerCase())){
                return wordDictionary.get(key);
            }
        }
        return null;
    }
}
