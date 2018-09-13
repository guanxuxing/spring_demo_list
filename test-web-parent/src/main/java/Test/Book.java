package Test;

/**
 * Created by Administrator on 2018/4/15.
 */
public class Book {

    private String  no;  //编号
    private String name; //书名
    private String content; //内容
    private String date; // 入库/借出/归还时间
    private String status; // 0： 未借出 1：已借出



    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
