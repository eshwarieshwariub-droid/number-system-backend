package com.example.numbersystembackend.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public String convert(String number, String fromSystem, String toSystem) {
        int decimalValue;

        switch (fromSystem.toLowerCase()) {
            case "binary":
                decimalValue = Integer.parseInt(number, 2);
                break;
            case "octal":
                decimalValue = Integer.parseInt(number, 8);
                break;
            case "hex":
            case "hexadecimal":
                decimalValue = Integer.parseInt(number, 16);
                break;
            case "decimal":
                decimalValue = Integer.parseInt(number);
                break;
            default:
                throw new IllegalArgumentException("Invalid FROM system");
        }

        switch (toSystem.toLowerCase()) {
            case "binary":
                return Integer.toBinaryString(decimalValue);
            case "octal":
                return Integer.toOctalString(decimalValue);
            case "hex":
            case "hexadecimal":
                return Integer.toHexString(decimalValue).toUpperCase();
            case "decimal":
                return String.valueOf(decimalValue);
            default:
                throw new IllegalArgumentException("Invalid TO system");
        }

    }
}
