package com.epam.task3.package01;

public class Main {
    // TODO: DK: Это как раз тот случай когда классов стало достаточно много для того чтобы разделить их на несколько пакетов. Как минимум напрашивается отделить девайсы от эксепшенов.
    public static void main (String[] args) {

        Watch watch1 = new Watch();
        watch1.displayTime();

        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,4));
        System.out.println(calc.subtract(6,2));

        WatchWithCalc wc = new WatchWithCalc();
        wc.getWatch().displayTime();
        wc.getCalc().sum(3,5);

        Phone phone = new Phone();
        phone.callByNumber("+375447124368");

        Phonebook phonebook = new Phonebook();
        // TODO: Всё-таки с точки зрения логики правильнее вызывать это через метод addСontact. Он проверяет на лубликат имени. По-моему при таком вызове старое имя перепишется новым номером.
        phonebook.getPhonesList().put("Peter", "+375441234567");
        phonebook.getPhoneNumber("Peter");
        phonebook.addContact("Alex", "+375447214368");

        Smartphone smart = new Smartphone();
        smart.setPhonebook(phonebook);
        smart.callByName("Alex");

    }
}
