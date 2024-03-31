package com.example.LabCycle2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LabCycle2Application {

	public static void main(String[] args) {
		SpringApplication.run(LabCycle2Application.class, args);
		Scanner sc = new Scanner(System.in);
		ApplicationContext ac = new ClassPathXmlApplicationContext("college.xml");
		Department dt = (Department) ac.getBean("department");

		while (true) {
			System.out.println(
					"Menu\n 1. Insert Department Details\n 2. Display Department with College Details\n 3. Exit\n");
			System.out.println("Enter Your Choice: ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter the Department Name: ");
				dt.setName(sc.next());
				System.out.println("Enter the Department Number: ");
				dt.setId(sc.nextInt());
				System.out.println("Enter the Department Description: ");
				dt.setDescription(sc.next());
				break;

			case 2:
				System.out.println("Department Details: ");
				System.out.println("Name: " + dt.getName() + " " + "\nID: " + dt.getId() + "\nDepartment Description: "
						+ dt.getDescription());
				System.out.println("College Details: ");
				College c = dt.getCollege();
				System.out.println("College Name: " + c.getName());
				System.out.println("College Address: " + c.getAddress());
				break;

			case 3:
				System.exit(0);
			}
		}
	}

}

