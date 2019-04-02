package club.bluetroy.spring.jpa.service;

import club.bluetroy.spring.jpa.dto.StudentDTO;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description: StudentBasicImportService测试
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 13:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentBasicImportServiceTest {
    @Autowired
    private StudentBasicImportService service;

    @Test
    public void testImportStudent() {
        StudentDTO studentDTO = getStudentDTO();
        service.importStudent(studentDTO);
    }

    private StudentDTO getStudentDTO() {
        Random random = new Random();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setAge(random.nextInt(250));
        studentDTO.setName(RandomStringUtils.randomAlphabetic(20));
        return studentDTO;
    }

    @Test
    public void testImportStudentList() {
        List<StudentDTO> studentDTOS = getStudents();
        service.importStudents(studentDTOS);
    }

    private List<StudentDTO> getStudents() {
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentDTOS.add(getStudentDTO());
        }
        return studentDTOS;
    }
}