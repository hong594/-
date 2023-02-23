package com.qs.mybatis_0223.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private ResponseStatus status;
    private T data;//T代表全部对象，object
    /**
     * 正确返回数据
     */
    public static <T> ResponseResult<T> ok(T data){
        return new ResponseResult<T>(ResponseStatus.OK,data);
    }

    /**
     * 返回错误消息
     */
    public static ResponseResult<String> error(ResponseStatus status){
        return new ResponseResult<>(status,status.getMessage());
    }
    /**
     * 返回错误消息
     */
    public static ResponseResult<String> error(ResponseStatus status,String err){
        return new ResponseResult<>(status,err);
    }


}

