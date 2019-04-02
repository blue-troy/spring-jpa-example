package club.bluetroy.spring.jpa.dao;

import club.bluetroy.spring.jpa.domain.StudentDO;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentDAO test
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 15:03
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentDaoTest {
    @Autowired
    private StudentDAO studentDao;

    @Test
    public void testSave() {
        StudentDO studentDO = new StudentDO();
        studentDO.setAge(11);
        studentDO.setName("bluetroy");
        StudentDO save = studentDao.save(studentDO);
        TestCase.assertEquals(save.getAge(), save.getAge());
    }

    @Test
    public void testFindById() {
        StudentDO studentDO = new StudentDO();
        studentDO.setAge(11);
        studentDO.setName("bluetroy");
        StudentDO save = studentDao.save(studentDO);
        Optional<StudentDO> studentDaoById = studentDao.findById(save.getId());
        //TestCase.assertEquals(save,studentDaoById.get());
        System.out.println(studentDaoById);
    }
}