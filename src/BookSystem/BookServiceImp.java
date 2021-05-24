package BookSystem;

import java.util.HashSet;
import java.util.Set;


public class BookServiceImp{
    private Set<Book> bookSet=new HashSet<Book>();

    BookServiceImp(){
        initBook();
    }

    //初始化图书
    private void initBook() {
        Book b1=new Book(1,"web前端",25.5,128);
        Book b2=new Book(2,"JAVA",35.5,178);
        Book b3=new Book(3,"C/C++",67.5,378);
        //
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
    }
    //
    public void addBooks(Book newbook){
        //判断是否重名书籍
        boolean rs=checkBook(newbook);
        if (rs==true){
            bookSet.add(newbook);
            System.out.println("添加成功");

        }else {
            System.out.println("添加失败");
        }

    }

    private boolean checkBook(Book newbook) {
        for (Book tmp:bookSet){
            if (tmp.getName().equals(newbook.getName())!=true){
                return true;
            }
        }
        return false;
    }
    public void ShowAll(){
        for (Book tmp:bookSet){
            System.out.println(tmp.toString());
        }
    }

}
