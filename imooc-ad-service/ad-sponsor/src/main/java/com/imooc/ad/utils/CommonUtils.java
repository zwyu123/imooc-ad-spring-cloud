package com.imooc.ad.utils;

import com.imooc.ad.exception.AdException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;

public class CommonUtils {

    public static String md5(String value) {

        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
