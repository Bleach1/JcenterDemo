package mylife.is.it.jcenterdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import mylife.is.it.jcenterdemo.R;
import mylife.is.it.jcenterdemo.ob.ClassBean;
import mylife.is.it.jcenterdemo.ob.GradeBean;
import mylife.is.it.jcenterdemo.ob.MyObjectBox;

public class MainActivity extends AppCompatActivity {
    private BoxStore boxStore;
    private Box<ClassBean> classBeanBox;
    private Box<GradeBean> gradeBeanBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boxStore = MyObjectBox.builder().androidContext(this).build();
        gradeBeanBox = boxStore.boxFor(GradeBean.class);
        classBeanBox = boxStore.boxFor(ClassBean.class);
        GradeBean gradeBean = new GradeBean("LJN");
        ClassBean ljn0 = new ClassBean("ljn0", 200);
        ClassBean ljn1 = new ClassBean("ljn1", 201);
        ClassBean ljn2 = new ClassBean("ljn2", 202);
        ClassBean ljn3 = new ClassBean("ljn3", 203);
        ljn0.gradeBeanToOne.setTarget(gradeBean);
        ljn1.gradeBeanToOne.setTarget(gradeBean);
        ljn2.gradeBeanToOne.setTarget(gradeBean);
        ljn3.gradeBeanToOne.setTarget(gradeBean);
        classBeanBox.put(ljn0);
        classBeanBox.put(ljn1);
        classBeanBox.put(ljn2);
        classBeanBox.put(ljn3);
        long put = gradeBeanBox.put(gradeBean);

        boxStore.runInTx(new Runnable() {
            @Override
            public void run() {
                
            }
        });
        List<GradeBean> gradeBeanBoxAll = gradeBeanBox.getAll();
        Log.i("ljn", "onCreate: " + gradeBeanBoxAll.get(0).classBeans.size());
    }
}
