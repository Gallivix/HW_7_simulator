package utils;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.String.format;

public class RandomUtils {


    static void main() {
        System.out.println(getRandomString(8));
        System.out.println(getRandomEmail());
        System.out.println(getRandomNumber(10));
        System.out.println(getRandomInt(111111111, 888888888));
        System.out.println(getRandomPhone());
        //System.out.println(getRandomGender_bad_practice());
        System.out.println(getRandomGender());
    }

    /*public static String getRandomGender_bad_practice() {
        String[] genders = {"Male", "Female", "Other"};
        int randomIndex = getRandomInt(0, 2);
        return gender[randomIndex];
    }*/

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return getRandomItemFromStringArray(genders);
    }

    public static String getRandomItemFromStringArray(String[] stringArray) {
        int arrayLenght = stringArray.length;
        int randomIndex = getRandomInt(0, arrayLenght -1);
        return stringArray[randomIndex];
    }

    public static String getRandomPhone() {
        String phoneTemplate = "+%s (%s) %s - %s - %s";
        return format(phoneTemplate, getRandomInt(1,9), getRandomInt(111,999),
                getRandomInt(111,999), getRandomInt(11,99), getRandomInt(11,99));
    }

    public  static String getRandomEmail() {
        //return getRandomString(8) + ("@") + getRandomString(8) + ".com";
        return format("%s@%s.com", getRandomString(8), getRandomString(8)) ;
    }

    public void randomNumber() {
        System.out.println(getRandomString(8));
    }


    public static String getRandomString(int lenght) {
        String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopstuvwxyz";
        //String LETTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new SecureRandom();
        for(int i =0; i< lenght; i++) {
            result.append(
                    LETTERS.charAt(                       // random letter from A to z
                            rnd.nextInt(                  //random from 0 to 10
                                    LETTERS.length())));  //10


        }
        return result.toString();
    }

    public static String getRandomNumber(int lenght) {
        String LETTERS = "0123456789";
        //String LETTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopstuvwxyz";
        StringBuilder result = new StringBuilder();
        SecureRandom rnd = new SecureRandom();
        for(int i =0; i< lenght; i++) {
            result.append(
                    LETTERS.charAt(                       // random letter from A to z
                            rnd.nextInt(                  //random from 0 to 10
                                    LETTERS.length())));  //10


        }
        return result.toString();
    }

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max +1);
        //SecureRandom rnd = new SecureRandom();
        //return rnd.nextInt(max +1) ;
    }

}
