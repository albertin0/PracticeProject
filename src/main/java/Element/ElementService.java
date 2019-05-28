package Element;

import Element.Element;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ElementService {
    private List<Element> elements = new ArrayList<Element>(Arrays.asList(
       new Element(1, "James", "Is a very good bike rider."),
       new Element(2, "Brenda", "Good in Cooking.")
    ));

    public List<Element> getAllElements()   {
        return elements;
    }

    public void addElement(Element e)   {
        this.elements.add(e);
    }

    public Element getElement(int id)   {
        return elements.stream().filter(t->(t.getId()==id)).findFirst().get();
    }

    public void removeElement(int id) {
        int i;
        for (i = 0; i < elements.size(); i++)
            if (elements.get(i).getId()==id) {
                elements.remove(i);
                return;
            }
    }

    public void updateElement(Element e,int id) {
        int i;
        for(i=0;i<elements.size();i++)
            if(elements.get(i).getId()==id) {
                elements.set(i,e);
                return;
            }
    }

}
