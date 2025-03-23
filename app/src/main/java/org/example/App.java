package org.example;

import org.apache.commons.lang3.StringUtils;

public class App {

    // Methode für Test (damit AppTest.java funktioniert)
    public String getGreeting() {
        return "Hello from test!";
    }

    public static void main(String[] args) {
        String original = "   DevOps    ";
        String trimmed = StringUtils.trim(original);

        System.out.println("Original: '" + original + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
    }
}
