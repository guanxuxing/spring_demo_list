package ser;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/15.
 */
public class Employee implements Serializable{

    private static final Long serVersionUUid = 1L;

    public String name;
    public String address;
    public String number;

    public transient String sno;



}
