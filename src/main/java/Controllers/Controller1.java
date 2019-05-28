package Controllers;

import Element.Element;
import Element.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller1 {

    int sum=0;

    @Autowired
    ElementService elementService;

    @RequestMapping("/elements")
    public List<Element> getElements()  {
        return elementService.getAllElements();
    }

    @RequestMapping("/element/{id}")
    public Element getElement(@PathVariable("id") int id)   {
        return elementService.getElement(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/element")
    public void addElement(@RequestBody Element e)   {
        elementService.addElement(e);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/element")
    public void updateElement(@RequestBody Element e)   {
        elementService.updateElement(e,e.getId());
    }

    @RequestMapping(method=RequestMethod.DELETE, value="element/{id}")
    public void deleteElement(@PathVariable("id") int id)   {
        elementService.removeElement(id);
    }

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
