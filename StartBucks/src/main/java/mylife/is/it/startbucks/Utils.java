package mylife.is.it.startbucks;

import android.util.Log;

/**
 * - @Description:  测试类
 * - @Author:  Bleach
 * - @Time:  2018/12/5 19:53
 */
public enum Utils {
    /**
     * 单例实体
     */
    INSTANCES;

    public void printMsg(String msg) {
        Log.i("ljn", "printMsg: " + msg);
    }
}
