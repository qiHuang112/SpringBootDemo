package com.qi.demo;


import lombok.Data;

@Data
public class AjaxResponse {
    private boolean isok;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse() {

    }

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object obj) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResponse success(Object obj, String message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResponse error() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(false);
        ajaxResponse.setCode(500);
        ajaxResponse.setMessage("请求响应失败");
        return ajaxResponse;
    }

    public static AjaxResponse error(String message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(false);
        ajaxResponse.setCode(500);
        ajaxResponse.setMessage(message);
        return ajaxResponse;
    }

    public static AjaxResponse error(String message, Object obj) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(false);
        ajaxResponse.setCode(500);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
