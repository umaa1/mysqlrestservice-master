package pizzaloop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PizzaDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productId;
    private String title;
    private String sortdesc;
    private Double price;
    private String image;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSortdesc() {
        return sortdesc;
    }

    public void setSortdesc(String sortdesc) {
        this.sortdesc = sortdesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
