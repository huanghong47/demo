package cn.huanghong.testWEB.entity;

import lombok.NoArgsConstructor;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-13 17:13
 */
@NoArgsConstructor
public class UserEntity {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
