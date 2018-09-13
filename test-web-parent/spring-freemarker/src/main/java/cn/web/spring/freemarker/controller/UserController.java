package cn.web.spring.freemarker.controller;

import cn.web.spring.freemarker.entity.User;
import cn.web.spring.freemarker.util.FreeMarkerUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/6.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "ftl",produces = "application/json; charset=utf-8")
    public String ftl(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "freemarker");
        map.put("name", "gxx");
        return FreeMarkerUtil.instance().geneFileStr(request, "hello.ftl", map);
    }

    @RequestMapping(value = "fl")
    public String viewftl(Model model){
        model.addAttribute("name","ITDragon博客");
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "info")
    public User info(){

        User user = new User();
        user.setName("gxx");
        user.setAge(26);
        return user;

    }
}
