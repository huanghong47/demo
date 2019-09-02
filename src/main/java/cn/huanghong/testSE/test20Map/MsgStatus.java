package cn.huanghong.testSE.test20Map;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: boccasecurityofproductionplatformbackside
 * @description: 原始报警状态类型
 * @author: huanghong
 * @date: 2019-08-28 13:25
 */
@Data
@NoArgsConstructor
public class MsgStatus {

    public static final Map<String,MsgStatus> dtuMsgStatusMap = new HashMap<String,MsgStatus>(){{
        put("1",new MsgStatus(MsgType.DTUTYPE,"1","火警",""));
        put("2",new MsgStatus(MsgType.DTUTYPE,"2","监管报警",""));
        put("3",new MsgStatus(MsgType.DTUTYPE,"3","屏蔽",""));
        put("7",new MsgStatus(MsgType.DTUTYPE,"7","模块启动",""));
        put("8",new MsgStatus(MsgType.DTUTYPE,"8","故障",""));
        put("16",new MsgStatus(MsgType.DTUTYPE,"16","回路板上通讯故障",""));
        put("78",new MsgStatus(MsgType.DTUTYPE,"78","短路",""));
        put("79",new MsgStatus(MsgType.DTUTYPE,"79","开路",""));
        put("83",new MsgStatus(MsgType.DTUTYPE,"83","气体控制板通讯故障",""));
        put("196",new MsgStatus(MsgType.DTUTYPE,"196","应急广播故障",""));
    }};

    public static final Map<String,MsgStatus> efeMsgStatusMap = new HashMap<String,MsgStatus>(){{
        put("sol",new MsgStatus(MsgType.EFETYPE,"sol","过载报警","过载"));
        put("sov",new MsgStatus(MsgType.EFETYPE,"sov","电压报警","过压"));
        put("suv",new MsgStatus(MsgType.EFETYPE,"suv","电压报警","欠压"));
        put("nfp",new MsgStatus(MsgType.EFETYPE,"nfp","缺相报警","缺相"));
        put("soc",new MsgStatus(MsgType.EFETYPE,"soc","电流报警","过流"));
        put("elfault",new MsgStatus(MsgType.EFETYPE,"elfault","漏电报警","漏电互感器断线"));
        put("elalarm",new MsgStatus(MsgType.EFETYPE,"elalarm","漏电报警","漏电超限报警"));
        put("t1fault",new MsgStatus(MsgType.EFETYPE,"t1fault","温度1报警","线路1温度传感器断线"));
        put("t1alarm",new MsgStatus(MsgType.EFETYPE,"t1alarm","温度1报警","线路1温度超限报警"));
        put("t2fault",new MsgStatus(MsgType.EFETYPE,"t2fault","温度2报警","线路2温度传感器断线"));
        put("t2alarm",new MsgStatus(MsgType.EFETYPE,"t2alarm","温度2报警","线路2温度超限报警"));
        put("t3fault",new MsgStatus(MsgType.EFETYPE,"t3fault","温度3报警","线路3温度传感器断线"));
        put("t3alarm",new MsgStatus(MsgType.EFETYPE,"t3alarm","温度3报警","线路3温度超限报警"));
        put("t4fault",new MsgStatus(MsgType.EFETYPE,"t4fault","温度4报警","线路4温度传感器断线"));
        put("t4alarm",new MsgStatus(MsgType.EFETYPE,"t4alarm","温度4报警","线路4温度超限报警"));
    }};

    public static final Map<String,MsgStatus> xfzjMsgStatusMap = new HashMap<String,MsgStatus>(){{
        put("000",new MsgStatus(MsgType.XFZJTYPE,"000","无操作",""));
        put("101",new MsgStatus(MsgType.XFZJTYPE,"101","火警",""));
        put("102",new MsgStatus(MsgType.XFZJTYPE,"102","测试报警",""));
        put("103",new MsgStatus(MsgType.XFZJTYPE,"103","手动报警",""));
        put("104",new MsgStatus(MsgType.XFZJTYPE,"104","低限报警",""));
        put("105",new MsgStatus(MsgType.XFZJTYPE,"105","高限报警",""));
        put("106",new MsgStatus(MsgType.XFZJTYPE,"106","超量程报警",""));
        put("107",new MsgStatus(MsgType.XFZJTYPE,"107","剩余电流报警",""));
        put("108",new MsgStatus(MsgType.XFZJTYPE,"108","温度报警",""));
        put("109",new MsgStatus(MsgType.XFZJTYPE,"109","电弧报警",""));
        put("110",new MsgStatus(MsgType.XFZJTYPE,"110","预警",""));
        put("111",new MsgStatus(MsgType.XFZJTYPE,"111","模拟报警",""));
        put("112",new MsgStatus(MsgType.XFZJTYPE,"112","监管报警",""));

        put("301",new MsgStatus(MsgType.XFZJTYPE,"301","故障",""));
        put("302",new MsgStatus(MsgType.XFZJTYPE,"302","部件故障",""));
        put("303",new MsgStatus(MsgType.XFZJTYPE,"303","主电故障",""));
        put("304",new MsgStatus(MsgType.XFZJTYPE,"304","备电故障",""));
        put("305",new MsgStatus(MsgType.XFZJTYPE,"305","系统故障",""));
        put("306",new MsgStatus(MsgType.XFZJTYPE,"306","公共故障",""));
        put("307",new MsgStatus(MsgType.XFZJTYPE,"307","总线故障",""));
        put("308",new MsgStatus(MsgType.XFZJTYPE,"308","通讯故障",""));
        put("309",new MsgStatus(MsgType.XFZJTYPE,"309","回路故障",""));
        put("310",new MsgStatus(MsgType.XFZJTYPE,"310","启动线路故障",""));
        put("311",new MsgStatus(MsgType.XFZJTYPE,"311","喷洒线路故障",""));
        put("312",new MsgStatus(MsgType.XFZJTYPE,"312","反馈线路故障",""));
        put("313",new MsgStatus(MsgType.XFZJTYPE,"313","喷洒反馈线路故障",""));
        put("314",new MsgStatus(MsgType.XFZJTYPE,"314","灯具故障",""));
        put("315",new MsgStatus(MsgType.XFZJTYPE,"315","输出线故障",""));
        put("316",new MsgStatus(MsgType.XFZJTYPE,"316","输入线故障",""));
        put("317",new MsgStatus(MsgType.XFZJTYPE,"317","多线线路故障",""));

//        put("801",new MsgStatus(MsgType.XFZJTYPE,"801","其他",""));
    }};
    /**
     * 格式类型
     */
    private Integer msgtype;

    /**
     * 报警状态值
     */
    private String msgstatus;

    /**
     * 报警状态描述
     */
    private String msgstatusdesc;


    /**
     * 报警描述
     */
    private String msgdetail;

    public MsgStatus(Integer msgtype, String msgstatus, String msgstatusdesc, String msgdetail) {
        this.msgtype = msgtype;
        this.msgstatus = msgstatus;
        this.msgstatusdesc = msgstatusdesc;
        this.msgdetail = msgdetail;
    }
}
