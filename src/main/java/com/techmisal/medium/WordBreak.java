package com.techmisal.medium;

import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word : wordDict) {
            s = s.replaceAll(word, "");
        }
        return s.isEmpty();
    }
}
