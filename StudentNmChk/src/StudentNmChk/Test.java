package StudentNmChk;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		studentInput(students);
		System.out.println("Students Array "+students.toString());
		
//      searching my name exsit or not in the ArrayList
		Scanner sc = new Scanner(System.in);
		System.out.print("Find Your Name : ");
		String findName= sc.nextLine();
		boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (findName.equals(students.get(i).getName())) {
            	found=true;
            	if(found) {
            		System.out.println(findName+" Name Found");
            	}else {
            		System.out.println(findName+" Not Found");
            	}
                break;
            }
        }
	}
	
	public static void studentInput(ArrayList<Student> students) {
		for(int i=0;i<2;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Name : ");
			String name = sc.nextLine();
			students.add(new Student(name));
		}
	}
}
