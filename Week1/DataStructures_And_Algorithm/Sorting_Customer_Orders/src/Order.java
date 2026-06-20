import java.security.PrivateKey;

public class Order {
    private int  orderId;
    private  String coustomerrName;
    private int totalPrice;

    Order(int orderId,String coustomerrName, int totalPrice){
        this.coustomerrName=coustomerrName;
        this.orderId=orderId;
        this.totalPrice=totalPrice;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCoustomerrName(String coustomerrName) {
        this.coustomerrName = coustomerrName;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCoustomerrName() {
        return coustomerrName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    @Override
    public String toString(){
        return "Order { Id = "+orderId+" , Customer NAme : "+coustomerrName+" , Total Price : "+totalPrice+" }";
    }
}
