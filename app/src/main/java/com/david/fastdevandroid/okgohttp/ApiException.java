package com.david.fastdevandroid.okgohttp;

/**
 * Created by Administrator on 2016/10/17.
 */

public class ApiException extends RuntimeException {

    public ApiException(String error_msg) {
        super(error_msg);
    }
}
