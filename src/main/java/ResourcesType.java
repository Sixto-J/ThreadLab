import java.util.ArrayList;

public class ResourcesType {

    String productName;
    int quantity;
    int maxquantity;
    int minquantity;
    final ArrayList<ResourcesType> resourcesTypes;


    public ResourcesType(int maxquantity, int minquantity, String productName, int quantity) {
        this.maxquantity = maxquantity;
        this.minquantity = minquantity;
        this.productName = productName;
        this.quantity = quantity;
        this.addresource();
        this.removeResource();
    }


    final String[] resources = new String[] {
            "Canelones", "Pizza", "Flan", "Arroz", "Macarrones"
    };

    public void addresource(){}
    public void removeResource(){}

}
