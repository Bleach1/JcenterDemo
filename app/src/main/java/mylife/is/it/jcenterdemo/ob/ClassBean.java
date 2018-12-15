package mylife.is.it.jcenterdemo.ob;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class ClassBean {
    @Id
    public long id;
    public String name;
    public int num;
    public ToOne<GradeBean> gradeBeanToOne;

    public ClassBean() {
    }

    public ClassBean(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
