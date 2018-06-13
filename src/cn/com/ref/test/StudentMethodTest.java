package cn.com.ref.test;

import java.lang.reflect.Method;

public class StudentMethodTest {
   @SuppressWarnings("unchecked")
public static void main(String[] args) throws Exception {
	 Class clazz = Class.forName("cn.com.ref.pojo.StudentMethod");
	 //2.获取所有公有方法  
     System.out.println("***************获取所有的”公有“方法*******************"); 
	 Method [] methods = clazz.getMethods();
	 for (Method method : methods) {
		System.out.println(method);
	  }
	 System.out.println("***************获取所有的方法，包括私有的*******************");
	 methods = clazz.getDeclaredMethods();
	 for (Method method : methods) {
		 System.out.println(method);
	 }
	 System.out.println("***************获取公有的show1()方法*******************");
	 Method m = clazz.getMethod("show1", String.class);
	 System.out.println(m);
	 Object object = clazz.getConstructor().newInstance();
	 m.invoke(object, "huihiuhiuhi");
	 System.out.println("***************获取私有的show4()方法******************");  
	 m = clazz.getDeclaredMethod("show4", int.class);
	 System.out.println(m);
	 m.setAccessible(true);
	 Object re = m.invoke(object, 12);
	 System.out.println("返回值   " +re);
   }
}
