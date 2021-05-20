import java.util.*;
class Secant{
    public double func(List<Double> lst,double rate){
        int i=0;
        double sum=0;
        while(i<lst.size()){
            sum=sum+lst.get(i)/Math.pow(1+rate/100,i+1);
            i++;
        }
        return sum;
    }
}


public class IRR_Secant{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in); //Created Scanner Object
        System.out.println("Enter initial investment amount:");
        double inv=obj.nextDouble();
        List<Double> irr=new ArrayList<>();
        System.out.println("Enter the minimum  and maximum estimated Internal Rate of Return");
        int j=1;
        while(j<=2){
            irr.add(obj.nextDouble());
            j++;
        }
        List<Double> cf=new ArrayList<>();
        System.out.println("Enter the no of cash flows");
        int no=obj.nextInt();
        System.out.println("Enter cash flows:");
        int i=0;
        while(i<no){
            cf.add(obj.nextDouble());
            i++;
        }
        Secant obj1=new Secant();
        int k=0;
        while(k<100){
            double val=((irr.get(k)*(inv-obj1.func(cf,irr.get(k+1))))-(irr.get(k+1)*(inv-obj1.func(cf,irr.get(k)))))/((inv-obj1.func(cf,irr.get(k+1)))-(inv-obj1.func(cf,irr.get(k))));
            irr.add(val);

            if((Math.abs(inv-obj1.func(cf,irr.get(irr.size()-1))))<0.0005){
                System.out.println(irr.get(irr.size()-1));
                break;
            }
            k++;
        }
    }
}
