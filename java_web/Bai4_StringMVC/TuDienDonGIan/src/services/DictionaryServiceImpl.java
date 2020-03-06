package services;


import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImpl implements DictionaryService{
    private static Map<String, String> dictionaryMap = new HashMap<>();

    static {
        dictionaryMap.put("Hello","Xin chao");
        dictionaryMap.put("hi","Xin chao chao");
        dictionaryMap.put("2","Xin ");
        dictionaryMap.put("dog","con cho");
        dictionaryMap.put("cat","con meo");

    }

    @Override
    public String findByEnglish(String eng) {
        for (Map.Entry me : dictionaryMap.entrySet()) {
          if(me.getKey().equals(eng)) {
              return (String) me.getValue();
          }
        }
        return null;
    }
}
