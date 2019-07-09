package cn.huanghong.testWEB.dao;

import cn.huanghong.testWEB.entity.BanjiEntity;
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
public interface BanjiDao {
    void  insertbatch(List<BanjiEntity>bjs);
    List<BanjiEntity>getlist();
    BanjiEntity getone(String uuid);
}