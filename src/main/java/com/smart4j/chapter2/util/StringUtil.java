package com.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Yang on 2016/4/5.
 * 字符串工具类
 */
public final class StringUtil {

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }




}