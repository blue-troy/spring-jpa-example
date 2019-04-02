package club.bluetroy.spring.jpa.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:教师DO
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:50
 */
@Data
@Entity(name = "teacher")
public class TeacherDO extends BasePersonDO {
    @Column(nullable = false)
    private String subject;
    @ManyToMany
    private List<SchoolClassDO> schoolClasses;
}
