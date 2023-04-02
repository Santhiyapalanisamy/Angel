package overloding;

public class fall {
	public void studentId(int id) {
		System.out.println("student Id-"+id);
	}
	public void studentId(String name) {
		System.out.println("student name-"+name);
	}
	public void studentId(long id) {
		System.out.println(id);
	}
	public void studentId(String name,int id) {
		System.out.println("student name-"+name+" "+"student id-"+id);
	}
	public void studentId(int id,String name) {
		System.out.println(id+name);
	}
	
	public static void main(String[] args) {
		fall h =new fall();
		h.studentId(123);
		h.studentId("hello");
		h.studentId("6380917159");
		h.studentId("suji", 72);
		h.studentId(345,"niffy");
	}

}
