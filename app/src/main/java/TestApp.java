import android.annotation.SuppressLint;
import android.app.Application;

import io.objectbox.BoxStore;
import mylife.is.it.jcenterdemo.ob.MyObjectBox;

/**
 * - @Description:
 * - @Author:  Bleach
 * - @Time:  2018/12/8 16:35
 */

public class TestApp extends Application {
    private static TestApp instance;
    private static BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public static synchronized BoxStore getBoxStore() {
        return boxStore;
    }

    public static synchronized TestApp getInstance() {
        return instance;
    }
}
