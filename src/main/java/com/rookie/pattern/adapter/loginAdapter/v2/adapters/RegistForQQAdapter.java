package com.rookie.pattern.adapter.loginAdapter.v2.adapters;


import com.rookie.pattern.adapter.loginAdapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class RegistForQQAdapter implements RegistAdapter, LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
