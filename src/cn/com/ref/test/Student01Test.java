package cn.com.ref.test;

import java.lang.reflect.Method;

/** 
 * 获取Student类的main方法、不要与当前的main方法搞混了 
 */ 
public class Student01Test {
   @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public static void main(String[] args) throws Exception {
	   Class clazz = Class.forName("cn.com.ref.pojo.Student01");
	   Method method = clazz.getMethod("main", String [].class);
	   //3、调用main方法  
       // methodMain.invoke(null, new String[]{"a","b","c"});  
        //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数  
        //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。。。所以需要将它强转。  
        method.invoke(null, (Object)new String[]{"a","b","c"});//方式一  
       // methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//方式二  
   }
}
