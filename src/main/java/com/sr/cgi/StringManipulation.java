package com.sr.cgi;

public class StringManipulation {
    public int vowelCount(String name) {
        int count = 0;
        String test = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char temp = test.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                ++count;
            }
        }
        return count;
    }

    public int characterCount(String str) {
        return str.length();
    }
}
