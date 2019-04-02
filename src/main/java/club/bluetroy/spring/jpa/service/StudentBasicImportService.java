package club.bluetroy.spring.jpa.service;

import club.bluetroy.spring.jpa.dto.StudentDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:导入学生基本信息服务、不包括导入学生课堂信息、教师信息
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 11:36
 */
public interface StudentBasicImportService {
    /**
     * 导入一个学生基本信息、不包括学生课堂信息、教师信息
     *
     * @param student 学生基本信息
     */
    void importStudent(StudentDTO student);

    /**
     * 导入列表中的所有学生基本信息、不包括学生课堂信息、教师信息
     *
     * @param students 学生基本信息列表
     */
    void importStudents(List<StudentDTO> students);
}
