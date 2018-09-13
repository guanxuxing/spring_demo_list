package cn.web.spring.freemarker.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2018/4/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class User {

    private String name;
    private Integer age;

}
