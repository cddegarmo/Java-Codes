import org.jetbrains.annotations.NotNull;

import java.util.*;
class Calculus {
    public String Derivative(@NotNull List<Float> coef, List<Float> ind){
        int i=0;
        StringBuilder s= new StringBuilder();
        List<String> comb=new ArrayList<>();
        List<Float> f1=new ArrayList<>();
        List<Float> f2=new ArrayList<>();
        while(i<coef.size()){
            f1.add(coef.get(i)*ind.get(i));
            f2.add(ind.get(i)-1);
            comb.add(Float.toString(f1.get(i))+'x'+'^'+ f2.get(i) +'+');
            i++;
        }
        String h;
        h=comb.get(comb.size()-1).substring(0,comb.get(comb.size()-1).length()-1);
        int j=0;
        while(j<comb.size()){
            s.append(comb.get(j));
            j++;
        }
        return s+h;
    }
}

class Input1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of terms in the polynomial:");
        int no=obj.nextInt();
        System.out.println("Enter the coefficients:");
        List<Float> coef=new ArrayList<>();
        List<Float> ind=new ArrayList<>();
        int i=0;
        while(i<no){
            coef.add(obj.nextFloat());
            i++;
        }
        System.out.println("Enter the indices for the corresponding coefficients:");
        int j=0;
        while(j<no){
            ind.add(obj.nextFloat());
            j++;
        }
        Calculus obj1=new Calculus();
        System.out.println(obj1.Derivative(coef,ind));
    }
}
