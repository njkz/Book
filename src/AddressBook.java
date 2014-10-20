/**
 * Created by Admin on 14.10.14.
 */

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Deys book = new Deys();
        Scanner in = new Scanner(System.in);
        out:
        while (true) {
            System.out.println("1: Добавление адресса");
            System.out.println("2: Поиск записи по имени человека");
            System.out.println("3: Поиск записи по индексу");
            System.out.println("4: Удаление записи из книги по индексу");
            System.out.println("5: Получение количества записей в книге");
            System.out.println("6: Вывод всей книги");
            System.out.println("7: Изменение записи по её индексу");
            System.out.println("8: Выход");
            System.out.print("Введите номер необходимого действия: ");
            int k = in.nextInt();

            switch (k) {
                case 1:
                    System.out.println("Введите имя");
                    String n = in.next();
                    System.out.println("Введите телефон");
                    String p = in.next();
                    System.out.println("Введите email");
                    String e = in.next();
                    Address a = new Address(n, p, e);
                    book.Add(a);

                    continue;
                case 2:
                    System.out.println("Введите имя для поиска");
                    String q = in.next();
                    int[] dex = book.find(q);
                    continue;
                case 3:
                    System.out.println("Введите индекс записи для поиска");
                    int r = in.nextInt();
                    if (r < book.list.length) {
                        Address s = book.get(r);
                        System.out.println(s.name + " " + s.phone + " " + s.email);
                    } else System.out.println("Элемента с таким индексом нет");
                    continue;
                case 4:
                    System.out.println("Введите индекс записи для удаления");
                    int y = in.nextInt();
                    book.delete(y);
                    continue;
                case 5:
                    if (book.gecCount() == 1) System.out.println("В адресной книге " + book.gecCount() + " запись");
                    else if (book.gecCount() == 2 || book.gecCount() == 3 || book.gecCount() == 4)
                        System.out.println("В адресной книге " + book.gecCount() + " записи");
                    else System.out.println("В адресной книге " + book.gecCount() + " записей");
                    continue;
                case 6:
                    book.ollpr();
                    continue;
                case 7:
                    book.izm();
                    continue;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Введено не возможное действие! Повторите попытку");
                    continue out;
            }
            break;
        }
    }
}
