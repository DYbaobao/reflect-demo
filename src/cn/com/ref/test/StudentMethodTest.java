package cn.com.ref.test;

import java.lang.reflect.Method;

public class StudentMethodTest {
   @SuppressWarnings("unchecked")
public static void main(String[] args) throws Exception {
	 Class clazz = Class.forName("cn.com.ref.pojo.StudentMethod");
	 //2.��ȡ���й��з���  
     System.out.println("***************��ȡ���еġ����С�����*******************"); 
	 Method [] methods = clazz.getMethods();
	 for (Method method : methods) {
		System.out.println(method);
	  }
	 System.out.println("***************��ȡ���еķ���������˽�е�*******************");
	 methods = clazz.getDeclaredMethods();
	 for (Method method : methods) {
		 System.out.println(method);
	 }
	 System.out.println("***************��ȡ���е�show1()����*******************");
	 Method m = clazz.getMethod("show1", String.class);
	 System.out.println(m);
	 Object object = clazz.getConstructor().newInstance();
	 m.invoke(object, "huihiuhiuhi");
	 System.out.println("***************��ȡ˽�е�show4()����******************");  
	 m = clazz.getDeclaredMethod("show4", int.class);
	 System.out.println(m);
	 m.setAccessible(true);
	 Object re = m.invoke(object, 12);
	 System.out.println("����ֵ   " +re);
   }
}
