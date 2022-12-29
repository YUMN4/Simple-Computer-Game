import java.util.Arrays;

public class Main {

     public static void main(String[] args) {
         System.out.println("Total number of items before creating items: " + Item.getItemQuantity());

         Shield shield = new Shield(100, 50, 200);
         Axes axes = new Axes(50, 30, 20, 1);
         Dagger dagger = new Dagger(50, 20, 20);

         System.out.println("Total number of items after creating items: " + Item.getItemQuantity());

         System.out.println(shield.toString());
         System.out.println("\n" +dagger.toString());
         System.out.println("\n" +axes.toString());

         shield.getHit(50);
         shield.getDefencePoints();

         shield.upgrade();
         System.out.println("\n" +shield.toString());

         dagger.useItem();
         System.out.println("\n" +dagger.toString());

         axes.useItem();
         System.out.println("\n" +axes.toString()+ "\n");

         axes.upgrade();
         System.out.println("\n" +axes.toString());

         Axes b =  new Axes(50, 30, 20, 0);
         System.out.println(b.toString());

         b.upgrade();
         System.out.println("\n" + b.toString());

         b.upgrade();
         b.upgrade();
         b.upgrade();
         b.upgrade();
         b.upgrade();
         b.upgrade();

         System.out.println("\n" + b.toString());


          int[] s = axes.getSizeOfAxes();
          for(int i = 0; i < s.length; i++){
              System.out.println("Size of axe " + (i + 1) + " is " + s[i]);
          }

          int num = axes.getNumOfAxes();
          System.out.println("Number of axes: " + num);

          int[] a = b.getSizeOfAxes();
          for(int i = 0; i < a.length; i++){
              System.out.println("Size of axe " + (i + 1) + " is " + a[i]);
          }

          int numAxes = b.getNumOfAxes();
          System.out.println("Number of axes: " + numAxes);
     }
}
