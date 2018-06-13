package cn.com.ref.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import cn.com.ref.pojo.Person;

/* 
 * 获取成员变量并调用： 
 *  
 * 1.批量的 
 *      1).Field[] getFields():获取所有的"公有字段" 
 *      2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有； 
 * 2.获取单个的： 
 *      1).public Field getField(String fieldName):获取某个"公有的"字段； 
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的) 
 *  
 *   设置字段的值： 
 *      Field --> public void set(Object obj,Object value): 
 *                  参数说明： 
 *                  1.obj:要设置的字段所在的对象； 
 *                  2.value:要为字段设置的值； 
 *  
 */
public class PersonTest {
   @SuppressWarnings({ "unused", "rawtypes", "unchecked" })
public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
	  Class clazz = Class.forName("cn.com.ref.pojo.Person");
	  //获取字段
	  System.out.println("***********获取所有公有的字段*************");
	  Field [] fields = clazz.getFields();
	  for (Field field : fields) {
		   System.out.println(field);
	   }
	  System.out.println("*************获取所有的字段(包括私有、受保护、默认的)*******************");
	  Field [] fields2 =clazz.getDeclaredFields();
	  for (Field field : fields2) {
		  System.out.println(field);
	  }
	  System.out.println("**************获取公有字段**并调用******************");
	  Field f = clazz.getField("name");
	  System.out.println(f);
	  Object object =  clazz.getConstructor().newInstance(); //Person person = new Person();
	  f.set(object, "xiaoxiao");
	  //验证
	  Person p = (Person)object;
	  System.out.println(p.getName());
	  System.out.println("*********获取私有字段****并调用************");
	  Field fds = clazz.getDeclaredField("phone");
	  System.out.println(fds);
	  fds.setAccessible(true);
	  fds.set(object, "1865661656");
	  System.out.println("号码   = " +p.getPhone());
   }
}
