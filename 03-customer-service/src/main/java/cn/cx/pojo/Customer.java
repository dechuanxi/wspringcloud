package cn.cx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WDZ
 * @date 2020/9/14
 * @time 18:39
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private Integer age;

}
