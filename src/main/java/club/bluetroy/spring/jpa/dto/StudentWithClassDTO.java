package club.bluetroy.spring.jpa.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:包含简单班级信息的学生DTO,班级信息不包括教师信息及学生信息
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 17:47
 */
@Data
public class StudentWithClassDTO {
    private String name;
    private Integer age;
    private SchoolClassDTO schoolClass;
}
