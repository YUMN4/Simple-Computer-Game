public class Shield extends Item implements Upgradable {

    private double defencePoints;
    private boolean isHeld;

    Shield(double price, double weight, double defencePoints){
        super(price, weight);
        if (defencePoints < 0){ defencePoints = 0; }
        this.defencePoints = defencePoints;
        isHeld = false;
    }

    double getDefencePoints(){ return this.defencePoints; }
    boolean getIsHeld(){ return this.isHeld; }

    public boolean useItem(){
        isHeld = true;
        return true;
    }

    @Override
    public String toString() {
        String shieldInfo = "Shield price: " + getItemPrice() +
                "\nShield weight: " + getItemWeight() +
                "\nShield defence points: " + getDefencePoints();
        return shieldInfo;
    }

    double getHit(double damagePoints){
        if(isHeld = true){
            if(defencePoints >= damagePoints){
                defencePoints = defencePoints - damagePoints;
                return 0.0;
            }
            if(defencePoints < damagePoints){
                defencePoints = 0;
                return damagePoints - defencePoints;
            }
        }
        if(isHeld = true){
            return defencePoints - damagePoints;
        }
       return damagePoints;
    }

    public void upgrade(){
        System.out.println("Shield is upgraded");
        this.defencePoints += 100;
    }

}
