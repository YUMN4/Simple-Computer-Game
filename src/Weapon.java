public class Weapon extends Item {

    private double damageAmount;
    private boolean isUsed;
    Weapon(double price, double weight, double damage){
        super(price, weight);
        if(damage < 0){ damage = 0; }
        this.damageAmount = damage;
        isUsed = false;
    }

    public double getDamageAmount(){ return this.damageAmount; }

    public boolean useItem(){
        isUsed = true;
        this.damageAmount = getDamageAmount() + this.damageAmount;
        return true;
    }

    @Override
    public String toString(){
        String weaponInfo = "Weapon price: " + getItemPrice() +
                "\nWeapon weight: " + getItemWeight() +
                "\nWeapon damage amount: " + this.damageAmount;
        return weaponInfo;
    }




}
