package cn.huanghong.testSE.test20Map;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: boccasecurityofproductionplatformbackside
 * @description: 数据来源
 * @author: huanghong
 * @date: 2019-08-28 08:52
 */
@Data
@NoArgsConstructor
public class MsgSource {
    public final static int SOURCE1 = 1;
    public final static int SOURCE2 = 2;

    public static final Map<Integer,MsgSource>msgSourceMap = new HashMap<Integer,MsgSource>(){{
        put(SOURCE1,new MsgSource(SOURCE1,"receive/r1"));
        put(SOURCE2,new MsgSource(SOURCE2,"aliyun"));
    }};

    private Integer type;
    private String desc;

    public MsgSource(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
