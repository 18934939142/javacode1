package BookSystem;

import java.util.Objects;

/**
 * @author 不用减肥的大熊猫
 * 1.图书类（Book）：
 * a)图书编号（id）
 * b)图书名称（name）
 * c)图书单价（price）
 * 库存数量（storage）
 */
public class Book {
    private int id;
    private String name;
    private double price;
    private int storage;

    public Book() {
    }

    public Book(int id, String name, double price, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "书库：【" +
                "id=" + id +
                ", 书名=《" + name + '》' +
                ", 价格=" + price +
                ", 库存=" + storage +
                '】';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id &&
                Double.compare(book.price, price) == 0 &&
                storage == book.storage &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, storage);
    }
}
