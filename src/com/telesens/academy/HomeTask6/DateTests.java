//5)*
//		-* реализовать статический метод checkData(int day, int month, int year), который проверяет существование введенной даты
//		-* использовать проверку checkData, при попытке изменить поле метод set, в случае ошибки не проводить изменение,
//			а вывести сообщение об ошибке на консоль
//		-** реализовать метод differenceIdDays(int day, int month, int year), который принимает другую дату и вычисляет разницу в
//			днях между датами
//		- протестировать работу методов
package com.telesens.academy.HomeTask6;

import java.util.Scanner;

public class DateTests {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Date someDay = new Date(29,10,2018);
        Date myBirthday = new Date(25,05,1988);
        Date animeClubFoundation = new Date(19,05,2007);
        myBirthday.printDate();
        animeClubFoundation.printDate();
        someDay.printDate();
        someDay.differenceIdDays(myBirthday);
    }

}

