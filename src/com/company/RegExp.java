package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

    /*
        \\d - одна цифра
        \\w = [a-zA-Z] - одна буква
        \\d = [0-9] - одна цифра

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символ до
        . - любой символ
        [^abc] - все символы кроме [abc]

        (a|b|c|d|e) = [abcde]

        {2} - 2 символа
        (\\d{2}) - 2 цифры
        {2,} - 2 или более символа
        {2,4} - от 2 до 4 символов

     */

        String a = "-2398745";
        String b = "2398745";
        String c = "+2398745";
        System.out.println(a.matches("(-|\\+)?\\d*"));

        String d = "33dsad1dsa8786986969";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String f = "Hell.there.hey";
        String[] words = f.split("\\.");
        System.out.println(Arrays.toString(words));

        String g = "Hell434523there24hey";
        String[] words2 = g.split("\\d+");
        System.out.println(Arrays.toString(words2));

        String h = "Hello there hey";
        String modifiedString = h.replaceAll(" ", ".");
        // replace - для замены на конкретную строку, replaceAll - для регулярных выражений
        // replaceFirst - заменяет только первый экземпляр



        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch.\n" +
                "Thanks, Joe! That's cool. I am sending you my address:\n" +
                "tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
