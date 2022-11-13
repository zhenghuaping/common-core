package com.huaping.commoncore.utils;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@Slf4j
public class LocalDateTimeUtilTest {
    /**
     * testFormatDate6
     */
    @Test
    public void testFormatDate6() {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 6, 23, 12, 32);
        String dateStr = LocalDateTimeUtil.formatDate6(localDateTime);
        log.info("dateStr={}", dateStr);
    }

    /**
     * testFormatDate8
     */
    @Test
    public void testFormatDate8() {
        String dateStr = LocalDateTimeUtil.formatDate8(LocalDateTime.now());
        log.info("dateStr={}", dateStr);
    }

    /**
     * testFormatDate10
     */
    @Test
    public void testFormatDate10() {
        String dateStr = LocalDateTimeUtil.formatDate10(LocalDateTime.now().plusDays(1));
        log.info("dateStr={}", dateStr);
    }

    /**
     * testFormatDateTime17
     */
    @Test
    public void testFormatDateTime17() {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 3, 17, 23, 32, 23);
        String dateStr = LocalDateTimeUtil.formatDateTime17(localDateTime);
        log.info("dateStr:{}", dateStr);
    }

    /**
     * testParseDate19
     */
    @Test
    public void testParseDate19() {
        String dateStr = LocalDateTimeUtil.formatDateTime19(LocalDateTime.now());
        log.info("dateStr={}", dateStr);
        LocalDateTime localDateTime = LocalDateTimeUtil.parseDateTime19(dateStr);
        log.info("localDateTime={}", localDateTime);
    }

    /**
     * testConvertDateTime24to19
     */
    @Test
    public void testConvertDateTime24to19() {
        LocalDateTime localDateTime = LocalDateTimeUtil.convertDateTime24to19(LocalDateTime.now().minusMinutes(2));
        log.info("localDateTime={}", localDateTime);
    }
}
