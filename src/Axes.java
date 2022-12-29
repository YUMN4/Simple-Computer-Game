public class Axes extends Weapon implements Upgradable {

    private int numOfAxes;
    public int sizeOfAxes[] = new int[2];

    Axes(double price, double weight, double damage, int numOfAxes){
        super(price, weight, damage);
        if(numOfAxes < 0){ numOfAxes = 0; }
        this.numOfAxes = numOfAxes;
        if(numOfAxes == 0){
            sizeOfAxes[0] = 0;
        }
        if(numOfAxes == 1){
            sizeOfAxes[0] = 1;
        }
        if(numOfAxes == 2){
            sizeOfAxes[0] = 1;
            sizeOfAxes[1] = 1;
        }
    }

    public int getNumOfAxes(){
        return this.numOfAxes;
    }
    public int[] getSizeOfAxes(){
        return sizeOfAxes;
    }

    public int calcDamagePoints(){
        int totalDamage = 0;
        double x;
        for(int a = 0; a < sizeOfAxes.length; a++){
            x = sizeOfAxes[a] * getDamageAmount();
            totalDamage += x;
        }
        return totalDamage;
    }

    public boolean useItem(){
        if(getNumOfAxes() == 0){
            return false;
        }
        System.out.println("The Axes are used and caused damage of " + calcDamagePoints() + " points.");
        return true;
    }

    public void upgrade(){
        System.out.println("Axes is upgraded");
        if(numOfAxes == 0){
            numOfAxes++;
        }

        else if(numOfAxes == 1 && sizeOfAxes[0] <= 5){
            sizeOfAxes[0] += 1;
            sizeOfAxes[1] = 0;
        }

        else if(numOfAxes == 1 && sizeOfAxes[0] > 5){
            sizeOfAxes[1] = 1;
            numOfAxes++;
        }

        else{
            sizeOfAxes[1] += 1;
        }

        //if(numOfAxes == 1){
            //if (sizeOfAxes[0] <= 5) {
            //sizeOfAxes[0] += 1;
            //sizeOfAxes[1] = 0;
        //}
        //else if(sizeOfAxes[0] > 5){
            //numOfAxes++;
            //sizeOfAxes[1] = 1;
        //}
        //}
        //else if(numOfAxes == 2){
            //sizeOfAxes[1] = 1;
        //}
    }

    @Override
    public String toString(){
        String axesInfo = "Weapon type: Axes" + "\nNumber of axes: " + this.numOfAxes
                + "\n" + super.toString() + "\nTotal damage per hit: " + calcDamagePoints();
        return axesInfo;
    }


}
