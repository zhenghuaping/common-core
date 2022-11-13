package com.huaping.commoncore.utils;

import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class LocalDateTimeUtil {
    private static final String DATE6 = "yyyyMM";
    private static final String DATE8 = "yyyyMMdd";
    private static final String DATE10 = "yyyy-MM-dd";
    private static final String DATE_TIME_16 = "yyyy-MM-dd HH:mm";
    private static final String DATE_TIME_17 = "yyyyMMdd HH:mm:ss";
    private static final String DATE_TIME_19 = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_TIME_19_SLASH = "yyyy/MM/dd HH:mm:ss";
    private static final String DATE_TIME_24 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    private LocalDateTimeUtil() {

    }

    /**
     * 返回当前时间的yyyy-MM-dd HH:mm:ss格式的字符串
     *
     * @return String  yyyy-MM-dd HH:mm:ss格式的字符串
     */
    public static String formatDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_19));
    }

    /**
     * 返回yyyyMM格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyyMM格式的字符串
     */
    public static String formatDate6(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE6));
    }

    /**
     * 返回yyyyMMdd格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyyMMdd格式的字符串
     */
    public static String formatDate8(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE8));
    }

    /**
     * 返回yyyy-MM-dd格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyy-MM-dd格式的字符串
     */
    public static String formatDate10(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE10));
    }

    /**
     * 返回yyyy-MM-dd HH:mm格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyy-MM-dd HH:mm格式的字符串
     */
    public static String formatDateTime16(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_TIME_16));
    }

    /**
     * 返回yyyyMMdd HH:mm:ss格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyyMMdd HH:mm:ss格式的字符串
     */
    public static String formatDateTime17(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_TIME_17));
    }

    /**
     * 返回yyyy-MM-dd HH:mm:ss格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyy-MM-dd HH:mm:ss格式的字符串
     */
    public static String formatDateTime19(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_TIME_19));
    }

    /**
     * 返回yyyy/MM/dd HH:mm:ss格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyy/MM/dd HH:mm:ss格式的字符串
     */
    public static String formatDateTime19Slash(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(DATE_TIME_19_SLASH));
    }

    /**
     * 返回yyyy-MM-dd'T'HH:mm:ss.SSSZ格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @return yyyy-MM-dd'T'HH:mm:ss.SSSZ格式的字符串
     */
    public static String formatDateTime24(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }

        return ZonedDateTime.of(localDateTime, ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(DATE_TIME_24));
    }

    /**
     * 返回自定义日期格式的字符串
     *
     * @param localDateTime LocalDateTime对象
     * @param format 需要转换的格式
     * @return 返回自定义日期格式的字符串
     */
    public static String formatDateTime(LocalDateTime localDateTime, String format) {
        if (localDateTime == null) {
            return null;
        }

        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    public static LocalDateTime parseDate8(String dateStr) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyyMMdd")
                .toFormatter();
        return LocalDateTime.parse(dateStr, formatter);
    }

    public static LocalDateTime parseDate10(String dateStr) {

        return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(DATE10));
    }

    public static LocalDateTime parseDateTime19(String dateTimeStr) {

        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern(DATE_TIME_19));
    }

    public static LocalDateTime convertDateTime24to19(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return parseDateTime19(formatDateTime19(localDateTime));
    }
}
