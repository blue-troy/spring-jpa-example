package club.bluetroy.spring.jpa.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "school_class")
public class SchoolClassDO extends BaseDO {
    @Column(nullable = false)
    private Integer grade;
    @Column(nullable = false)
    private Integer classNumber;
    @OneToMany(mappedBy = "schoolClass")
    private List<StudentDO> students;
    @ManyToMany(mappedBy = "schoolClasses")
    private List<TeacherDO> teachers;
}
