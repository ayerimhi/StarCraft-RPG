package juegorol.Terrans;
    
public class Cyclone extends Terran {
        public Cyclone(){
        this.size=(float) 1.5;
        this.cargo=3;
        this.armor=1;
        this.health=180;
        this.ataque=5;
        this.cooldown= 0;
        this.rango=4;
        this.vista=11;
         this.bonus=1.5;
   }
   public Cyclone(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
