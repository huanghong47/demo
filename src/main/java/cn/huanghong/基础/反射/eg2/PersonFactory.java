package cn.huanghong.基础.反射.eg2;

/**
 * @program: demo
 * @description: 提高代码复用率，参考：https://blog.csdn.net/qq_36470686/article/details/85015753
 * @author: huanghong
 * @date: 2019-07-23 09:08
 */
public class PersonFactory {
     public static Person getperson(String classname) throws Exception {
         Class clazz = Class.forName(classname);
         Object object = clazz.getConstructor().newInstance();
         Person person = (Person)object;
         return person;
     }

    public static void main(String[] args) throws Exception  {
          Person person = getperson("cn.huanghong.基础.反射.eg2.Chinese");
          person.eat();
    }
}
