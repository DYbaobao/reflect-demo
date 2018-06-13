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
	   System.out.println("(默认的构造方法 )" + str);
	}
	//默认的构造
	public Student(){
		System.out.println("调用了无参的无参的构造方法,并执行了");
	}
	//一个参数的
	public Student(String name){
		System.out.println("姓名 ：" + name);
	}
	//多个参数的
	public Student (String name,int age){
		System.out.println("姓名 ： "+ name + "  年龄 "+age);
	}
	//受保护的
	protected Student (boolean n){
		System.out.println("受保护的构造方法 n = "+n);
	}
	//私有的
	@SuppressWarnings("unused")
	private Student (int age) {
		System.out.println("私有的 age = "+age);
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
