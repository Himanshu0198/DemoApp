package Launch;
class Test{
	private int age;
	private String name;
	private String city;
void setAge(int age) {
	this.age=age;
}
int getAge() {
	return age;
}
void setName(String name) {
	this.name=name;
}
String getName() {
	return name;
}

void setCity(String city) {
	this.city=city;
}
String getCity() {
	return city;


}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Test t1=new Test();
		t1.setAge(12);
		t1.setName("Himanshu");
		t1.setCity("Jhansi");
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		System.out.println(t1.getCity());
		
	}
}
}
