package club.bluetroy.spring.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:学生DTO
 * 相等判断:两个本类实例对象所有属性相等的情况下也不认为这两个对象相等。
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 17:45
 */
@Getter
@Setter
@ToString
public class StudentDTO {
    private String name;
    private Integer age;
}