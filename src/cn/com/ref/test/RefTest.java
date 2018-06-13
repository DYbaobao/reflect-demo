package cn.com.ref.test;

import cn.com.ref.pojo.Student;

/** 
 * 获取Class对象的三种方式 
 * 1 Object ——> getClass(); 
 * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性 
 * 3 通过Class类的静态方法：forName（String  className）(常用) 
 * 
 */ 
public class RefTest {
   public static void main(String[] args) {
	 //第一种方式获取Class对象  
	   Student student = new Student();
	   Class stu = student.getClass();
	   System.out.println("getName()    "+stu.getName());
	   //cn.com.ref.pojo.Student
	   System.out.println("getCanonicalName()    "+stu.getCanonicalName());
	 //第二种方式获取Class对象  
	   Class student2 = Student.class;
	   System.out.println(student2 == stu);
	   
	 //第三种方式获取Class对象  
	    
	   try {
		 Class student3 = Class.forName("cn.com.ref.pojo.Student");
		 System.out.println(student3 == student2);
	   } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
   }
}
