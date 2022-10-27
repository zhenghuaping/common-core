package com.huaping.commoncore.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUtil {
    private static final String DATE_FORMAT_6 = "yyyyMM";
    private static final String DATE_FORMAT_8 = "yyyyMMdd";
    private static final String DATE_FORMAT_10 = "yyyy-MM-dd";
    private static final String DATE_FORMAT_16 = "yyyy-MM-dd HH:mm";
    private static final String DATE_FORMAT_17 = "yyyyMMdd HH:mm:ss";
    private static final String DATE_FORMAT_19 = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT_19_SLASH = "yyyy/MM/dd HH:mm:ss";

    private LocalDateTimeUtil() {

    }

    public static String formatDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT_19));
    }



    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate6(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_6));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate8(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_8));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate10(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_10));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate16(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_16));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate17(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_17));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate19(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_19));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的時間的字符串
     *
     * @param localDateTime
     * @return
     */
    public static String formatDate19Slash(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT_19_SLASH));
    }

}
