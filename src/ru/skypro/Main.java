package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author Turgenev = new Author("Иван", "Тургенев");
        Book otsiIDeti = new Book("Отцы и дети","" + Turgenev, 1862);
        Author Chekhov = new Author("Антон", "Чехов");
        Book palataNomer6 = new Book("Палата номер 6", "" + Chekhov, 1892);
        otsiIDeti.setPublishingYear(1866);
        System.out.println(otsiIDeti);
        System.out.println(palataNomer6);
    }
}
