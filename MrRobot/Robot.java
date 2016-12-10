
package com.company;

public class Robot {

        private String NOM ;
        private int x;
        private int y;
        private String Directionn;

    /**
     * Constructeur par Defaut par Defaut
     */
    public Robot(){
        }

    /**
     * Constructeur avec Parametre
     * @param NOM
     * @param x
     * @param y
     * @param Directionn
     */
        public Robot(String NOM,int x,int y,String Directionn){
        this.NOM = NOM;
        this.x=x;
        this.y=y;
        this.Directionn=Directionn;
        }

    /**
     * Constructeur avec un seul parametre 
     * @param NOM
     */
    
    
    public Robot(String NOM){
        this.NOM = NOM;
        this.x=0;
        this.y=0;
        this.Directionn="Est";
        }
        public String getDirectionn(){
        return this.Directionn;
        }
        public void setDirectionn(String D){
        this.Directionn=D;
        }
        public int getx(){
        return this.x;
        }
        public void setx(int x){
        this.x=x;
        }
        public int gety(){
        return this.y;
        }
        public void sety(int y){
        this.y=y;
        }
        
        public void avance(){
        switch(Directionn){
            case "Est" :
               x++;
                break;
            case "Ouest" :
                x--;
                break;
            case "Nord" :
               y++;
                break;
            case "Sud" :
                y--;
                break;
        }
        }


        public void droite() {
            switch(Directionn){
            case "Est" :
               Directionn="Sud";
                break;
            case "Ouest" :
                Directionn="Nord";
                break;
            case "Nord" :
               Directionn="Est";
                break;
            case "Sud" :
                Directionn="Ouest";
                break;
        }
        }

    /**
     * Methode d'affichage de donnée d'un ROBOT
     */
    public void afficher() {
            System.out.println("Name : "+this.NOM+" "
                    + "Position : ("+this.x+","+this.y+")"
                    + "direction : "+this.Directionn);
        } 
        
        
}
