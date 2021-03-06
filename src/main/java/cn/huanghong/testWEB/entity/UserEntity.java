package cn.huanghong.testWEB.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-13 17:13
 */
@Data
@NoArgsConstructor
public class UserEntity {

    private Integer id;

    private String name;

    List<RoleEntity>roles;

    public UserEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserEntity(String name) {
        this.name = name;
    }
}
