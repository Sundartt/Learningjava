package nov19;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name,String email, String phNo) {
		System.out.println(id+""+name+""+email+""+phNo);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Students stu=new Students();
       stu.getStudentInfo(89);
	}

}
