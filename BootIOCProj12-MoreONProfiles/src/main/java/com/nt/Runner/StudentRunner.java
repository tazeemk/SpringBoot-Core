package com.nt.Runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.ControllerLayer.StudentController;
import com.nt.ModelLayer.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentController controller;

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter Student Name :"); String name = sc.nextLine();
//		 */
//		System.out.println("Enter Course Name that you want to join : :");
//		String sdept = sc.nextLine();
//		System.out.println("Enter Student Address :");
		
		System.out.println("Enter Studnet Mobile Number to get details :");
		int number = sc.nextInt();
		Student data = new Student();
   data.setMnum(number);
		try {

			List<Student>list = controller.output(data);
			list.forEach(value->System.out.println(value) );
    System.out.println("Current Time :"+new Date());
    System.out.println("Values In Runner that Pass"+Arrays.toString(args));
		} catch (Exception e) {
			System.out.println("Devang Johnny sins");
			e.printStackTrace();

		}

	}
}