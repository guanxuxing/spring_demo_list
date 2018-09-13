package thread;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import sun.nio.ch.IOUtil;

import java.util.Base64;

/**
 * Created by Administrator on 2017/12/23.
 */
public class TestMy {
    public static void main(String[] args) throws Exception{
       /* BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] bytes = base64Decoder.decodeBuffer("123");

        BASE64Encoder base64Encoder = new BASE64Encoder();
        String str = base64Encoder.encode(bytes);

        System.out.println(str);


       byte[] bytes1 =  org.apache.commons.codec.binary.Base64.decodeBase64("gxx");
       byte[] bytes2 = org.apache.commons.codec.binary.Base64.encodeBase64(bytes);
        System.out.println(new String(bytes2));*/

        String decodeStr = getBase64("gxx");
        System.out.println(decodeStr);
        String encodeStr = getFromBase64(decodeStr);
        System.out.println(encodeStr);

    }

    // 加密
    public static String getBase64(String str) {
        byte[] b = null;
        String s = null;
        try {
            b = str.getBytes("utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (b != null) {
            s = new BASE64Encoder().encode(b);
        }
        return s;
    }

    // 解密
    public static String getFromBase64(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(s);
                result = new String(b, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
