public abstract class Item {

    private static int itemQuantity;
    private final double itemPrice;
    private final double itemWeight;

    Item(double price, double weight){
        if(price < 0){ price = 0; }
        if(weight < 0){ weight = 0; }

        this.itemPrice = price;
        this.itemWeight = weight;
        itemQuantity++;
    }

    public static int getItemQuantity(){ return itemQuantity; }

    public double getItemPrice(){ return this.itemPrice; }

    public double getItemWeight(){ return this.itemWeight; }

    public abstract boolean useItem();

}
