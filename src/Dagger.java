public class Dagger extends Weapon {

    Dagger(double price, double weight, double damage){
        super(price, weight, damage);
    }

    public boolean useItem(){
        System.out.println("The Dagger is used and caused damage of " + getDamageAmount() + " points.");
        return true;
    }

    @Override
    public String toString() {
        String daggerInfo = "Weapon type: Dagger" + "\n"  + super.toString();
        return daggerInfo;
    }
}
