package com.ssn.ad.advice;

import com.ssn.ad.exception.AdException;
import com.ssn.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: 范子祺
 **/
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdExcetion(HttpServletRequest request,
                                                    AdException e){
        CommonResponse<String> response = new CommonResponse<>(-1, "business error");
        response.setData(e.getMessage());
        return response;
    }
}
