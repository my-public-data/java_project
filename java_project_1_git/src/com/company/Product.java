package com.company;

public class Product {
    public String id;
    private String product_name;
    private double product_price;

    public Product(String id, String product_name, Double product_price) {
        this.id = id; // номер товара
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public Product() {

    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        //  this.id = id;
        if (id.matches("[A-ZА-Я]{2}\\d{4}")) {
            this.id = id;
            return true;
        } else {
            System.out.println("Введите корректные данные"); // Если то, что введет пользователь не соответствует регулярному выражению
            return false;
        }

    }


    public String getProduct_name() {
        return product_name;
    }

    public boolean setProduct_name(String product_name) {
        if (product_name.matches("^\\s*$")) {                // Регулярное выражение - проверка на пустоту
            System.out.println("Значение наименования товара не может быть пустым");
            return false;
        } else {
            this.product_name = product_name;
            return true;
        }
    }


    public double getProduct_price() {
        return product_price;
    }

    public boolean setProduct_price(double product_price) {
        if (product_price <= 0) {
            System.out.println("Значение цены товара должно быть положительным");
            return false;


        } else {
            this.product_price = product_price;
            return true;
        }

    }


    @Override
    public String
    toString() {
        return "номер товара - " + id + ", " +
                "наименование товара - " + product_name + ", " +
                " цена товара - " + product_price;
    }
}

