package club.bluetroy.spring.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * Description:人DO基类对象
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:25
 */
@Setter
@Getter
@MappedSuperclass
public abstract class BasePersonDO extends BaseDO {
    @Column(nullable = false)
    protected String name;
    protected Integer age;
}
