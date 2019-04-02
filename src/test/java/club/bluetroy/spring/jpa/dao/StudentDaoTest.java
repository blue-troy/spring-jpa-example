package club.bluetroy.spring.jpa.dao;

import club.bluetroy.spring.jpa.domain.StudentDO;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentDAO test
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 15:03
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class StudentDaoTest {
    @Autowired
    private StudentDAO studentDao;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testSave() {
        StudentDO studentDO = getRandomStudentDO();

        StudentDO save = studentDao.save(studentDO);
        StudentDO find = entityManager.find(studentDO.getClass(), save.getId());

        assertThat(save).isEqualTo(find);
    }

    private StudentDO getRandomStudentDO() {
        Random random = new Random();
        StudentDO studentDO = new StudentDO();
        studentDO.setAge(random.nextInt(250));
        studentDO.setName(RandomStringUtils.randomAlphabetic(20));
        return studentDO;
    }

    @Test
    public void testFindById() {
        StudentDO studentDO = getRandomStudentDO();
        long id = entityManager.persistAndGetId(studentDO, Long.class);

        StudentDO findById = studentDao.findById(id).get();

        assertThat(findById).isEqualTo(studentDO);
    }
}