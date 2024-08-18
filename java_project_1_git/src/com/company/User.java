package com.company;

import java.util.Objects;

public class User {
    private String sername;
    private String name;
    private String patronymic; // отчество
    private String telephone_number;
    private String email;
    private String login;
    private String password;
    private String role; // роль
    private int id_; // роль
// Создаем конструктор__________________________________________________

    public User(String sername, String name, String patronymic, String telephone_number, String email, String login, String password, String role, int id_) {
        this.sername = sername;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone_number = telephone_number;
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
        this.id_ = id_;
    }


    public User() {

    }

    public String getSername() {
        return sername;
    }

    public boolean setSername(String sername) {
        if (sername.matches("^[A-ZА-ЯЁ][^A-ZА-ЯЁ]*$")) {
            this.sername = sername;
            return true;
        } else {
            System.out.println("Введите корректные данные");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.matches("^[A-ZА-ЯЁ][^A-ZА-ЯЁ]*$")) {
            this.name = name;
            return true;
        } else {
            System.out.println("Введите корректные данные");
            return false;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public boolean setPatronymic(String patronymic) {
        if (patronymic.matches("^[A-ZА-ЯЁ][^A-ZА-ЯЁ]*$")) {
            this.patronymic = patronymic;
            return true;
        } else {
            System.out.println("Введите корректные данные");
            return false;
        }
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public boolean setTelephone_number(String telephone_number) {
        if (telephone_number.matches("(\\+7|8)-\\d{3}-\\d{3}-\\d{2}-\\d{2}")) {
            if (telephone_number.length() == 16) {
                this.telephone_number = telephone_number.substring(3);
            } else if (telephone_number.length() == 15) {
                this.telephone_number = telephone_number.substring(2);
            }


            return true;
        } else {
            System.out.println("Введите корректное значение");
            return false;
        }
    }


    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Введите корректное значение");
            return false;
        }

    }


    public String getLogin() {
        return login;
    }

    public boolean setLogin(String login) {
        if (login.matches("^\\s*$")) {
            System.out.println("Значение логина не может быть пустым");
            return false;
        } else {
            this.login = login;
            return true;
        }
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.matches("^\\s*$")) {
            System.out.println("Значение пароля не может быть пустым");
            return false;
        } else {
            this.password = password;
            return true;
        }
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }


    public void printInfo() {
        System.out.println("фамилия - " + sername + "," + " " + "имя - " + name + "," + " " + "отчество - " + patronymic + "," + " " + "номер телефона - +7-" + telephone_number + "," + " " + "адрес электронной почты - " + email);
    }

    public void printInfo2() {
        System.out.println("фамилия - " + sername + "," + "роль - " + role);
    }


    @Override
    public String toString() {
        return "фамилия - " + sername + ", " +
                "имя - " + name + ", " +
                "отчество - " + patronymic + ", " +
                "номер телефона - +7-" + telephone_number + ", " +
                "email - " + email + ", " +
                "логин - " + login + ", " +
                "пароль - " + password + ", " +
                "роль - " + role + ", " +
                "id - " + id_;


    }
}

