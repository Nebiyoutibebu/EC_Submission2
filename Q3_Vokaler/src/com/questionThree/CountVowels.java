
package com.questionThree;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
class  CountVowels {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\S*[aeiou][a-zA-Z]*[aeiou]\\S*", Pattern.CASE_INSENSITIVE);

        List<String> words = List.of("hello", "dr", "through", "db", "white", "firework", "waistline", "blue", "red", "black", "apricot");

        List<String> twoVowels = words
                .stream()
                .filter(x -> pattern.matcher(x).matches())
                .collect(Collectors.toList());

        System.out.println(twoVowels);


    }
}
/*
    class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "hello",
                "eye",
                "through",
                "db",
                "white",
                "firework",
                "waistline",
                "blue",
                "red",
                "black",
                "apricot"
        );

        for (String word : words) {
            String regex = "[AEIOUaeiou].*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(word);

            int from = 0;
            int count = 0;
            while (matcher.find(from)) {
                count++;
                from = matcher.start() + 1;
                if (count > 1) {
                    System.out.println(word);
                }

            }
        }
    }}

*/
//the above doesn't work properly for a count of vowels less than 2//
////better yet///