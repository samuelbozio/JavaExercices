public class programa {

    public String name;
    public double price;

    public int quantity;

    public void AddProducts(int quantity) {
       this.quantity += quantity;
    }

    public double TotalValueStock() {
        return price * quantity;
    }


}
