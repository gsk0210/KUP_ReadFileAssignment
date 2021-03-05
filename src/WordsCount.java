import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCount {

    static List<String> patternMatch(String text,String pattern){
        List words=new ArrayList();
        Matcher matcher= Pattern.compile(pattern).matcher(text);
        while (matcher.find())
            words.add(matcher.group());
        return words;
    }

    static public Map frequency(String text){
        HashMap<String,Integer> hashMap=new HashMap<>();
        patternMatch(text,"\\w+").stream().map(word->word.toLowerCase()).forEach(word->hashMap.put(word,hashMap.getOrDefault(word,0)+1));
        return hashMap;
    }
}
