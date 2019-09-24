package by.epam.branching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task34 {
    /*Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает
    стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»;
    если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи;
    если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

    Здесь сделано чуть больше. Сам процесс проверки денег и печати: 74 - 94 строка.*/

    public static void main(String[] args) throws Exception {
        BookStore bookStore = new BookStore();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bookStore.printBooks();

        System.out.println("Choose book you want to buy. Enter id: ");
        int input = Integer.parseInt(bufferedReader.readLine());
        bookStore.bookToCart(input);

        while (true) {
            System.out.println("Enter money!");
            int moneyInput = Integer.parseInt(bufferedReader.readLine());
            if (bookStore.sellCart(moneyInput)) {
                break;
            };
        }
    }

    /* Для эмуляции магазина создал класс BookStore. Содержит в себе два элемента: корзину и коллекцию книг.
    * В конструкторе при инициализации самого магазина происходит заполнение товаром. Отдельный метод для распечатывания
    * товаров.
    * Для покупки книги спрашиваем у пользователя id и кладем ее к в корзину.
    * Далее чтобы завершить покупку нужно нужно выполнить метод sellCart. Который проверяет хватает ли денег и опустошает
    * корзину если денег достаточно и просит денег заново если сумма недостаточная.
    * Сам класс Book написан внизу программы.*/

    private static class BookStore {
        private List<Book> booksList = new ArrayList<>();
        private Cart cart = new Cart();

        private void printBooks(){
            for(Book element: booksList) {
                System.out.println(element);
            }
        }

        private void bookToCart(int id) {
            for(Book element: booksList) {
                if(element.id == id) {
                    element.setQuantity(element.quantity - 1);
                    cart.goodsInCart.add(element);
                }
            }
        }

        private BookStore() {
            addBooksToStore();
        }

        private void addBooksToStore() {
            int id = booksList.size()+1;
            booksList.add(new Book("Harry Potter", 50,id, 5));
            id++;
            booksList.add(new Book("Peter Parker", 150,id,10));
            id++;
            booksList.add(new Book("Mary Jane", 250,id,10));
            id++;
            booksList.add(new Book("Succes History of succesfull success", 999,id,2));
        }

        private boolean sellCart(int moneyInput) {
            int moneyNeed = cart.goodsInCart.stream()
                    .mapToInt(n -> n.price)
                    .sum();
            System.out.println("Your cart sum: " + moneyNeed);
            if(moneyNeed > moneyInput) {
                System.out.println("Not enough money!");
            }
            if(moneyNeed < moneyInput) {
                System.out.println("Succesfull! Your change: " + (moneyInput-moneyNeed));
                cart.goodsInCart = new ArrayList<>();
                return true;
            }
            if(moneyInput == moneyNeed) {
                cart.goodsInCart = new ArrayList<>();
                System.out.println("Thank you!");
                return true;
            }
            return false;
        }
    }

    private static class Cart {
        private List<Book> goodsInCart = new ArrayList<>();
    }

    private static class Book {
        private int id;
        private String name;
        private int price;
        private int quantity;

        private Book (String name, int price, int id, int quantity){
            this.name = name;
            this.price = price;
            this.id = id;
        }

        @Override
        public String toString() {
            return ("Book name: " + name + ". Price is: " + price
                    + ". ID to order : " + id + ". Quantity: " + quantity);
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

}
