package cn.huanghong.基础.反射.eg1;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-22 15:38
 */
public class Fanshe {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("student2");
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        //获取class对象的方式
        //方式1
        Class c1 = student1.getClass();
        //方式2
        Class c2 = Student.class;
        //方式3
        try {
            Class c3 = Class.forName("cn.huanghong.基础.反射.eg1.Student");

            //判断以上三种方式产生的class对象是否同一个
            System.out.println(c1==c2);
            System.out.println(c1==c3);
            System.out.println(c2==c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //判断不同的Student对象产生的Class对象是否一样
        Class c4 = student2.getClass();
        System.out.println(c2==c4);

        //结论：程序运行期间，一个类，只有一个Class对象产生。
        // 其中一般采用第三种方式，因为第一种方式比较多余，已经有了对象student1或student2，还要反射做什么；第二种方式需要强制导入包
    }
}
