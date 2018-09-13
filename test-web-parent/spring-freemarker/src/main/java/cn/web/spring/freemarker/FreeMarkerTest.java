package cn.web.spring.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/6.
 */
public class FreeMarkerTest {

    @Test
    public void io() throws Exception{
        InputStream inputStream = FreeMarkerTest.class.getClassLoader().getResourceAsStream("ftl/ftl.ftl");
        String str = IOUtils.toString(inputStream, "UTF-8");
        System.out.println("----: " +str);
    }

    @Test
    public void txt() throws Exception{
        File file = new File("src/main/java/file/txt.txt");
        FileInputStream inputStream = new FileInputStream(file);
        String str = IOUtils.toString(inputStream, "UTF-8");
        System.out.println("txt: " + str);
    }

    @Test
    public void rs() throws Exception{
        File file = new File("src/main/resources/ftl/ftl.ftl");
        FileInputStream inputStream = new FileInputStream(file);
        String str = IOUtils.toString(inputStream, "UTF-8");
        System.out.print("fs.ftl: " + str);
    }

    @Test
    public void test00() throws Exception{
        FileInputStream inputStream = new FileInputStream(new File("src/main/webapp/WEB-INF/web.xml"));
        String str = IOUtils.toString(inputStream, "UTF-8");
        System.out.println("str : " + str);
    }

    @Test
    public void test_1() throws Exception{
       InputStream inputStream = FreeMarkerTest.class.getClassLoader().getResourceAsStream("freeMarker/hello.ftl");

//      1. 创建配置类
      //  Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        Configuration cfg = new Configuration();
//          1.1 设置模板加载目录
      //  cfg.setDirectoryForTemplateLoading(new File("hello"));
        cfg.setDirectoryForTemplateLoading(new File("src/main/resources/ftl/"));
//          1.2 设置编码
        cfg.setDefaultEncoding("UTF-8");
//          1.3 设置模板更新延迟时间
      //  cfg.setTemplateUpdateDelayMilliseconds(0);

//      2. 创建数据模型:模型数据一般用一个map 来构建
        Map<String,Object> root = new HashMap<String, Object>();
        root.put("title", "Hello World");
        root.put("name", "键盘上的幽灵");
        root.put("date", new Date());
//      3. 加载模板文件
        Template template = cfg.getTemplate("ftl.ftl");

//      4. 整合数据 和 模板，输出到控制台
        Writer out = new OutputStreamWriter(System.out);
        template.process(root, out);
        out.flush();
        out.close();
    }
}
