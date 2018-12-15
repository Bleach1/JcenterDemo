package mylife.is.it.jcenterdemo.ob;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class GradeBean {
    @Id
    public long id;
    public String name;

    public GradeBean() {
    }

    public GradeBean(String name) {
        this.name = name;
    }

    @Backlink(to = "gradeBeanToOne")
    public ToMany<ClassBean> classBeans;
}
