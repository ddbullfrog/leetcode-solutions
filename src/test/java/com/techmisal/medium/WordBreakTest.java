package com.techmisal.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class WordBreakTest {

    private WordBreak wordBreak = new WordBreak();

    @Test
    public void testWordBreak1() {
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean result = wordBreak.wordBreak("leetcode", wordDict);
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreak2() {
        List<String> wordDict = Arrays.asList("apple", "pen");
        boolean result = wordBreak.wordBreak("applepenapple", wordDict);
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreak3() {
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        boolean result = wordBreak.wordBreak("catsandog", wordDict);
        Assert.assertFalse(result);
    }
}
