package org.example.lessongithub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class LessonGitHubApplication {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите перове число");
            int num1 = scanner.nextInt();
            System.out.println("введите второе число");
            int num2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("выберите действие которое вам подходит \n+ сложение \n- вычетание  \n* умниожение \n/ деление");
            String command = scanner.nextLine();

            switch (command) {
                case "+" -> System.out.println(num1+num2);
                case "-"-> System.out.println(num1-num2);
                case "*"-> System.out.println(num1*num2);
                case "/"->{
                    if (num2==0){
                        System.out.println("на ноль делить нельзя");
                    }else {
                        System.out.println((double)num1/num2);
                    }

                }
            }
        }catch (InputMismatchException e){
            System.out.println("ошибка");
        }
    }
}
