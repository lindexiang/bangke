package com.neuq.info.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.neuq.info.enums.ResultStatus;

/**
 * Created by lihang on 2017/4/4.
 */
public class ResultResponse {
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    /**
     * 返回内容
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object content;

    public ResultResponse(int code, Object content) {
       this.code = code;
       this.content = content;
    }

    public ResultResponse(int code, String message,  Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public ResultResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultResponse() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResultModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
