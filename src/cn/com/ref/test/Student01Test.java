package cn.com.ref.test;

import java.lang.reflect.Method;

/** 
 * ��ȡStudent���main��������Ҫ�뵱ǰ��main��������� 
 */ 
public class Student01Test {
   @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public static void main(String[] args) throws Exception {
	   Class clazz = Class.forName("cn.com.ref.pojo.Student01");
	   Method method = clazz.getMethod("main", String [].class);
	   //3������main����  
       // methodMain.invoke(null, new String[]{"a","b","c"});  
        //��һ���������������ͣ���Ϊ������static��̬�ģ�����Ϊnull���ԣ��ڶ���������String���飬����Ҫע����jdk1.4ʱ�����飬jdk1.5֮���ǿɱ����  
        //������ʱ��  new String[]{"a","b","c"} ���3�����󡣡���������Ҫ����ǿת��  
        method.invoke(null, (Object)new String[]{"a","b","c"});//��ʽһ  
       // methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//��ʽ��  
   }
}
