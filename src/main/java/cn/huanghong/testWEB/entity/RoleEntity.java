package cn.huanghong.testWEB.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-27 10:28
 */
@Data
@NoArgsConstructor
public class RoleEntity {

    private Integer id;

    private String name;

    private Integer userid;

    public RoleEntity(Integer id, String name, Integer userid) {
        this.id = id;
        this.name = name;
        this.userid = userid;
    }

    public RoleEntity(String name, Integer userid) {
        this.name = name;
        this.userid = userid;
    }
}
