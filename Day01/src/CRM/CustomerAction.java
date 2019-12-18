package CRM;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class CustomerAction extends ActionSupport {

    public String find(){

        List<Customer> list = new  CustomerServerImp().find();

        ServletActionContext.getRequest().setAttribute("list",list);
        return NONE;
    }

}
