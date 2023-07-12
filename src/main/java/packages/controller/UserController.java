package packages.controller;






//controller是表现层的包
//在JavaWeb中相当于servlet
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import packages.proj.student;



@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/method")
    @ResponseBody
    public String method(String name,int age)
    {
        System.out.println("method");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        return "{'name':'wangHao'}";
    }

    @RequestMapping("/test01")
    @ResponseBody
    public void test01(String[] hobby){

        for (String s : hobby) {
            System.out.println(s);
        }

    }

    @RequestMapping("/test02")
    @ResponseBody
    public void test02(@RequestBody String[] hobby){
        for (String s : hobby) {
            System.out.println(s);
        }
    }

    @RequestMapping("test03")
    @ResponseBody
    public void test03(@RequestBody student s){
        System.out.println(s.toString());
    }

    @RequestMapping("test04")
    @ResponseBody//可以在浏览器那里转换成json数据
    public student test04(){
        student s=new student();
        s.setAge(100);
        s.setName("孙悟空");
        return s;
    }



}
