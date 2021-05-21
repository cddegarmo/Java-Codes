package src;

import java.util.*;

public class IRRSecant {
   private static double investment;

   private static class Secant {
      private double func(List<Double> list, double rate) {
         int i = 0;
         double sum = 0;
         while (i < list.size()) {
            sum = sum + list.get(i)
                 / Math.pow(1 + rate / 100, i + 1);
            i++;
         }
         return sum;
      }
   }

   private static Secant sec = new Secant();

   private IRRSecant() {}

   private static List<Double> getIRR() {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter initial investment amount: ");
      investment = s.nextDouble();
      List<Double> irr = new ArrayList<>();
      System.out.println("Enter the minimum and maximum estimated " +
           "Internal Rate of Return: ");
      int i = 1;
      while (i <= 2) {
         irr.add(s.nextDouble());
         i++;
      }
      return irr;
   }

   private static List<Double> getCashFlows() {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter number of cash flows: ");
      int no = s.nextInt();
      List<Double> cf = new ArrayList<>();
      System.out.println("Enter cash flows: ");
      int i = 0;
      while (i < no) {
         cf.add(s.nextDouble());
         i++;
      }
      return cf;
   }

   private static void calculate() {
      List<Double> irr = getIRR();
      List<Double> cf = getCashFlows();
      int i = 0;
      while (i < 100) {
         double val = ((irr.get(i) * (investment - sec.func(cf, irr.get(i + 1)))) -
              (irr.get(i + 1) * (investment - sec.func(cf, irr.get(i))))) /
              ((investment - sec.func(cf, irr.get(i + 1))) - (investment - sec.func(cf, irr.get(i))));
         irr.add(val);

         if ((Math.abs(investment - sec.func(cf, irr.get(irr.size() - 1)))) < 0.0005) {
            System.out.println(irr.get(irr.size() - 1));
            break;
         }
         i++;
      }
   }

   public static void main(String[] args) {
      calculate();
   }
}
