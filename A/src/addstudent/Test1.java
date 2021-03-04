package addstudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


class Test1 {

	public static void main(String data[]) {
		// Student1 s = null;
		List<Student1> a = new CopyOnWriteArrayList();

		// System.out.println("Enter the id and name");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Set Update Delete Get GetAll Exit");
			String ch = scanner.nextLine();
			if (ch.equalsIgnoreCase("set")) {
				System.out.println("Enter Your Name");
				String nextLine = scanner.nextLine();
				System.out.println("Enter id");
				int id = scanner.nextInt();
				Student1 s = new Student1();
				s.setId(id);
				s.setName(nextLine);
				System.out.println(s);
				a.add(s);
				System.out.println(a.size());

			}

			else if (ch.equalsIgnoreCase("update")) {
				System.out.println("pls select id");
				Scanner scanner1 = new Scanner(System.in);
				int nextInt = scanner1.nextInt();
				for (Student1 sum : a) {
					if (sum.getId() == nextInt) {
						System.out.println("Pls update Name");
						String vari = scanner1.nextLine();
						sum.setName(vari);

					}
				}
			} else if (ch.equalsIgnoreCase("delete")) {
				System.out.println("pls select id");
				int nextInt = scanner.nextInt();
				for (Student1 sum : a) {
					if (sum.getId() == nextInt) {
						a.remove(sum);
					}
				}

			} else if (ch.equalsIgnoreCase("get")) {
				System.out.println("pls select id");
				int nextInt = scanner.nextInt();
				for (Student1 sum : a) {
					if (sum.getId() == nextInt) {
						System.out.println(sum);
					}
					
				}
				System.out.println("does not exit");
				
			}
			else if (ch.equalsIgnoreCase("getAll")) {
				System.out.println("pls select All");
				for (Student1 sum : a) {

					System.out.println(sum);

				}
			} else if (ch.equalsIgnoreCase("exit")) {
				System.exit(0);
			}

			else {
				System.out.println("Pls Enter Correct Keyword");

			}

		}
	}
} 