package assignment.basicInheritance;

public class ClassSecond {

public static void main(String[] args) {
	
	InheritanceBasic studentOneInfo = new InheritanceBasic("jaiHind", 100, 122);
	InheritanceBasic studentTwoInfo = new InheritanceBasic("kamlabai", 101, 123);
	InheritanceBasic studentThreeInfo = new InheritanceBasic("kanyaSchool", 102, 124);
	
	studentOneInfo.toString();
	System.out.println(studentOneInfo.toString());
	System.out.println(studentTwoInfo.toString());
	System.out.println(studentTwoInfo.studentId);
	
}
}
