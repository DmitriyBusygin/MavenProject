package com.busdmv;

import org.apache.commons.lang3.StringUtils;
import java.io.*;

public class MavenProject {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст и программа даст инфомрацию о тексте: ");
        String text = reader.readLine();

        if(StringUtils.isAllUpperCase(text))
            System.out.println("В тексте только заглавные буквы");

        if(StringUtils.isAllLowerCase(text))
            System.out.println("В тексте только строчные буквы");

        if(StringUtils.isNumeric(text))
            System.out.println("Тест состоит из цифр");

        String tempReverse = StringUtils.reverse(text);
        System.out.println("Перевернутый текст: " + tempReverse);

        int length = StringUtils.length(text);
        System.out.println("Длина текста: " + length);

        if(length >= 5) {
            String tempRight = StringUtils.right(text, 5);
            System.out.println("Первые 5 символов текста: " + tempRight);
        } else {
            System.out.println("Длина текста менее 5 символов");
        }



        reader.close();

    }
}
