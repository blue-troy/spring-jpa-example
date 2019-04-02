package club.bluetroy.spring.jpa.service;

import club.bluetroy.spring.jpa.dto.StudentDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:导出学生基本信息服务、不包括导入学生课堂信息、教师信息
 *
 * @author: heyixin
 * Date: 2019-04-02
 * Time: 14:57
 */
public interface StudentBasicExportService {
    /**
     * 导出所有学生基本信息
     *
     * @return 学生基本信息列表
     */
    List<StudentDTO> export();
}
