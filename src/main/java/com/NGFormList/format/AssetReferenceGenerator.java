package com.NGFormList.format;

public class AssetReferenceGenerator {
    private static String fixedPart;  // Dynamic prefix
    private static final String ALPHABETIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private int alphaIndex1 = 0;
    private int alphaIndex2 = 0;
    private int numericPart = 0;

    public void generateAssetReferenceNumber(String previousSequenceNumber, int count) {
        setPreviousSequenceNumber(previousSequenceNumber);

        for (int i = 0; i < count; i++) {
            System.out.println(generateSequenceNumber());
        }
    }

    private synchronized String generateSequenceNumber() {
        StringBuilder sb = new StringBuilder(fixedPart)
                .append(ALPHABETIC.charAt(alphaIndex1))
                .append(ALPHABETIC.charAt(alphaIndex2))
                .append(String.format("%04d", numericPart));

        updateSequence();

        return sb.toString();
    }

    private void updateSequence() {
        if (++numericPart > 9999) {
            numericPart = 0;
            if (++alphaIndex2 >= ALPHABETIC.length()) {
                alphaIndex2 = 0;
                if (++alphaIndex1 >= ALPHABETIC.length()) {
                    alphaIndex1 = 0; // Reset if needed
                }
            }
        }
    }

    private void setPreviousSequenceNumber(String previousSequenceNumber) {
        if (previousSequenceNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid sequence number format");
        }

        fixedPart = previousSequenceNumber.substring(0, 4); // Extract prefix dynamically

        char char1 = previousSequenceNumber.charAt(4);
        char char2 = previousSequenceNumber.charAt(5);

        alphaIndex1 = ALPHABETIC.indexOf(char1);
        alphaIndex2 = ALPHABETIC.indexOf(char2);

        if (alphaIndex1 < 0 || alphaIndex2 < 0) {
            throw new IllegalArgumentException("Invalid alphabetic part in sequence number");
        }

        try {
            numericPart = Integer.parseInt(previousSequenceNumber.substring(6));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid numeric part in sequence number");
        }
    }

    public static void main(String[] args) {
        String plx = "PLX";
        String e = "EAA";
        String n = "9999";

        AssetReferenceGenerator generator = new AssetReferenceGenerator();
        generator.generateAssetReferenceNumber(plx + e + n, 100);
    }
}
