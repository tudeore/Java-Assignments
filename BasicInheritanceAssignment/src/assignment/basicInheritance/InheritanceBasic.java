/*	Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. 
Nefine a class “Two” in which define main function . In main function create various instances of First and Second  and 
call their individual member functions.ow define a class “Two” in which define main function . In main function create
various instances of First and Second  and call their individual member functions.
package assignment.basicInheritance;*/

//---------------------------------------------------------------------------------------------------------------------------
package assignment.basicInheritance;

public class InheritanceBasic {
String collegeName;
int studentId;
int standard;

	public InheritanceBasic(String collegeName,int studentId,int standard)
	{
		this.collegeName = collegeName;
		this.studentId = studentId;
		this.standard = standard;
	}
	

	@Override
	public String toString() {
		return "InheritanceBasic [collegeName=" + collegeName + ", studentId="
				+ studentId + ", standard=" + standard + "]";
	}
}
