package com.example.game.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResult implements Serializable {
    private String code;
    private String msg;
    private Object data;
    public static BaseResult succ(Object data) {
        BaseResult m = new BaseResult();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static BaseResult succ(String mess, Object data) {
        BaseResult m = new BaseResult();
        m.setCode("0");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
    public static BaseResult fail(String mess) {
        BaseResult m = new BaseResult();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }
    public static BaseResult fail(String mess, Object data) {
        BaseResult m = new BaseResult();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
