package club.bluetroy.spring.jpa.service;

import club.bluetroy.spring.jpa.dao.StudentDAO;
import club.bluetroy.spring.jpa.dto.StudentDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentBasicExportService测试
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 15:14
 */
@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentBasicExportServiceTest {
    @Autowired
    private StudentBasicExportService service;
    @Autowired
    private StudentDAO dao;

    @Test
    public void testExport() {
        List<StudentDTO> studentDTOS = service.export();
    }

}