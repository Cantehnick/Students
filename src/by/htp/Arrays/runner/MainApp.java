package by.htp.Arrays.runner;

import by.htp.Arrays.model.Student;
import by.htp.Arrays.model.StudentGroup;

public class MainApp {

	public static void main(String[] args) {

		Student st1 = new Student("Name1", 19, 2018);
		Student st2 = new Student("Name2", 18, 2015);
		Student st3 = new Student("Name3", 24, 2018);
		Student st4 = new Student("Name4", 35, 2015);
		Student st5 = new Student("Name5", 21, 2018);

		StudentGroup sg = new StudentGroup();

		sg.addStudent(st1);
		sg.addStudent(st2);
		sg.addStudent(st3);
		sg.addStudent(st4);
		sg.addStudent(st5);
		sg.infStudent();
		System.out.println("Average age students :" + sg.averageAge());
		System.out.println("Count students in 2015 : " + sg.studentsYear(2015));
		sg.countStudentsInYear();
		sg.bubleSort();
		sg.infStudent();
		sg.insertSort();
		sg.infStudent();
		sg.selectionSort();
		sg.infStudent();
		System.out.println("QuickSort");
		sg.quickSort(0, sg.getCount() - 1);
		sg.infStudent();

	}

}
