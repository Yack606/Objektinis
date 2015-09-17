import java.lang.Math;


public class Rectangle {
	double ilgis;
    double plotis;
    double x;
    double y;
    
    public Rectangle( double ilgis, double plotis, double x, double y){
        this.ilgis = ilgis;
        this.plotis = plotis;
        this.x = x;
        this.y = y;
    }
    
    public double getIlgis() {
        return ilgis;
    }
    
    public void setIlgis(double ilgis) {
        this.ilgis = ilgis;
    }
    
    public double getPlotis() {
        return plotis;
    }
    
    public void setPlotis(double plotis) {
        this.plotis = plotis;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double plotas(){
        return ilgis * plotis;
    }
    
    public double perimetras(){
        return 2 * (ilgis + plotis);
    }
    
    public double istrIlg(){
        return Math.sqrt(Math.pow(ilgis,2.0) + Math.pow(plotis,2.0));
    }
    
    public double istrX(){
        return ilgis / 2;
    }
    
    public double istrY(){
        return plotis / 2;
    }
  

}


public class Main {
	

	public static void main(String args[]) {

      Rectangle naujas = new Rectangle(3.0, 4.0, 1, 1);
        
      System.out.println("Staciakampio plotas: " + naujas.plotas());
      
      System.out.println("Staciakampio perimetras: " + naujas.perimetras());
      
      System.out.println("Staciakampio istrizaines ilgis: " + naujas.istrIlg());
      
      System.out.println("Staciakampio istrizaines ilgis: (" + naujas.istrX() + " , " + naujas.istrY()+")");
      
      
        
    }
}