package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	private ArrayList<TodoController> todo = new ArrayList<>();

	public void TodoController() {
		todo.add(new TodoController("nameA",1));
		todo.add(new TodoController("nameB",2));
		todo.add(new TodoController("nameC",3));
	}
	@GetMapping("/Call")
	public List<TodoController> Call(@RequestParam(value = "name", defaultValue = "World") String name) {
		TodoController();
		return todo;
	}

	@GetMapping("/Call/id")
	public Object Call2(@RequestParam(value = "name", defaultValue = "World") String name) {
        if (name=="") {
            return new TodoController("nameA",2);
        }


        return todo.stream().filter(item -> item.getId() ==  1);
	}
}
