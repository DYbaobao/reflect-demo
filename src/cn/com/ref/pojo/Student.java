package cn.com.ref.pojo;

public class Student {
    private String name;
    private String password;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(char str) {
	   System.out.println("(Ĭ�ϵĹ��췽�� )" + str);
	}
	//Ĭ�ϵĹ���
	public Student(){
		System.out.println("�������޲ε��޲εĹ��췽��,��ִ����");
	}
	//һ��������
	public Student(String name){
		System.out.println("���� ��" + name);
	}
	//���������
	public Student (String name,int age){
		System.out.println("���� �� "+ name + "  ���� "+age);
	}
	//�ܱ�����
	protected Student (boolean n){
		System.out.println("�ܱ����Ĺ��췽�� n = "+n);
	}
	//˽�е�
	@SuppressWarnings("unused")
	private Student (int age) {
		System.out.println("˽�е� age = "+age);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", age="
				+ age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
    
}
