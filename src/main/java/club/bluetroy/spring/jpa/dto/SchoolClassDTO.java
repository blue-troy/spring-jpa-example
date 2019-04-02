package club.bluetroy.spring.jpa.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:班级DTO、不包含学生以及教师信息
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 17:48
 */
@Data
public class SchoolClassDTO {
    private Integer grade;
    private Integer classNumber;
}
