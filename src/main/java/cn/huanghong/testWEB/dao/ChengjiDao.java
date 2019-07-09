package cn.huanghong.testWEB.dao;

import cn.huanghong.testWEB.entity.ChengjiEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-01 10:50
 */
@Repository
@Mapper
public interface ChengjiDao {
    void  insertbatch(List<ChengjiEntity> bjs);
    List<ChengjiEntity>getlist();
    ChengjiEntity getone(String uuid);
    List<ChengjiEntity>getByxueshenguuid(String xueshenguuid);
}
