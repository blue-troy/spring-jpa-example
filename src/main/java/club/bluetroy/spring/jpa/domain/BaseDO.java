package club.bluetroy.spring.jpa.domain;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:基类,每个DO必须继承
 *
 * @author: heyixin
 * Date: 2019-04-01
 * Time: 14:21
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @CreatedDate
    @Column(name = "gmt_create", nullable = false)
    protected LocalDateTime createTime;
    @LastModifiedDate
    @Column(name = "gmt_modified", nullable = false)
    protected LocalDateTime modifyTime;
}