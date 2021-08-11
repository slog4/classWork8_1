import java.util.Scanner;

import classWork8Task4.User;
import com.company.*;

public class Main {

    public static void main(String[] args) {
//		task3();
		task4();
	}

	private static void task4() {
		User user1 = new User("Иван1","asdfdsa@ gfg.com","321421","192.164.1.1","ivan","ivan","admin");
		User user2 = new User("Иван2", "asdas33@dfsdf.com", "232123223", "192.164.1.2", "ivan2", "ivan2", "user");
		User user3 = new User("Иван3","asdfd@sam.com","324351","192.164.1.3","ivan3","ivan3","user");
		User [] arrUser = new User[3];
		arrUser[0]=user1;
		arrUser[1]=user2;
		arrUser[2]=user3;
		System.out.println("Контактная информация о пользователях: ");
		for (int i = 0; i < arrUser.length; i++) {
			arrUser[i].contactDetails();
			System.out.println("-----------------------------");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Контактная информация о доступе и правах: ");
		for (int i = 0; i < arrUser.length; i++) {
			arrUser[i].authenticationParameters();
			System.out.println("-----------------------------");
		}
	}

	private static void task3() {
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
