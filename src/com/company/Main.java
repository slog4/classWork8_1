package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	DocumentWorcer documentWorcer = null;
	Scanner scanner = new Scanner(System.in);
		System.out.println(" Введите ключь \'pro\' , \'exp\' или \'0\'");
	String key = scanner.nextLine();
		System.out.println(key);
		if( key.equals("pro")){
			documentWorcer = new ProDocumentWorcer();
		}else if(key.equals("exp")){
			documentWorcer = new ExpertDocumentWorcer();
		}else {
			documentWorcer = new DocumentWorcer();
		}
	documentWorcer.openDocument();
	documentWorcer.editDocument();
	documentWorcer.saveDocument();
    }
}
