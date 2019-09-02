package cn.huanghong.testSE.test20Map;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: boccasecurityofproductionplatformbackside
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-08-28 13:41
 */
@Data
@NoArgsConstructor
public class MsgEqutype {

    public static final Map<String,MsgEqutype> dtuMsgEqutypeMap = new HashMap<String,MsgEqutype>(){{
        put("0",new MsgEqutype(MsgType.DTUTYPE,"0","感烟探头"));
        put("1",new MsgEqutype(MsgType.DTUTYPE,"1","感温探头"));
        put("2",new MsgEqutype(MsgType.DTUTYPE,"2","差温探头"));
        put("3",new MsgEqutype(MsgType.DTUTYPE,"3","剩余电流"));
    }};

    public static final Map<String,MsgEqutype> efeMsgEqutypeMap = new HashMap<String,MsgEqutype>(){{
        put("electrical",new MsgEqutype(MsgType.EFETYPE,"electrical","电气设备"));
    }};

    public static final Map<String,MsgEqutype> xfzjMsgEqutypeMap = new HashMap<String,MsgEqutype>(2){{
        put("101",new MsgEqutype(MsgType.XFZJTYPE,"101","火灾报警控制器"));
        put("102",new MsgEqutype(MsgType.XFZJTYPE,"102","烟感"));
        put("103",new MsgEqutype(MsgType.XFZJTYPE,"103","手报"));
        put("104",new MsgEqutype(MsgType.XFZJTYPE,"104","消火栓"));
        put("105",new MsgEqutype(MsgType.XFZJTYPE,"105","温感"));
        put("106",new MsgEqutype(MsgType.XFZJTYPE,"106","烟温复合"));
        put("107",new MsgEqutype(MsgType.XFZJTYPE,"107","声光报警"));
        put("108",new MsgEqutype(MsgType.XFZJTYPE,"108","备用"));
        put("109",new MsgEqutype(MsgType.XFZJTYPE,"109","备用"));
        put("110",new MsgEqutype(MsgType.XFZJTYPE,"110","备用"));
        put("111",new MsgEqutype(MsgType.XFZJTYPE,"111","输入模块"));
        put("112",new MsgEqutype(MsgType.XFZJTYPE,"112","输出模块"));
        put("113",new MsgEqutype(MsgType.XFZJTYPE,"113","输入输出模块"));
        put("114",new MsgEqutype(MsgType.XFZJTYPE,"114","防盗模块"));
        put("115",new MsgEqutype(MsgType.XFZJTYPE,"115","广播模块"));
        put("116",new MsgEqutype(MsgType.XFZJTYPE,"116","备用"));
        put("117",new MsgEqutype(MsgType.XFZJTYPE,"117","备用"));
        put("118",new MsgEqutype(MsgType.XFZJTYPE,"118","备用"));
        put("119",new MsgEqutype(MsgType.XFZJTYPE,"119","备用"));
        put("120",new MsgEqutype(MsgType.XFZJTYPE,"120","备用"));
        put("121",new MsgEqutype(MsgType.XFZJTYPE,"121","备用"));
        put("122",new MsgEqutype(MsgType.XFZJTYPE,"122","区域显示"));
        put("123",new MsgEqutype(MsgType.XFZJTYPE,"123","紫外"));
        put("124",new MsgEqutype(MsgType.XFZJTYPE,"124","可燃气体"));
        put("125",new MsgEqutype(MsgType.XFZJTYPE,"125","红外对射"));
        put("126",new MsgEqutype(MsgType.XFZJTYPE,"126","手动按钮"));
        put("127",new MsgEqutype(MsgType.XFZJTYPE,"127","启停按钮"));
        put("128",new MsgEqutype(MsgType.XFZJTYPE,"128","电梯"));
        put("129",new MsgEqutype(MsgType.XFZJTYPE,"129","风机"));
        put("130",new MsgEqutype(MsgType.XFZJTYPE,"130","卷帘门"));
        put("131",new MsgEqutype(MsgType.XFZJTYPE,"131","空调"));
        put("132",new MsgEqutype(MsgType.XFZJTYPE,"132","水流指示"));
        put("133",new MsgEqutype(MsgType.XFZJTYPE,"133","压力开关"));
        put("134",new MsgEqutype(MsgType.XFZJTYPE,"134","防火阀"));
        put("135",new MsgEqutype(MsgType.XFZJTYPE,"135","火灾显示盘"));
        put("136",new MsgEqutype(MsgType.XFZJTYPE,"136","干粉灭火"));
        put("137",new MsgEqutype(MsgType.XFZJTYPE,"137","紧急照明"));
        put("138",new MsgEqutype(MsgType.XFZJTYPE,"138","气压罐"));
        put("139",new MsgEqutype(MsgType.XFZJTYPE,"139","编码中继器"));
        put("140",new MsgEqutype(MsgType.XFZJTYPE,"140","柴油发电"));
        put("141",new MsgEqutype(MsgType.XFZJTYPE,"141","电池阀"));
        put("142",new MsgEqutype(MsgType.XFZJTYPE,"142","喷晒指示"));
        put("143",new MsgEqutype(MsgType.XFZJTYPE,"143","空压机"));
        put("144",new MsgEqutype(MsgType.XFZJTYPE,"144","联动电源"));
        put("145",new MsgEqutype(MsgType.XFZJTYPE,"145","排烟阀"));
        put("146",new MsgEqutype(MsgType.XFZJTYPE,"146","送风阀"));
        put("147",new MsgEqutype(MsgType.XFZJTYPE,"147","稳压泵"));
        put("148",new MsgEqutype(MsgType.XFZJTYPE,"148","泡沫泵"));
        put("149",new MsgEqutype(MsgType.XFZJTYPE,"149","喷淋泵"));
        put("150",new MsgEqutype(MsgType.XFZJTYPE,"150","配电盘"));
        put("151",new MsgEqutype(MsgType.XFZJTYPE,"151","水幕泵"));
        put("152",new MsgEqutype(MsgType.XFZJTYPE,"152","消火栓泵"));
        put("153",new MsgEqutype(MsgType.XFZJTYPE,"153","雨淋泵"));
        put("154",new MsgEqutype(MsgType.XFZJTYPE,"154","闸阀"));
        put("155",new MsgEqutype(MsgType.XFZJTYPE,"155","层号灯"));
        put("156",new MsgEqutype(MsgType.XFZJTYPE,"156","疏导指示"));
        put("157",new MsgEqutype(MsgType.XFZJTYPE,"157","高压水箱"));
        put("158",new MsgEqutype(MsgType.XFZJTYPE,"158","信号蝶阀"));
        put("159",new MsgEqutype(MsgType.XFZJTYPE,"159","漏电设备"));
        put("160",new MsgEqutype(MsgType.XFZJTYPE,"160","过流设备"));
        put("161",new MsgEqutype(MsgType.XFZJTYPE,"161","测温设备"));


        put("199",new MsgEqutype(MsgType.XFZJTYPE,"199","未知"));
    }};

    private Integer msgtype;
    private String equipmenttype;
    private String equipmenttypedesc;

    public MsgEqutype(Integer msgtype, String equipmenttype, String equipmenttypedesc) {
        this.msgtype = msgtype;
        this.equipmenttype = equipmenttype;
        this.equipmenttypedesc = equipmenttypedesc;
    }
}
