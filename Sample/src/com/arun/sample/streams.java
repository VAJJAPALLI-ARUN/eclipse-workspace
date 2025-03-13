package com.arun.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class streams {

	public static void main(String[] args) {
		List<String> emp=new ArrayList<>();
		emp.add("aru");
		emp.add("rajuuuu");
		emp.add("sairam");
		emp.stream().forEach(empp->System.out.println(empp.length()));
		List<String> ram=emp.stream().filter(em->em.length()>=4).collect(Collectors.toList());
		ram.forEach(streams::printlen);
		}
	
	public static String  printlen(name) {
		return name.length();
	}

	}
