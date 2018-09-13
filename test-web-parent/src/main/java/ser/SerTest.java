package ser;

import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2018/4/15.
 */
public class SerTest {

    public static void main(String[] args) throws Exception{
        serObjeect();
        deserObject();
    }

    /**
     * 序列化对象
     */
    public static void serObjeect() throws Exception{
        Employee employee = new Employee();
        employee.name = "ali";
        employee.address = "hangzhou";
        employee.sno = "0001";
        employee.number = "No_001";

        FileOutputStream outputStream = new FileOutputStream("src/main/java/ser/file/employee.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(employee);

        System.out.println("ser.object.success");
    }

    /**
     * 反序列化对象
     * @throws Exception
     */
    public static void deserObject() throws Exception{
        FileInputStream inputStream = new FileInputStream("src/main/java/ser/file/employee.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Employee employee = (Employee) objectInputStream.readObject();

        System.out.println(JSONObject.toJSON(employee));

    }
}
