package cn.huanghong.testSE.test20Map;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: boccasecurityofproductionplatformbackside
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-08-28 08:58
 */
@Data
@NoArgsConstructor
public class MsgType {
    public static final Integer DTUTYPE = 1;
    public static final Integer EFETYPE = 2;
    public static final Integer XFZJTYPE = 3;

    public static final Map<Integer,MsgType> msgTypeMap = new HashMap<Integer,MsgType>(){
        {
            put(DTUTYPE,new MsgType(MsgSource.SOURCE2,DTUTYPE,"jb3208","DTU"));
            put(EFETYPE,new MsgType(MsgSource.SOURCE2,EFETYPE,"SDF300","EFE"));
            put(XFZJTYPE,new MsgType(MsgSource.SOURCE1,XFZJTYPE,"XFZJ","XFZJ"));
        }
    };

    //来源
    private Integer source;
    //标识
    private Integer type;
    //阿里的类型描述
    private String alidesc;
    //自定义的类型描述
    private String mydesc;

    public MsgType(Integer source, Integer type, String alidesc, String mydesc) {
        this.source = source;
        this.type = type;
        this.alidesc = alidesc;
        this.mydesc = mydesc;
    }

}
