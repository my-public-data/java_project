package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static int identificator;

    public static void main(String[] args) {

        auth();

    }

     public static void auth() {

        Scanner Input = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        int n = 0;

//While_________________________________________________________________________________________________
        System.out.println("Введите любое число, отличное от 0");
        while (true) {

            System.out.println("Введите:\n1 - для регистрации;\n2 - для авторизации;\n0 - для выхода");
            String inputMenu = Input.nextLine();

//switch input menu _____________________________________________________________________________________
            switch (inputMenu) {
                case "1": // регистрация

                    System.out.println("Регистрация");
                    String a1;
                    String a2;

                    User user = new User();

                    do {
                        do {

                            System.out.println("Введите фамилию.  Формат - первая буква - заглавная."); // Формат  первая буква - заглавная
                            Scanner Input2 = new Scanner(System.in);
                            while (user.setSername(Input2.nextLine()) != true)
                                ;     //  более раскрытое условие  != true - если данные о пользователе соответствуют шаблону
                            System.out.println("Вы ввели фамилию: " + user.getSername());
                            System.out.println("Если фамилия введена неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input2.nextLine();
                        }
                        while (a1.equals("0"));
                        System.out.println("Фамилия зафиксирована");
                        System.out.println("Зафиксированная фамилия - " + user.getSername());
                        System.out.println("_______________________________________________________________________________");

                        do {

                            System.out.println("Введите имя.  Формат - первая буква - заглавная.");
                            Scanner Input3 = new Scanner(System.in);
                            while (!user.setName(Input3.nextLine())) ;
                            System.out.println("Вы ввели имя: " + user.getName());
                            System.out.println("Если имя введено неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input3.nextLine();
                        }
                        while (a1.equals("0"));
                        System.out.println("Имя зафиксировано");

                        System.out.println("Зафиксированное имя - " + user.getName());
                        System.out.println("_______________________________________________________________________________");


                        do {
                            System.out.println("Введите отчество.  Формат - первая буква - заглавная.");
                            Scanner Input4 = new Scanner(System.in);
                            while (!user.setPatronymic(Input4.nextLine())) ;
                            System.out.println("Вы ввели отчество: " + user.getPatronymic());
                            System.out.println("Если отчество введено неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input4.nextLine();
                        }
                        while (a1.equals("0"));
                        System.out.println("Отчество зафиксировано");
                        System.out.println("Зафиксированное отчество - " + user.getPatronymic());
                        System.out.println("_______________________________________________________________________________");


                        boolean nonunictelephone_number;

                        do {


                            do {
                                nonunictelephone_number = false;
                                System.out.println("Введите номер телефона в формате 8-ХХХ-ХХХ-ХХ-ХХ или +7-ХХХ-ХХХ-ХХ-ХХ");
                                //   Scanner Ввод100 = new Scanner(System.in);
                                while (!user.setTelephone_number(Input.nextLine())) ;
                                for (User us : users) {
                                    if (us.getTelephone_number().equals(user.getTelephone_number())) {
                                        nonunictelephone_number = true;
                                        System.out.println("Пользатетель с таким номером телефона уже добавлен. Укажите другой номер телефона.");
                                    }
                                }
                            }
                            while (nonunictelephone_number);

                            System.out.println("Вы ввели номер телефона: +7-" + user.getTelephone_number() + " (если номер телефона был введен в формате 8-ХХХ-ХХХ-ХХ-ХХ, то он преобран в формат +7-ХХХ-ХХХ-ХХ-ХХ для универсальности)");


                            System.out.println("Если номер телефона введен неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input.nextLine();

                        }
                        while (a1.equals("0"));
                        System.out.println("Номер телефона зафиксирован");
                        System.out.println("Зафиксированный номер телефона - +7-" + user.getTelephone_number());
                        System.out.println("_______________________________________________________________________________");


                        boolean nonunicemail;
                        do {


                            do {
                                nonunicemail = false;
                                System.out.println("Введите адрес электронной почты");
                                //   Scanner Ввод100 = new Scanner(System.in);
                                while (!user.setEmail(Input.nextLine())) ;
                                for (User us : users) {
                                    if (us.getEmail().equals(user.getEmail())) {
                                        nonunicemail = true;
                                        System.out.println("Пользатетель с таким email уже добавлен. Укажите другой email.");
                                    }
                                }
                            }
                            while (nonunicemail);
                            System.out.println("Вы ввели адрес электронной почты: " + user.getEmail());
                            System.out.println("Если адрес электронной почты введен неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input.nextLine();

                        }
                        while (a1.equals("0"));
                        System.out.println("Адрес электронной почты зафиксирован");
                        System.out.println("Зафиксированный адрес электронной почты - " + user.getEmail());
                        System.out.println("_______________________________________________________________________________");
//____________________________________________________________________________________________________________________________________________________________________________________
                        boolean nonuniclogin;
                        do {


                            do {
                                nonuniclogin = false;
                                System.out.println("Введите login");

                                while (!user.setLogin(Input.nextLine())) ;
                                for (User us : users) {
                                    if (us.getLogin().equals(user.getLogin())) {
                                        nonuniclogin = true;
                                        System.out.println("Пользователь с таким логином уже добавлен. Укажите другой login.");
                                    }
                                }
                            }

                            while (nonuniclogin);
                            System.out.println("Вы ввели login: " + user.getLogin());
                            System.out.println("Если login введен неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Input.nextLine();
                        }
                        while (a1.equals("0"));
                        System.out.println("Логин зафиксирован");
                        System.out.println("Зафиксированный login - " + user.getLogin());
                        System.out.println("_______________________________________________________________________________");

                        do {

                            System.out.println("Введите пароль");
                            Scanner Ввод100 = new Scanner(System.in);
                            while (!user.setPassword(Input.nextLine())) ;
                            System.out.println("Вы ввели пароль: " + user.getPassword());
                            System.out.println("Если пароль введен неправильно - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                            System.out.println("_______________________________________________________________________________");
                            a1 = Ввод100.nextLine();
                        }
                        while (a1.equals("0"));
                        System.out.println("Пароль зафиксирован");
                        System.out.println("Зафиксированный пароль - " + user.getPassword());

                        System.out.println("_________________________________________________________________________________________________");
                        System.out.println("Итоговая проверка введенных данных регистрации");
                        System.out.println("Вы ввели фамилию: " + user.getSername());
                        System.out.println("Вы ввели имя: " + user.getName());
                        System.out.println("Вы ввели отчество: " + user.getPatronymic());
                        System.out.println("Вы ввели номер телефона: +7-" + user.getTelephone_number());
                        System.out.println("Вы ввели адрес электронной почты: " + user.getEmail());
                        System.out.println("Вы ввели login: " + user.getLogin());
                        System.out.println("Вы ввели пароль: " + user.getPassword());

                        System.out.println("Если необходимо откорректировать данные регистрации (есть ошибка) - нажмите 0, если все правильно - введите любое значение, отличное от 0");

                        a2 = Input.nextLine();
                    }

                    while (a2.equals("0"));

                    System.out.println("_______________________________________________________________________________");
                    System.out.println("Данные о пользователе зафиксированы");

                    System.out.println("Зафиксированная фамилия: " + user.getSername());
                    System.out.println("Зафиксированное имя: " + user.getName());
                    System.out.println("Зафиксированное отчество: " + user.getPatronymic());
                    System.out.println("Зафиксированный номер телефона: " + user.getTelephone_number());
                    System.out.println("Зафиксированный адрес электронной почты: " + user.getEmail());
                    System.out.println("Зафиксированный login: " + user.getLogin());
                    System.out.println("Зафиксированный пароль: " + user.getPassword());
                    System.out.println("_______________________________________________________________________________");


                    n = n + 1;


                    if (n == 1) {
                        user.setRole("администратор");
                    } else {
                        user.setRole("посетитель");
                    }
                    user.setId_(n);


                    users.add(user);

                    System.out.println("Пользователь добавлен");
                    System.out.println("_______________________________________________________________________________");

                    break;


                case "2":


                    System.out.println("Авторизация");

                    System.out.println("Введите login или email или номер телефона (в формате 8-ХХХ-ХХХ-ХХ-ХХ или +7-ХХХ-ХХХ-ХХ-ХХ)");

                    Scanner Input5 = new Scanner(System.in);
                    String login = Input5.nextLine();
                    System.out.println("Вы ввели - " + login);

                    if (login.matches("(\\+7|8)-\\d{3}-\\d{3}-\\d{2}-\\d{2}")) {
                        if (login.length() == 16) {
                            login = login.substring(3);
                        } else if ((login.length() == 15)) {
                            login = login.substring(2);
                        }
                    }


                    System.out.println("Введите пароль");
                    String passwordAuth = Input5.nextLine();


                    if ((findUser1(login, passwordAuth, users, products)) || (findUser2(login, passwordAuth, users, products)) || (findUser3(login, passwordAuth, users, products))) {
                        //  System.out.println("Ваш id = " );
                    } else {
                        System.out.println("НЕ АВТОРИЗОВАНЫ");
                    }
                    break;

                case "0":

                    return;


                default:
                    System.out.println("Ни одно из условий не подошло");

            }

//switch input menu end_____________________________________________________________________________________

        }

//While end__________________________________________________________________________________________________
    }


    //findUser1___________________________________________________________________________________________________
    public static boolean findUser1(String login, String password, ArrayList<User> users, ArrayList<Product> products) {


        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("Вы авторизованы, вы - " + user.getRole());
                identificator = user.getId_();
                rabota_autoriz(users, products);

                return true;

            }
        }

        return false;
    }

    //findUser1 end______________________________________________________________________________________________
//findUser2__________________________________________________________________________________________________
    public static boolean findUser2(String email, String password2, ArrayList<User> users, ArrayList<Product> products) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password2)) {
                System.out.println("Вы авторизованы, вы - " + user.getRole());
                identificator = user.getId_();
                rabota_autoriz(users, products);

                return true;

            }
        }

        return false;
    }

//findUser2 end____________________________________________________________________________________________

    public static boolean findUser3(String telephone_number, String password3, ArrayList<User> users, ArrayList<Product> products) {


        for (User user : users) {
            if (user.getTelephone_number().equals(telephone_number) && user.getPassword().equals(password3)) {
                System.out.println("Вы авторизованы, вы - " + user.getRole());
                identificator = user.getId_();
                rabota_autoriz(users, products);

                return true;

            }
        }

        return false;
    }


//findUser3 end____________________________________________________________________________________________


    public static boolean rabota_autoriz(ArrayList<User> users, ArrayList<Product> products) {


        for (User user : users) {


            if (user.getId_() == identificator) {


                if (user.getRole().equals("администратор")) {
                    System.out.println("Для работы в меню администратора нажмите любую цифру, отличную от 0");

                    Scanner Input = new Scanner(System.in);

                    String proba1;
                    proba1 = Input.nextLine();
                    while (!proba1.equals("0")) {
                        do {

                            System.out.println("Введите:\n1 - для добавления товара;\n2 - для удаления товара по номеру в списке;\n3 - для просмотра информации о всех товарах;\n4 - для просмотра информации о всех зарегистрированных пользователях;\n5 - для смены роли пользователю;\n0 - для выхода из меню администратора");
                            proba1 = Input.nextLine();

                            switch (proba1) {


                                case "1":
                                    String a1;
                                    String a2;


                                    Scanner Input2 = new Scanner(System.in);

                                    System.out.println("Добавление нового товара");
                                    Product product = new Product();
                                    do {

                                        boolean nonunic;


                                        do {
                                            do {
                                                nonunic = false;


                                                System.out.println("Введите номер товара (формат ввода: первые 2 символа - заглавные буквы, остальные 4 символа - цифры)");

                                                while (!product.setId(Input2.nextLine())) ;
                                                for (Product pr : products) {
                                                    if (pr.getId().equals(product.getId())) {
                                                        nonunic = true;
                                                        System.out.println("Товар с таким номером уже был добавлен");
                                                    }
                                                }
                                            }
                                            while (nonunic);
                                            System.out.println("Вы ввели номер товара: " + product.getId());
                                            System.out.println("Если номер товара введен неправильно - нажмите - 0, если все правильно - введите любое значение, отличное от 0");
                                            System.out.println("_________________________________________________________________________________________________");
                                            a1 = Input2.nextLine();
                                        }
                                        while (a1.equals("0"));
                                        System.out.println("Номер товара зафиксирован");
                                        System.out.println("Зафиксированный номер товара - " + product.getId());
                                        System.out.println("_________________________________________________________________________________________________");

//________________________________________________________________________________________________________________________________________

                                        do {


                                            System.out.println("Введите наименование товара");

                                            while (!product.setProduct_name(Input2.nextLine())) ;
                                            System.out.println("Вы ввели наименование товара: " + product.getProduct_name());
                                            System.out.println("Если наименование товара введено неправильно - нажмите - 0, если все правильно - введите любое значение, отличное от 0");
                                            System.out.println("_________________________________________________________________________________________________");
                                            a1 = Input2.nextLine();
                                        }
                                        while (a1.equals("0"));
                                        System.out.println("Наименование товара зафиксировано");
                                        System.out.println("Зафиксированное наименование товара - " + product.getProduct_name());
                                        System.out.println("_________________________________________________________________________________________________");
//________________________________________________________________________________________________________________________________________
                                        Scanner console = new Scanner(System.in);

                                        do {

                                            do {
                                                System.out.println("Введите цену товара (значение должно быть положительным и типа double)");
                                                while (!console.hasNextDouble()) {
                                                    console.next();
                                                    System.out.println("Вы ввели не значение типа double, попробуйте еще раз");
                                                }
                                            }
                                            while (!product.setProduct_price(console.nextDouble()));

                                            System.out.println("Вы ввели цену: " + product.getProduct_price());
                                            System.out.println("Если цена введена неправильно - нажмите - 0, если все правильно - введите любое значение, отличное от 0");
                                        }
                                        while (console.nextDouble() == 0);
                                        System.out.println("Цена товара зафиксирована");
                                        System.out.println("Зафиксированная цена товара - " + product.getProduct_price());
                                        System.out.println("_________________________________________________________________________________________________");
//________________________________________________________________________________________________________________________________________
                                        System.out.println("Итоговая проверка введенных данных о товаре");


                                        System.out.println("Вы ввели номер товара: " + product.getId());
                                        System.out.println("Вы ввели наименование товара: " + product.getProduct_name());
                                        System.out.println("Вы ввели цену: " + product.getProduct_price());

                                        System.out.println("Если необходимо откорректировать данные о товаре (есть ошибка) - нажмите 0, если все правильно - введите любое значение, отличное от 0");
                                        System.out.println("_________________________________________________________________________________________________");
                                        a2 = Input2.nextLine();
                                    }

                                    while (a2.matches("0"));

                                    System.out.println("Данные о товаре зафиксированы");
                                    System.out.println("Зафиксированный номер товара: " + product.getId());
                                    System.out.println("Зафиксированное наименование товара: " + product.getProduct_name());
                                    System.out.println("Зафиксированная цена: " + product.getProduct_price());

                                    products.add(product);
                                    System.out.println("_________________________________________________________________________________________________");
                                    System.out.println("Товар добавлен.");
                                    System.out.println("_________________________________________________________________________________________________");


                                    break;


                                case "2":
                                    System.out.println("Удаление товара по его номеру(со списком товаров (который в т.ч. содержит номер товара) можно ознакомиться, если нажать 3 в меню администратора)");
                                    Product product1 = new Product();
                                    if (!udalenTovaraponomeru(product1.getId(), products)) {
                                        System.out.println("Товара с таким номером нет в списке товаров");

                                    }


                                    break;
                                case "3":
                                    System.out.println("Информация о товарах:");
                                    for (Product pr : products) {
                                        System.out.println(pr);
                                    }

                                    break;

                                case "4":
                                    System.out.println("Информация о зарегистрированных пользователях:");
                                    for (User u : users) {
                                        System.out.println(u);
                                    }

                                    break;

                                case "5":
                                    System.out.println("Смена роли пользователю: (с информацией о пользователях (в т.ч.о том - у какого пользователя какая роль) можно ознакомиться, если нажать 4 в меню администратора)");

                                    if (!smenaRoli(user.getSername(), user.getRole(), users)) {
                                        System.out.println("Пользователя с такой фамилией нет среди зарегистрированных пользователей");

                                    }

                                    break;

                                case "0":
                                    break;
                                default:
                                    System.out.println("Вы ввели некорректное значение");
                                    break;


                            }
                        }

                        while (!proba1.equals("0"));

                    }
                } else if (user.getRole().equals("посетитель")) {
                    System.out.println("Для входа в меню посетителя нажмите любую цифру, отличную от 0");
                    Scanner Ввод4 = new Scanner(System.in);
                    String inputMenu3 = Ввод4.nextLine();
                    while (!inputMenu3.equals("0")) {
                        do {


                            System.out.println("Введите:\n1 - просмотра списка товаров;\n0 - для выхода из меню посетителя");
                            inputMenu3 = Ввод4.nextLine();
                            switch (inputMenu3) {
                                case "1":
                                    System.out.println("Просмотр списка товаров");
                                    for (Product pr : products) {
                                        System.out.println(pr);
                                    }

                                    break;
                                case "0":
                                    break;
                                default:
                                    System.out.println("Вы ввели некорректное значение");
                                    break;
                            }


                        }
                        while (!inputMenu3.equals("0"));

                    }
                }


                return true;
            }

        }

        return false;
    }


    public static boolean smenaRoli(String sername, String role, ArrayList<User> users) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Введите фамилию пользователя, которому хотите поменять роль");

        String f = Input.nextLine();
        for (User smenatoli : users) {
            if (smenatoli.getSername().equals(f)) {

                if (smenatoli.getRole().equals("посетитель")) {
                    smenatoli.setRole("администратор");
                } else if (smenatoli.getRole().equals("администратор")) {
                    smenatoli.setRole("посетитель");
                }


                System.out.println("Роль пользователя с фамилией - " + f + " изменена. Новая роль пользователя с фамилией " + f + " - " + smenatoli.getRole());
                System.out.println("Введите:\n- любое число, отличное от 0 для продолжения работы в меню администратора\n- 0 - для выхода из меню администратора");
                return true;
            }

        }
        return false;
    }

    public static boolean udalenTovaraponomeru(String product_name, ArrayList<Product> products) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Введите номер товара, котороый хотите удалить");
        String udalenie = Input.nextLine();
        for (Product produ : products) {
            if (produ.getId().equals(udalenie)) {
                Iterator<Product> productIterator = products.iterator();
                while (productIterator.hasNext()) {
                    Product nextProduct = productIterator.next();
                    if (nextProduct.id.equals(udalenie)) {
                        productIterator.remove();

                    }
                }
                System.out.println("Товар c номером = " + udalenie + " удален");
                System.out.println("Введите:\n- любое число, отличное от 0 для продолжения работы в меню администратора\n- 0 - для выхода из меню администратора");
                return true;
            }
        }
        return false;
    }
}

