package com.kesen.ssm.common;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @className: com.kesen.ssm.common-> CommonResult
 * @description:
 * @author: kesen
 * @createDate: 2021-12-17 18:17
 * @version: 1.0
 */
public class CommonResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义错误状态码
     * 0  成功
     * 1 及以上为失败
     */
    protected int code_ = 0;

    /**
     * 摘要信息，有错误或异常时即为错误信息（客户端不应该直接显示该message，而应该自己根据code的业务标识判断，返回友好的提示给用户）
     */
    protected String msg_;

    /**
     * 有错误或异常时，更加详细的错误信息（如异常堆栈信息）
     * 前端更加当前是开发环境或生产环境选择性的展示该信息
     */
    protected String detail_;

    /**
     * 是否忽略该提示消息
     * true 忽略  false 不忽略
     * 预留属性，若在某些场景下，不希望前端处理给出提示框可以关闭该属性
     */
    protected boolean ignore_ = true;

    /**
     * 消息级别  30 (紧急 高 中 低)
     */
    protected int level_ = 30;

    /**
     * 跳转路径
     */
    protected String path_;

    /**
     * 服务器时间
     */
    protected Date now_ = new Date();


    /**
     * 业务数据
     */
    protected Object data;


    public int getCode_() {
        return code_;
    }

    public void setCode_(int code_) {
        this.code_ = code_;
    }

    public String getMsg_() {
        return msg_;
    }

    public void setMsg_(String msg_) {
        this.msg_ = msg_;
    }

    public String getDetail_() {
        return detail_;
    }

    public void setDetail_(String detail_) {
        this.detail_ = detail_;
    }

    public boolean isIgnore_() {
        return ignore_;
    }

    public void setIgnore_(boolean ignore_) {
        this.ignore_ = ignore_;
    }

    public int getLevel_() {
        return level_;
    }

    public void setLevel_(int level_) {
        this.level_ = level_;
    }

    public String getPath_() {
        return path_;
    }

    public void setPath_(String path_) {
        this.path_ = path_;
    }

    public Date getNow_() {
        return now_;
    }

    public void setNow_(Date now_) {
        this.now_ = now_;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
