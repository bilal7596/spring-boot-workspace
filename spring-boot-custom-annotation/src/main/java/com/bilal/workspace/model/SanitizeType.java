package com.bilal.workspace.model;

import java.util.regex.Pattern;

public enum SanitizeType {
    NUMBER("^-?\\d+$", "Given input is not number"),                // Integer (positive or negative)
    DECIMAL("^-?\\d+(\\.\\d+)?$", "Given input is not Decimal");

    public final String selectedRegex;
    public final String selectedMessage;

    SanitizeType(String regex, String message) {
        selectedRegex = regex;
        selectedMessage = message;
    }

    // Method to validate input against the pattern
    public boolean validate(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }

}