package com.marianbastiurea.c07list;

import java.util.*;

public class Decoder {
    public static void main(String[] args) {
        // Original message (pangram examples)
        String clear1 = "the quick brown fox jumps over a lazy dog";
        String clear2 = "pack my box with five dozen liquor jugs";

        // FIXED cipher maps
        Map<Character, Character> cipher1 = fixedCipher("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"); // reversed alphabet
        Map<Character, Character> cipher2 = fixedCipher("abcdefghijklmnopqrstuvwxyz", "phqgiumeaylnofdxjkrcvstzwb"); // random valid mapping

        // Encrypt the base messages
        String encrypted1 = applyCipher(clear1, cipher1);
        String encrypted2 = applyCipher(clear2, cipher2);

        // Message to encrypt and send on day 3
        String originalMessage = "pack my box";

        // Simulate encryption from Mihai to Alin (reverse of day 2, then apply day 1)
        String encryptedMessage = applyCipher(applyCipher(originalMessage, invert(cipher2)), cipher1);

        // Build reverse mappings
        Map<Character, Character> cipher1Reverse = invert(cipher1);
        Map<Character, Character> cipher2Reverse = invert(cipher2);

        // Decryption: reverse day 1 first, then re-apply day 2 mapping
        Map<Character, Character> finalMap = new HashMap<>();
        for (char ch : encryptedMessage.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                char intermediate = cipher1Reverse.getOrDefault(lower, '?');
                char decoded = cipher2.getOrDefault(intermediate, '?');
                finalMap.put(lower, decoded);
            }
        }

        // Decode the message
        StringBuilder result = new StringBuilder();
        for (char ch : encryptedMessage.toCharArray()) {
            if (Character.isLetter(ch)) {
                char decoded = finalMap.getOrDefault(Character.toLowerCase(ch), '?');
                result.append(Character.isUpperCase(ch) ? Character.toUpperCase(decoded) : decoded);
            } else {
                result.append(ch);
            }
        }

        // Output
        System.out.println("Original message:         " + originalMessage);
        System.out.println("Encrypted message (Day 3): " + encryptedMessage);
        System.out.println("Decoded message:           " + result.toString());
    }

    // Applies a cipher to a given string
    private static String applyCipher(String input, Map<Character, Character> cipher) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                char encoded = cipher.getOrDefault(lower, lower);
                result.append(Character.isUpperCase(ch) ? Character.toUpperCase(encoded) : encoded);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Inverts a map: value ➝ key
    private static Map<Character, Character> invert(Map<Character, Character> map) {
        Map<Character, Character> reversed = new HashMap<>();
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }

    // Creates a fixed mapping from string a ➝ string b
    private static Map<Character, Character> fixedCipher(String from, String to) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < from.length(); i++) {
            map.put(from.charAt(i), to.charAt(i));
        }
        return map;
    }
}
