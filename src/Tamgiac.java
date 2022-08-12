public class Tamgiac extends Shape{
    private double canh1 =1.0;
    private double canh2 =1.0;
    private double canh3 =1.0;

    public Tamgiac() {
    }

    public Tamgiac(String color, double canh1, double canh2, double canh3) {
        super(color);
        if(checkTamGiac(canh1,canh2,canh3)){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;}
    }
    public boolean checkTamGiac(double a,double b,double c){
        if(a+b>c&&a+c>b&&b+c>a){
            return true;
        }else {
            return false;
        }
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }
    public double getPerimeter(){
        return canh1+canh2+canh3;
    }
    public double getArea(){
        return Math.pow(getPerimeter()/2*(getPerimeter()/2-canh3)*(getPerimeter()/2-canh1)*(getPerimeter()/2-canh2),0.5);
    }
    @Override
    public String toString(){
        return "tam giac co mau "+getColor()+", dien tich la "+getArea()+", chu vi la "+getArea();
    }

}
