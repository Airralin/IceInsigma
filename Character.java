import javax.swing.ImageIcon;
import java.util.ArrayList;
public class Character
{
   private int WEAPON;
   private int HP; 
   private int ATTACK;
   private int DEFENCE;
   private int RESISTANCE;
   private int SPEED;
   private boolean WEAKARROWS;
   private ImageIcon ART; 
   private int ROW;
   private int COL;
   public Character(int w,int h,int att, int d, int res, int s, boolean wa,ImageIcon art,int row, int c)
   {
        WEAPON=w;
        HP=h;
        ATTACK=att;
        DEFENCE=d;
        RESISTANCE=res;
        SPEED=s;
        WEAKARROWS=wa;
        ART=art;
        ROW=row;
        COL=c;
   }
   
   public void characters()
   {
       
   }
   public int getWeapon()
   {
       return WEAPON;
   }
   public int getHp()
   {
       return HP;
   }
   public int getAttack()
   {
       return ATTACK;
   }
   public int getDefence()
   {
       return DEFENCE;
   }
   public int getResistance()
   {
       return RESISTANCE;
   }
   public int getSpeed()
   {
       return SPEED;
   }
   public boolean getBow()
   {
       return WEAKARROWS;
   }
   public ImageIcon getPic()
   {
       return ART;
   }
   public int getRow()
   {
       return ROW;
   }
   public int getCol()
   {
       return COL;
   }
}
