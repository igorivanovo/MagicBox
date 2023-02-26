import java.util.Random;

public class MagicBox<T> {
    private int length;
    // public T item;
    private T[] items;

    public MagicBox(int length) {
        this.length = length;
        this.items = (T[]) new Object[length];

    }

    public int getLength() {
        return length;
    }

    public T[] getItems() {
        return items;
    }

    Random random = new Random();


    boolean add(T item) {
        for (int i = 0; i < length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("коробка полна");
        return false;

    }

    public T pick() {
        for (int i = 0; i < length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(" Коробка не полна, свободно ячеек  :  " + (length - i));
            }
        }
        int randomInt = random.nextInt(length);
        return items[randomInt];
    }
}

