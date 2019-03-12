package cn.huanghong.testSE.test05equal;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-28 16:45
 */
public class User {
    private Integer id;

    private Long uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public User(Integer id, Long uid) {
        this.id = id;
        this.uid = uid;
    }
}
