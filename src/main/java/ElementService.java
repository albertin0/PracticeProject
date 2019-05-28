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

    public void removeElement(Element e) {
        int in = -1, i;
        for (i = 0; i < elements.size(); i++)
            if (elements.get(i).equals(e)) {
                in = i;
                break;
            }
        if(in>0)    elements.remove(in);
    }

}
