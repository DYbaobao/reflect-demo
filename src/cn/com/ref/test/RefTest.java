package cn.com.ref.test;

import cn.com.ref.pojo.Student;

/** 
 * ��ȡClass��������ַ�ʽ 
 * 1 Object ����> getClass(); 
 * 2 �κ��������ͣ����������������ͣ�����һ������̬����class���� 
 * 3 ͨ��Class��ľ�̬������forName��String  className��(����) 
 * 
 */ 
public class RefTest {
   public static void main(String[] args) {
	 //��һ�ַ�ʽ��ȡClass����  
	   Student student = new Student();
	   Class stu = student.getClass();
	   System.out.println("getName()    "+stu.getName());
	   //cn.com.ref.pojo.Student
	   System.out.println("getCanonicalName()    "+stu.getCanonicalName());
	 //�ڶ��ַ�ʽ��ȡClass����  
	   Class student2 = Student.class;
	   System.out.println(student2 == stu);
	   
	 //�����ַ�ʽ��ȡClass����  
	    
	   try {
		 Class student3 = Class.forName("cn.com.ref.pojo.Student");
		 System.out.println(student3 == student2);
	   } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
   }
}
