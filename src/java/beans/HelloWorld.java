package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "helloWorld", eager = true)
@ViewScoped
public class HelloWorld {

    private String message = "Pozdrav iz Message Beana";
    
    public HelloWorld() {
    }

    public String getMessage() {
        return message;
    }
    
    
}
