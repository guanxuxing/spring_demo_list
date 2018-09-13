package Test;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/15.
 */
public class BookManage {

    public static Book [] books = new Book[30];  // 图书馆存书数量
    Scanner scanner = new Scanner(System.in);

    /***
     * 书籍手动初始化
     */
    public void init(){
        books[0] = new Book();
        Book book = new Book();
        book.setNo("0001");
        books[0] = book;
    }

    /***
     * 图书查看方法
     */
    public void show(){}

    /***
     * 书籍入库方法
     */
    @Test
    public void add(){
        System.out.println("请输入书籍编号:");
        String no =scanner.next();
        System.out.println("请输入书籍名称:");
        String name =scanner.next();
        for (int i =0 ; i< books.length; i++) {
            Book book = books[i];
            if (null == book){
                book  = new Book();
                book.setNo(no);
                book.setName(name);
            }
        }
    }


    /****
     * 书籍借出方法
     */
    public void lend(){}


    /***
     * 图书归还方法
     */
    public void retbok(){}

}
