package club.bluetroy.spring.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:包含简单班级信息的学生DTO,班级信息不包括教师信息及学生信息
 * 相等判断:两个本类实例对象所有属性相等的情况下也不认为这两个对象相等。
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 17:47
 */
@Setter
@Getter
@ToString
public class StudentWithClassDTO {
    private String name;
    private Integer age;
    private SchoolClassDTO schoolClass;
}
