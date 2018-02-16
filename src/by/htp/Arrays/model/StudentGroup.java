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

	public int studentsYear(int year) {
		int count = 0;

		for (int i = 0; i < this.count; i++) {
			if (year == students[i].getYear()) {
				count++;
			}
		}
		return count;
	}

	public void countStudentsInYear() {
		int maxCount = 0;
		int bestYear = 0;
		for (int i = 0; i < this.count; i++) {
			if (studentsYear(students[i].getYear()) > maxCount) {
				maxCount = studentsYear(students[i].getYear());
				bestYear = students[i].getYear();
			}
		}
		System.out.println("Best year: " + bestYear + ", Count sudents " + maxCount);

	}

	public void bubleSort() {
		Student a = new Student();
		for (int i = 0; i < this.count; i++) {
			for (int j = 1; j < this.count - i; j++) {
				if (students[j - 1].getAge() > students[j].getAge()) {
					a = this.students[j - 1];
					this.students[j - 1] = this.students[j];
					this.students[j] = a;
				}
			}
		}
		System.out.println(" BubleSort :");
	}

	public void insertSort() {

		int j = 0;

		for (int i = 0; i < count - 1; i++) {
			Student a = new Student();
			if (students[i].getAge() > students[i + 1].getAge()) {
				a = students[i + 1];
				students[i + 1] = students[i];
				j = i;
				while (j > 0 && a.getAge() < this.students[j - 1].getAge()) {
					students[j] = students[j - 1];
					j--;
				}
				students[j] = a;
			}
		}
		System.out.println("InsertSort");
	}

	public void selectionSort() {
		Student a = new Student();
		for (int min = 0; min < count - 1; min++) {
			int least = min;
			for (int j = min + 1; j < count; j++) {
				if (students[j].getAge() < students[least].getAge()) {
					least = j;
				}
			}
			a = this.students[min];
			this.students[min] = this.students[least];
			this.students[least] = a;
		}
		System.out.println("selectionSort");
	}

	public void quickSort(int lo, int hi) {
		
		if (lo < hi) {
			int pivot = partition(lo, hi);
		
			quickSort(lo, pivot - 1);
			quickSort(pivot + 1, hi);
		}
	
	}

	public int partition(int lo, int hi) {
		Student a = new Student();
		int pivot = students[hi].getAge();
		int i = lo - 1;
		for (int j = lo; j < hi; j++) {
			if (students[j].getAge() <= pivot) {
				i++;
				a = this.students[i];
				this.students[i] = this.students[j];
				this.students[j] = a;

			}
		}
		a = this.students[i + 1];
		this.students[i + 1] = this.students[hi];
		this.students[hi] = a;
		return i + 1;
	}

	public int getCount() {
		return this.count;
	}
}
