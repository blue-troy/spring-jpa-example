package club.bluetroy.spring.jpa.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * Description:学生DO
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:38
 */
@Data
@Entity(name = "student")
@EqualsAndHashCode(callSuper = true)
public class StudentDO extends BasePersonDO {
    @ManyToOne
    private SchoolClassDO schoolClass;
}
