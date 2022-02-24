package com.phoenix;

import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        try {
                        //НАЧАЛО
            Phone [] phones = {
                new Phone("+380112223344", 190f, "Samsung Galaxy S8"),
                new Phone("+380556667788", 220f, "Huawai model A2"),
                new Phone("+380229998877", 170f, "iPhone 11")
            };

            for(Phone p : phones)
                System.out.printf("Номер тел %s, модель \"%s\" весом %.0fгр\n", p.getNumber(), p.getModel(), p.getWeight());

            System.out.println("\t\t\t---");

            for(Phone p : phones) {
                System.out.printf("На номер %s ", p.getNumber());
                p.receiveCall("\'ШАГ учебка\'");
            }

            System.out.println("\t\t\t---");

            for(Phone p : phones)
                p.receiveCall("Учебная часть", "+380123456789");

            System.out.println("\t\t\t---");

            phones[0].sendMessage("+380994732717", "+720221678342", "+103823673367");

            System.out.println("\t\t\t---");

            Person first = new Person();
            System.out.println("Создан Person по умолчанию: " + first.getFullName());
            Person second = new Person("Алиса Мудрая Вольфовна", 18);
            System.out.println("Person(name, age) : " + second.getFullName()
            + " " + second.getAge() + " лет");

            System.out.println("\t\t\t---");

            Reader [] rd = {
                    new Reader("Вячеслав И.И", 243762, "КИТ", 80278342934L),
                    new Reader("Степанов А.Ф", 243627, "МЭ", 809532156789L)
            };
            System.out.println("--");

            Date date = new Date();
            Random rand = new Random(date.getTime());
            for(Reader stud : rd){
                stud.takeBook(rand.nextInt(4) + 1);
            }
            System.out.println("--");
            for(Reader stud : rd){
                stud.takeBook("Библия Новый Завет", "Коран");
            }
            System.out.println("--");
            for(Reader stud : rd){
                stud.takeBook(new Book("Джуан Роулинг", "Гарри Поттер 1"),
                        new Book("Джуан Роулинг", "Гарри Поттер 2"),
                        new Book("Джуан Роулинг", "Гарри Поттер 3"));
            }
            System.out.println("----");

            for(Reader stud : rd){
                stud.returnBook(rand.nextInt(4) + 1);
            }
            System.out.println("--");
            for(Reader stud : rd){
                stud.returnBook("Библия: Новый Завет", "Коран");
            }
            System.out.println("--");
            for(Reader stud : rd){
                stud.returnBook(new Book("Джуан Роулинг", "Гарри Поттер 1"),
                        new Book("Джуан Роулинг", "Гарри Поттер 2"),
                        new Book("Джуан Роулинг", "Гарри Поттер 3"));
            }

            System.out.println("\t\t\t---");

            Recursion rec = new Recursion(1, 10);
            rec.start();
            rec = new Recursion(8, 2);
            rec.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
