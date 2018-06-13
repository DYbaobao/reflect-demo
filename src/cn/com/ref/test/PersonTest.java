package cn.com.ref.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import cn.com.ref.pojo.Person;

/* 
 * ��ȡ��Ա���������ã� 
 *  
 * 1.������ 
 *      1).Field[] getFields():��ȡ���е�"�����ֶ�" 
 *      2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У� 
 * 2.��ȡ�����ģ� 
 *      1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ� 
 *      2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�) 
 *  
 *   �����ֶε�ֵ�� 
 *      Field --> public void set(Object obj,Object value): 
 *                  ����˵���� 
 *                  1.obj:Ҫ���õ��ֶ����ڵĶ��� 
 *                  2.value:ҪΪ�ֶ����õ�ֵ�� 
 *  
 */
public class PersonTest {
   @SuppressWarnings({ "unused", "rawtypes", "unchecked" })
public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
	  Class clazz = Class.forName("cn.com.ref.pojo.Person");
	  //��ȡ�ֶ�
	  System.out.println("***********��ȡ���й��е��ֶ�*************");
	  Field [] fields = clazz.getFields();
	  for (Field field : fields) {
		   System.out.println(field);
	   }
	  System.out.println("*************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)*******************");
	  Field [] fields2 =clazz.getDeclaredFields();
	  for (Field field : fields2) {
		  System.out.println(field);
	  }
	  System.out.println("**************��ȡ�����ֶ�**������******************");
	  Field f = clazz.getField("name");
	  System.out.println(f);
	  Object object =  clazz.getConstructor().newInstance(); //Person person = new Person();
	  f.set(object, "xiaoxiao");
	  //��֤
	  Person p = (Person)object;
	  System.out.println(p.getName());
	  System.out.println("*********��ȡ˽���ֶ�****������************");
	  Field fds = clazz.getDeclaredField("phone");
	  System.out.println(fds);
	  fds.setAccessible(true);
	  fds.set(object, "1865661656");
	  System.out.println("����   = " +p.getPhone());
   }
}
