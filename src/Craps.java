import java.net.URL;
import javax.swing.ImageIcon;

public class Craps{
    private Dice d1, d2;
    private int rollnumber, point;
    
    Craps(){
        d1 = new Dice();
        d2 = new Dice();
        rollnumber = 0;
        point=0;}
    
    public ImageIcon getDiePic(int x){
        if(x==1)
            return d1.getPic();
        else
            return d2.getPic();}
    
    public void roll(){
        rollnumber++;
        d1.roll();
        d2.roll();
        if(rollnumber== 1) point=getTotal();}
    
    public boolean hasWon(){
        
	if(rollnumber==1){
            return (getTotal()==7 || getTotal()==11);}
        
	else{
            return (point == getTotal());}
    }
    
    public boolean hasLost()
    {
        if(rollnumber==1){
            return (getTotal()==2||getTotal()==3||getTotal()==10);
        }
        else{
            return (getTotal()==7);
        } 
    }
    
    public int getTotal(){
        return d1.getValue() + d2.getValue();}
    
    public int getPoint(){
        return point;}
}