package com.huaping.commoncore.utils;

import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.time.LocalDateTime;

public class LocalDateTimeUtilTest {
    @Test
    public void testLocalDateTimeUtil() {
        System.out.println(LocalDateTimeUtil.formatDate19Slash(LocalDateTime.now()));
    }

}
