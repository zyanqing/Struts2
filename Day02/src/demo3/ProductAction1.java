package demo3;

import com.opensymphony.xwork2.ActionSupport;
import domain.Product;

import java.util.List;

public class ProductAction1 extends ActionSupport {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String execute() throws Exception {

        for (Product product : products){
             System.out.println(product);
        }
        return NONE;
    }
}
