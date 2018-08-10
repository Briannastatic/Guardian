package com.songoda.guardian.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static void log(String message) {
        log(message, true);
    }

    public static void log(String message, boolean includeStamp) {

        StringBuilder stringBuilder = new StringBuilder();

        if (includeStamp) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formatDateTime = now.format(formatter);

            stringBuilder.append("[").append(formatDateTime).append(" INFO]: ");
        }
        stringBuilder.append(message);

        System.out.println(stringBuilder.toString());

    }
}
