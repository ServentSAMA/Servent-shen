package com.serventshen.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author ：申文杰
 * @description：区域信息解析器
 * @date ：2020/12/12 16:10
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String encode = request.getParameter("encode");
        Locale locale = null;
        if (!StringUtils.isEmpty(encode)){
            String[] split = encode.split("_");

            locale =  new Locale(split[0],split[1]);

        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
