//Java Code for Linear Regression
public class Statistics{
    public double mean(List<Double> lst1){
        int i=0;
        double sum=0;
        while(i<lst1.size()){
            sum=sum+lst1.get(i);
            i++ ;
        }
        return sum/lst1.size();

    }
    public double pstd(List<Double> lst1){
        int i=0;
        double sum=0;
        Statistics m=new Statistics();
        double std=0;
        while(i<lst1.size()){
            std=std+Math.pow((lst1.get(i)-m.mean(lst1)),2);
            i++;
        }
        return Math.sqrt(std/lst1.size());
    }
}

class Regression{
    public static void main(String[] args){
        Scanner no=new Scanner(System.in);
        System.out.println("Enter number of pairs of values:");
        int num=no.nextInt();
        int i=0;
        List<Double> x_val=new ArrayList<>();
        List<Double> y_val=new ArrayList<>();
        Scanner inp1=new Scanner(System.in);
        Scanner inp2=new Scanner(System.in);
        System.out.println("Enter x values:");
        while(i<num){
            x_val.add(i,inp1.nextDouble());
            i++;
        }
        System.out.println("Enter y values");
        int j=0;
        List<Double> prod=new ArrayList<>();
        double sum=0;
        while(j<num){
            y_val.add(j,inp2.nextDouble());
            prod.add(j,y_val.get(j)*x_val.get(j));
            sum=sum+prod.get(j);
            j++;
        }
        Statistics obj= new Statistics();
        double mean_x=obj.mean(x_val);
        double mean_y=obj.mean(y_val);
        double std_x=obj.pstd(x_val);
        double std_y=obj.pstd(y_val);
        double Covariance=Math.round((sum/x_val.size())-(mean_x*mean_y));
        double r=Math.round(Covariance/(std_x*std_y));
        double byx=Math.round(Covariance/(Math.pow(std_x,2)));
        double intercept=Math.round((mean_y-(byx*mean_x)));
        System.out.println("Covariance:"+Covariance);
        System.out.println("Correlation coefficient"+r);
        System.out.println("Slope:"+byx);
        System.out.println("Regression equation is"+byx+"x"+"+"+intercept);

    }
}
