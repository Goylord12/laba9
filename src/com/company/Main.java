package com.company;


//а) Создать интерфейс "Товар" с методами, работающие с названием товара, ценой, рейтингом.
//б) Создать три класса, реализующие интерфейс "Товар"
//в) Создать по одному экземпляру классов
//г) Создать интерфейс "Пользователь"с методами, работающие с логином и паролем
//д) Создать три класса реализующий интерфейс "Пользователь" и объект класса
//е) Создать класс, реализующий одновременно интерфейс "Товар" и "Пользователь".
//]В этом классе создать метод выводящий сообщение,
//]что такой-то пользователь купил такой-то товар. Создать экземпляр этого класса.



public class Main {

    public static void main(String[] args) {
        Gashish gashishSPb = new Gashish("gashishSPb", 13000, 5);
        nuBo Bud = new nuBo("Bud 0%", 100, 5);
        Moloko Milk = new Moloko("Russian Sandart milk", 50, 2);

        usernameUser user1 = new  usernameUser("qq", "1f2d3s4a", "Ilya");
        mailUser user2 = new mailUser("Blow12Job@t.com","asdfreq","VovaVist");
        phoneUser user3 = new phoneUser("898600861", "trewq", "Garry");

        order order1 = new order(user1, gashishSPb);
        order1.getOrder();
    }
}
interface Product{
    double getRating();
    int getPrice();
    String getName();
}
class Gashish implements Product{
    double rating;
    int price;
    String name;

    Gashish(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class nuBo implements Product{
    double rating;
    int price;
    String name;

    nuBo(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class Moloko implements Product{
    double rating;
    int price;
    String name;

    Moloko(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

interface IUser{
    void setPassword(String password);
    void setUserAuthMethod(String userAuthMethod);
    String getUserAuthMethod();
    String getName();
}
class usernameUser implements IUser{
    String userName;
    String password;
    String name;

    usernameUser(String userName, String password, String name){
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public void setUserAuthMethod(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return userName;
    }

    public String getName() {
        return name;
    }
}
class mailUser implements IUser{
    String mail;
    String password;
    String name;

    mailUser(String mail, String password, String Name){
        this.mail = mail;
        this.password = password;
        this.name = Name;
    }

    public void setUserAuthMethod(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return mail;
    }
    public String getName() {
        return name;
    }
}
class phoneUser implements IUser{
    String phoneNumber;
    String password;
    String name;

    phoneUser(String phoneNumber, String password, String Name){
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = Name;
    }

    public void setUserAuthMethod(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
}

class order implements Product, IUser{
    IUser user;
    Product goods;

    order(IUser user, Product goods){
        this.user = user;
        this.goods = goods;
    }
    public double getRating() {
        return goods.getRating();
    }

    public int getPrice() {
        return goods.getPrice();
    }

    public String getName() {
        return goods.getName();
    }

    public void setPassword(String password) {
        user.setPassword(password);
    }
    public void setUserAuthMethod(String AuthMethod){
        user.setUserAuthMethod(AuthMethod);
    }
    public String getUserAuthMethod(){
        return user.getUserAuthMethod();
    }
    public void getOrder(){
        System.out.printf("%s ordered %s", user.getName(), goods.getName());
    }
}