import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main (String[] args) {

        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(5);
        grades.add(4);
        grades.add(1);
        grades.add(5);
        grades.add(6);
        grades.add(2);
        grades.add(5);
        grades.add(4);
        grades.add(6);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(1);
        grades.add(5);
        grades.add(6);

        int min = grades.get(0);
        int max = grades.get(0);
        int n = grades.size();
        double sum = 0;


        for (int i = 0; i < n; i++) {
            if (grades.get(i) <= min) {
                min = grades.get(i);
            }

            if (grades.get(i) >= max) {
                max = grades.get(i);
            }
            sum = sum + grades.get(i);
        }

        double arithmeticAverage = (sum-min-max)/(n-2);

        System.out.println("Liczba wszystkich ocen z Informatyki: "+grades.size());
        System.out.println("Najsłabsza ocena to: "+min);
        System.out.println("Najlepsza ocena to: "+max);
        System.out.println("Średnia ocen bez skrajnych wartości wynosi: "+arithmeticAverage);

        System.out.println("-------------------------------------------------------------");


        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book("Potop", 1886));
        books.add(new Book("Detektyw Pozytywka", 2005));
        books.add(new Book("Rok 1984", 1949));
        books.add(new Book("Pan Tadeusz", 1834));
        books.add(new Book("Lalka", 1889));
        books.add(new Book("Opowieść wigilijna", 1843));
        books.add(new Book("Afryka Kazika", 2008));
        books.add(new Book("Mały Książę", 1943));

        System.out.println("Książki wydane w roku 2000 lub później:");

        for (Book b : books) {
            if (b.getYear() >=2000) {
                System.out.println("Tytuł: "+b.getTitle()+". Rok wydania: "+b.getYear());
            }
        }


    }
}
