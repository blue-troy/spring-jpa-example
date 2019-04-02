package club.bluetroy.spring.jpa.service.impl;

import club.bluetroy.spring.jpa.dao.StudentDAO;
import club.bluetroy.spring.jpa.domain.StudentDO;
import club.bluetroy.spring.jpa.dto.StudentDTO;
import club.bluetroy.spring.jpa.service.StudentBasicExportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:StudentBasicExportService（导出学生基本信息服务、不包括导入学生课堂信息、教师信息）默认实现类。
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 15:00
 */
@Service
public class StudentBasicExportServiceImpl implements StudentBasicExportService {
    private final StudentDAO studentDAO;

    @Autowired
    public StudentBasicExportServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<StudentDTO> export() {
        List<StudentDO> studentDOS = studentDAO.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>(studentDOS.size());
        studentDOS.forEach(studentDO -> {
            StudentDTO studentDTO = BeanUtils.instantiateClass(StudentDTO.class);
            BeanUtils.copyProperties(studentDO, studentDTO);
            studentDTOS.add(studentDTO);
        });
        return studentDTOS;
    }
}
