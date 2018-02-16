package by.htp.Arrays.model;

public class StudentGroup {

	private Student[] students;
	private int count;

	public void infStudent() {
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].getName() + "  " + students[i].getAge() + "   " + students[i].getYear());
		}
	}

	public void addStudent(Student st) {
		if (this.count == 0) {
			this.students = new Student[15];
			this.students[0] = st;
			this.count++;
		} else {
			if (this.count < 15) {
				students[count] = st;
				this.count++;
			} else {
				System.out.println("Students grup is full");
			}
		}
	}

	public int averageAge() {
		int averageAge = 0;
		for (int i = 0; i < this.count; i++) {
			averageAge = students[i].getAge() + averageAge;
		}
		averageAge = (int) averageAge / this.count;

		return averageAge;
	}

	public int studentsYear (int year) {
		int count=0;
		
		for (int i=0;i<this.count; i++) {
			if (year==students[i].getYear()) {
				count++;
			}
		}
		return count;
	}
	
	public void countStudentsInYear() {
		int maxCount=0;
		int bestYear=0;
		for (int i=0; i<this.count; i++) {
			if(studentsYear(students[i].getYear())>maxCount) {
				maxCount=studentsYear(students[i].getYear());
				bestYear=students[i].getYear();
			}
		}
		System.out.println("Best year: "+bestYear+", Count sudents "+maxCount);

	}
	
	public void bableSort () {
		Student a=new Student();
	for (int i=0; i<this.count; i++) {
		for (int j=1; j<this.count-i; j++) {
			if (students[j-1].getAge()>students[j].getAge()) {
				a=this.students[j-1];
				this.students[j-1]=this.students[j];
				this.students[j]=a;
			}
		}
	}
System.out.println(" BableSort :");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}