package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Must implement Comparable<T> or create Comparator<T> class to sort
class WordFreq implements Comparable<WordFreq> {
    public String word;
    public int freq;

    public WordFreq(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int compareTo(WordFreq other) {
        if (other.freq != freq) {
            // return freq - other.freq;
            return other.freq - freq; // Reverse order
        }

        return word.compareTo(other.word);
    }
}
public class TopKFrequencyWords {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Long> freq = countWordFrequency(words);
        return freq
                .entrySet()
                .stream()
                .map(entry -> new WordFreq(entry.getKey(), entry.getValue().intValue() ))
                .sorted()
                .map(WordFreq::getWord)
                .limit(k)
                .toList();
    }

    private static Map<String, Long> countWordFrequency(String[] words) {
        return Arrays
                .stream(words)
                .collect(
                        Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()
                        )
                );
    }
}
