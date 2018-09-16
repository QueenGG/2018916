package com.bawei.chenxiaoxu.zhoukao3.model;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/9/15.
 */

public interface IModel {
    interface CallBack{
        void success(String string);
    }
    void getRequest(String urlString,CallBack callBack);
}
