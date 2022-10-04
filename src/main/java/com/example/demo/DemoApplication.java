package com.example.demo;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*
		TaskList propositos=new TaskList("Propósitos para listar :)");

		propositos.addTask(tarea1);

		System.out.println(propositos.getTaskLists().size());

		Task tarea2= new Task("Aprender Java", false, LocalDate.of(2022,9,30));
        propositos.addTask(tarea2);
		System.out.println(propositos.getTaskLists().size();
		*/
	}

}
