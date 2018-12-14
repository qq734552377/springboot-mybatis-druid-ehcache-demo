package org.spring.springboot.exceptionhandle;

import org.spring.springboot.exceptions.TishiException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pj on 2018/12/13.
 */
@RestControllerAdvice
public class ExceptionHandles {

    @ExceptionHandler(value = Exception.class)
    public String exception(HttpServletRequest request,
                            Exception exception){
        return exception.getMessage();
    }

    @ExceptionHandler(value = TishiException.class)
    public String tishiException(HttpServletRequest request,TishiException tishiException){
        return tishiException.getMessage();
    }
}
