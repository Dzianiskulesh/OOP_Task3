package com.epam.task3.package01;

public class Phone extends Device {

    private int batteryLevel;

    public Phone() {
        batteryLevel = 100;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean callByNumber(String str) {
        boolean isValidNumber;

        //Validate against Belarus number
        // TODO: DK: С регулярными выражениями всё хорошо. Правильно использовал и правильно написал.
        // Единственное пару вещей для импрувмента:
        // Квадратные скобки значат range или or [rt] - r или t, [a-d] - символ между a и d. Если у тебя единстенный символ, скобки можно не ставить. Т.е. "+375[0-9]{9}" тоже будет работать.
        // Для некоторых последовательностей есть отдельное обозначение. Например \d - цифра от [0-9]. Т.е. твоё выражение можно написать как "[+]375\\d{9}". Два слеша потому что в JAVA это спец символ и его нужно экранировать. А плюс в скобкам потому что мета символ. Можно тоже экранировать.
        // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        isValidNumber = str.matches("[+][3][7][5][0-9]{9}");

        //Validate against letters



//  TODO: DK: форматирование очень важно. Сравни код ниже с тем который у тебя. Какой вариант визуально лучше воспринимается? В IDEA можно выделить всё (Ctrl+a) , а потом назать (Ctrl+Alt+L)
//        try {
//            if (str.matches(".*[A-Za-zА-Яа-я].*")) {
//                throw new WrongPhoneNumberException();
//            }
//        } catch (WrongPhoneNumberException ex) {
//            System.out.println("Incorrect phone number format! Only digits are allowed!");
//        }

        try
        {
            if(str.matches(".*[A-Za-zА-Яа-я].*"))
            {
                throw new WrongPhoneNumberException();
            }
        }
        // TODO: Нет особого смысла, чтобы выбрасывать эксепшн, а потом его сразу же ловить. Если ты сам ловишь свой эксепшн , а потом на основании этого что-то делаешь (в твоём случае пишешь лог в консоль),
        // то логичнее было бы сразу писать лог в консоль на том месте где ты выбрасываешь эксепшн. Идея была в том чтобы этот эксепшн дошёл до клиента. Возможно два варинта: добавить в метод throws декларацию.
        // или сделать эксепшн непроверяемым (Заэкстендить от RuntimeException например). Напомни, разберём это на митинге. Можно ещё раз прочитать про эксепшны или посмотреть видео.
        catch(WrongPhoneNumberException ex)
        {
            System.out.println("Incorrect phone number format! Only digits are allowed!");
        }

        //Print success message
        if(isValidNumber) {
            System.out.println("You are calling to " + str + "..");
        } else {
            System.out.println("Please check the number you are trying to callByNumber!");
        }

        return isValidNumber;
    }
}
