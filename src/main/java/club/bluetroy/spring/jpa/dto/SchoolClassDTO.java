package club.bluetroy.spring.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:班级DTO、不包含学生以及教师信息.
 * 相等判断:两个本类实例对象所有属性相等的情况下也不认为这两个对象相等。
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 17:48
 */
@Getter
@Setter
@ToString
public class SchoolClassDTO {
    private Integer grade;
    private Integer classNumber;
}
