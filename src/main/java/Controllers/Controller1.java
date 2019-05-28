package Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    int sum=0;

    @RequestMapping("/hello")
    public String hello()   {
        return "Hi";
    }

    @RequestMapping("/add/{c}")
    public String add10(@PathVariable("c") int n) {
        sum+=n;
        return String.valueOf(n)+" added to sum.";
    }

    @RequestMapping("/getVal")
    public String getVal()  {
        return String.valueOf(sum);
    }

}
