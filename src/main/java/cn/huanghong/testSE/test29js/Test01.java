package cn.huanghong.testSE.test29js;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-05 14:14
 */
public class Test01 {
    public static void main(String[] args) throws IOException, ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");

        String jsFileName = "D:\\javaproject\\ideatestpro\\demo\\src\\main\\java\\cn\\huanghong\\testSE\\test29js\\脚本.js";   // 读取js文件

//        byte[] data = parseHexStr2Byte("fe016401006456dbff");
//        ByteBuffer byteBuffer = ByteBuffer.wrap(data);
        FileReader reader = new FileReader(jsFileName);   // 执行指定脚本
        engine.eval(reader);

        if(engine instanceof Invocable) {
            Invocable invoke = (Invocable)engine;
            Double c = (Double)invoke.invokeFunction("merge", 1,2);
            System.out.println("c = " + c);
        }

        reader.close();
    }
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1){
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}
