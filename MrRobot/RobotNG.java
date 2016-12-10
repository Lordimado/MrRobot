
package com.company;


public class RobotNG extends Robot{

    private boolean turbo=false;


    public RobotNG(String NOM,int x,int y,String Dirc){
    super(NOM,x,y,Dirc);
    }


    public void turboStatus(boolean t)
    {
    turbo=t;
    }


    public void avance(int p){
        if(turbo==true)
            p=p*3;
        switch(getDirectionn()){
            case "Est" :
               setx(getx()+p);
                break;
            case "Ouest" :
                setx(getx()-p);
                break;
            case "Nord" :
               sety(gety()+p);
                break;
            case "Sud" :
                sety(gety()-p);
                break;
        }
    }
        public void gauche(){
            switch(getDirectionn()){
            case "Est" :
               setDirectionn("Nord");
                break;
            case "Ouest" :
                setDirectionn("Sud");;
                break;
            case "Nord" :
               setDirectionn("Ouest");
                break;
            case "Sud" :
                setDirectionn("Est");;
                break;
        }
        
    }
        public void demiTour(){
        switch(getDirectionn()){
            case "Est" :
               setDirectionn("Ouest");
                break;
            case "Ouest" :
                setDirectionn("Est");;
                break;
            case "Nord" :
               setDirectionn("Sud");
                break;
            case "Sud" :
                setDirectionn("Nord");;
                break;
        }
    }

        @Override
        public void afficher(){
        super.afficher();
        if(turbo==true)
                System.out.println("turbo activer");
        else
                System.out.println("turbo disactiver");
        }
        
        
}
    

