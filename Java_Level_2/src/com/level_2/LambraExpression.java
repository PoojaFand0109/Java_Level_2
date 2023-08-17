package com.level_2;

import java.util.ArrayList;
import java.util.List;

public class LambraExpression {

	 public static void main(String[] args) {
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Grapes");

	        System.out.println("Using forEach loop with lambda expression:");
	        fruits.forEach(fruit -> System.out.println(fruit));
	        
	        
	    }
}
