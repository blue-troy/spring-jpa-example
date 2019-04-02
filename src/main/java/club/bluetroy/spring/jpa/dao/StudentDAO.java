package club.bluetroy.spring.jpa.dao;

import club.bluetroy.spring.jpa.domain.StudentDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentDAO
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:56
 */
public interface StudentDAO extends JpaRepository<StudentDO, Long> {
}
