package cn.com.ref.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* 
 * ͨ��Class������Ի�ȡĳ�����еģ����췽������Ա��������Ա�����������ʳ�Ա�� 
 *  
 * 1.��ȡ���췽���� 
 *      1).�����ķ����� 
 *          public Constructor[] getConstructors()������"���е�"���췽�� 
            public Constructor[] getDeclaredConstructors()����ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����) 
      
 *      2).��ȡ�����ķ����������ã� 
 *          public Constructor getConstructor(Class... parameterTypes):��ȡ������"���е�"���췽���� 
 *          public Constructor getDeclaredConstructor(Class... parameterTypes):��ȡ"ĳ�����췽��"������˽�еģ����ܱ�����Ĭ�ϡ����У� 
 *       
 *          ���ù��췽���� 
 *          Constructor-->newInstance(Object... initargs) 
 */  
public class RefTest01 {
     @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			//1.����class����
			Class clazz = Class.forName("cn.com.ref.pojo.Student");
			//2..��ȡ���й��й��췽�� 
			System.out.println("**************���й��й��췽��**********************");
			Constructor [] conArry = clazz.getConstructors();
			for (Constructor constructor : conArry) {
				System.out.println(constructor);
			}
			/***
			 * public cn.com.ref.pojo.Student(char)
             * public cn.com.ref.pojo.Student(java.lang.String)
             * public cn.com.ref.pojo.Student(java.lang.String,int)
             * public cn.com.ref.pojo.Student()
			 */
			System.out.println("**************���еĹ��췽��(������˽�С��ܱ�����Ĭ�ϡ�����)*************************");
			conArry = clazz.getDeclaredConstructors();
			for (Constructor constructor : conArry) {
				System.out.println(constructor);
			}
			/***
			 *    public cn.com.ref.pojo.Student(char)
                  protected cn.com.ref.pojo.Student(boolean)
                  public cn.com.ref.pojo.Student(java.lang.String)
                  public cn.com.ref.pojo.Student(java.lang.String,int)
                  public cn.com.ref.pojo.Student()
                  private cn.com.ref.pojo.Student(int)
			 */
			System.out.println("**********��ȡ���С��޲εĹ��췽��****************");
		    
		
					Constructor con = clazz.getConstructor(null);
					//1>����Ϊ���޲εĹ��췽������������һ��null,��дҲ���ԣ�������Ҫ����һ�����������ͣ��м�������  
			        //2>�����ص�����������޲ι��캯���������
					Object obj = con.newInstance();
			       System.out.println("obj  = "+obj);
			/***
			 * �������޲ε��޲εĹ��췽��,��ִ����
               obj  = Student [name=null, password=null, age=0]
			 */
			 System.out.println("******************��ȡ˽�й��췽����������*******************************");  
		     con = clazz.getDeclaredConstructor(int.class); 
		     System.out.println(con);
		     con.setAccessible(true);
		     obj = con.newInstance(12);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	 }
}
