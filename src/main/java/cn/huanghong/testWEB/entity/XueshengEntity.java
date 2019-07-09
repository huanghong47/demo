package cn.huanghong.testWEB.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-01 10:45
 */
@Data
@NoArgsConstructor
public class XueshengEntity {
    private String uuid;
    private String name;
    private String banjiuuid;
    private BanjiEntity bj;
    private List<ChengjiEntity>cjs;

}
