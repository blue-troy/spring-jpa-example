package club.bluetroy.spring.jpa.service.impl;

import club.bluetroy.spring.jpa.dao.StudentDAO;
import club.bluetroy.spring.jpa.domain.StudentDO;
import club.bluetroy.spring.jpa.dto.StudentDTO;
import club.bluetroy.spring.jpa.service.StudentBasicImportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentBasicImportService（导入学生基本信息服务、不包括导入学生课堂信息、教师信息）默认实现类。
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 11:41
 */
@Service
public class StudentBasicImportServiceImpl implements StudentBasicImportService {
    private final StudentDAO studentDAO;

    @Autowired
    public StudentBasicImportServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void importStudents(List<StudentDTO> students) {
        students.forEach(this::importStudent);
    }

    @Override
    public void importStudent(StudentDTO student) {
        StudentDO studentDO = BeanUtils.instantiateClass(StudentDO.class);
        BeanUtils.copyProperties(student, studentDO);
        studentDAO.save(studentDO);
    }
}

