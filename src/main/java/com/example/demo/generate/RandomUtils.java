//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomUtils {
    private static String[] lowercase = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static String[] capital = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static String[] number = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private static String[] sign = new String[]{"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "`", "-", "=", "{", "}", "|", ":", "\"", "<", ">", "?", "[", "]", "\\", ";", "'", ",", ".", "/"};
    private static Random random = new Random();

    public RandomUtils() {
    }

    public static void main(String[] args) {
        System.out.println(getRandom(24, RandomUtils.TYPE.CAPITAL));
    }

    public static String getRandom(int num, RandomUtils.TYPE type) {
        ArrayList<String> temp = new ArrayList();
        StringBuffer code = new StringBuffer();
        if (type == RandomUtils.TYPE.LETTER) {
            temp.addAll(Arrays.asList(lowercase));
        } else if (type == RandomUtils.TYPE.CAPITAL) {
            temp.addAll(Arrays.asList(capital));
        } else if (type == RandomUtils.TYPE.NUMBER) {
            temp.addAll(Arrays.asList(number));
        } else if (type == RandomUtils.TYPE.SIGN) {
            temp.addAll(Arrays.asList(sign));
        } else if (type == RandomUtils.TYPE.LETTER_CAPITAL) {
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(capital));
        } else if (type == RandomUtils.TYPE.LETTER_NUMBER) {
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(number));
        } else if (type == RandomUtils.TYPE.LETTER_CAPITAL_NUMBER) {
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(capital));
            temp.addAll(Arrays.asList(number));
        } else if (type == RandomUtils.TYPE.LETTER_CAPITAL_NUMBER_SIGN) {
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(capital));
            temp.addAll(Arrays.asList(number));
            temp.addAll(Arrays.asList(sign));
        }

        for(int i = 0; i < num; ++i) {
            code.append((String)temp.get(random.nextInt(temp.size())));
        }

        return code.toString();
    }

    public static enum TYPE {
        LETTER,
        CAPITAL,
        NUMBER,
        SIGN,
        LETTER_CAPITAL,
        LETTER_NUMBER,
        LETTER_CAPITAL_NUMBER,
        LETTER_CAPITAL_NUMBER_SIGN;

        private TYPE() {
        }
    }
}
