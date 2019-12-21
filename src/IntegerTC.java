/*
   int是JAVA八大基本数据类型（byte,shor,int,long,char,boolean,float,double）之一。
   JAVA语言为八大基本数据提供了包装类，Integer对应是int类型的包装类，就是
把int类型包装成Object对象。　　
   Java有2种不同的类型：引用类型和原始类型。
   原始数据类型引用数据类型　　
   booleanBoolean　　charCharacter　　byteByte　　  shortShort
   intInteger　　    longLong　　     floatFloat　　doubleDouble
   引用类型和原始类型的行为完全不同，并且它们具有不同的语义。引用类型和原始
类型具有不同的特征和用法，它们包括：大小和速度问题，这种类型以那种类型的数据
结构存储，当引用类型和原始类型用作某个类的实例时所指定的缺省值。对象引用实例
变量的缺省值为null，而原始类型实例变量的缺省值与它们的类型有关。
   int是java的原始数据类型，Integer是java的为int提供的封装类。Java为每个
原始类型提供了封装类。　　
   int是基本数据类型Integer是int的一个包装类(wrapper)，他是类不是基本数据
类型,他的内部其实包含一个int型的数据那为什么要用Integer呢，主要是因为面向对
象的思想，因为Java语言是面向对象的，这也是它只所以流行的原因之一，对象封装有
很多好处，可以把属性也就是数据跟处理这些数据的方法结合在一起，比如Integer就
有parseInt()等方法来专门处理int型相关的数据，另一个非常重要的原因就是在Java
中绝大部分方法或类都是用来处理类类型对象的，如ArrayList集合类就只能以类作为
他的存储对象，而这时如果想把一个int型的数据存入list是不可能的，必须把它包装
成类，也就是Integer才能被List所接受。所以Integer的存在是很必要的。　　
*/

public class IntegerTC {
    public static void main(String [] args){
        // 十进制到二进制，八进制，十六进制
        // public static String toBinaryString(int i)：转换为二进制：1100100
        System.out.println(Integer.toBinaryString(100));

        // public static String toOctalString(int i)：转换为八进制：144
        System.out.println(Integer.toOctalString(100));

        // public static String toHexString(int i)：转换为十六进制:64
        System.out.println(Integer.toHexString(100));

        // public static final int MAX_VALUE：int类型的最大值
        System.out.println(Integer.MAX_VALUE);

        // public static final int MIN_VALUE：int类型的最小值
        System.out.println(Integer.MIN_VALUE);

        // 十进制到二进制，八进制，十六进制
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println("-------------------------");

        // 十进制到其他进制
        System.out.println(Integer.toString(100, 10));
        System.out.println(Integer.toString(100, 2));
        System.out.println(Integer.toString(100, 8));
        System.out.println(Integer.toString(100, 16));
        System.out.println(Integer.toString(100, 5));
        System.out.println(Integer.toString(100, 7));
        System.out.println(Integer.toString(100, 32));
        System.out.println("-------------------------");

        //其他进制到十进制
        System.out.println(Integer.parseInt("100", 10));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("100", 8));
        System.out.println(Integer.parseInt("100", 16));
        //NumberFormatException
        //System.out.println(Integer.parseInt("123", 2));

        /*
        Integer包装类的构造方法
        Integer 类在对象中包装了一个基本类型 int 的值。该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，还提供了处理 int 类型时非常有用的其他一些常量和方法。

        Integer类的构造方法中，可以把任何种类的基本数据类型转换为Integer类对象！（选择2个来说明）
       （1）public Integer(int value)
       （2）public Integer(String s)：    注意：这个字符串必须是由数字字符组成，不能包含字母字符。 
         */
        // 方式1
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("ii:" + ii);	//100：说明该类重写了toString方法。

        // 方式2
        String s = "100";
        // NumberFormatException：这个字符串必须是由数字字符组成
        // String s = "abc";
        Integer iii = new Integer(s);
        System.out.println("iii:" + iii);	//100：说明该类重写了toString方法


        /*
        int 类型 和 String 类型的相互转换（重要！）
        （1）int 类型 ——> String 类型
                        推荐方法：String.valueOf(number)    和    Integer.toString(number)

        （2）String 类型 ——> int 类型
                        推荐方法：Integer.parseInt(s)

        （3）String 类型 ——> float 类型

                        推荐方法：Float.parseFloat(s)    ：以此类推其他的基本数据类型。
         */
        // int ——> String
        int number = 100;

        // 方式1
        String s1 = "" + number;
        System.out.println("s1:" + s1);

        // 方式2
        String s2 = String.valueOf(number);
        System.out.println("s2:" + s2);

        // 方式3
        // int ——> Integer ——> String
        Integer k = new Integer(number);
        String s3 = k.toString();
        System.out.println("s3:" + s3);

        // 方式4
        // public static String toString(int k)
        String s4 = Integer.toString(number);
        System.out.println("s4:" + s4);

        System.out.println("-----------------");

        // String ——> int
        String S = "100";

        // 方式1
        // String ——> Integer ——> int
        Integer kk = new Integer(s);
        // public int intValue()
        int x = kk.intValue();
        System.out.println("x:" + x);

        //方式2
        //public static int parseInt(String S)
        int y = Integer.parseInt(S);
        System.out.println("y:"+y);

        /*
        JDK5 的新特性——自动装箱和自动拆箱（自动拆装箱）
        （1）JDK5的新特性：
                A：自动装箱：把基本类型转换为包装类类型。

                B：自动拆箱：把包装类类型转换为基本类型。

        （2）注意一个小问题：
            在使用时，Integer  x = null; 代码就会出现错误：NullPointerException。

            对于包装类类型对象的使用：建议先判断是否为null，然后再使用！
         */
        // 定义了一个int类型的包装类类型变量i
        Integer p = new Integer(100);
        Integer pp = 100;
        p += 200;
        System.out.println("pp:" + pp);	//300

        // 通过反编译后的代码（重要！！！）
        // Integer pp = Integer.valueOf(100); //自动装箱
        // pp = Integer.valueOf(pp.intValue() + 200); //自动拆箱，再自动装箱
        // System.out.println((new StringBuilder("pp:")).append(pp).toString());

        Integer ppp = null;	//Integer引用是null。
        // NullPointerException
        if (ppp != null) {
            ppp += 1000;
            System.out.println(ppp);
        }

        /*
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
               return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
        }
         */
        //分析源码我们可以知道在 i >= -128 并且 i <= 127 的时候，
        // 第一次声明会将 i 的值放入缓存中，第二次直接取缓存里面的数据，而不是重新创建一个Ingeter 对象。
        // 那么第一个打印结果因为 i = 10 在缓存表示范围内，所以为 true。

        Integer I = new Integer(100);
        Integer J = new Integer(100);
        System.out.println(I==J);            //false
        System.out.println(I.equals(J));    //true
        System.out.println("---------------");

        Integer a = 500;        //此时a进行了装箱操作
        Integer b = 500;        //此时b也进行了装箱操作，两个数值上是相等的，但是并不是同一个对象。
        System.out.println(a == b);            //false
        System.out.println(a.equals(b));    //true
        System.out.println("---------------");


        //数据在byte范围内，JVM不会重新new对象。(可以查看源码)
        Integer X = 127;
        Integer Y = 127;
        System.out.println(X == Y);            //true
        System.out.println(X.equals(Y));    //true
        System.out.println("---------------");
    }
}
