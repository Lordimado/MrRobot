package com.company;


public class main {
    public static void main(String[] args) {
        Robot R[] = new Robot[4];
        R[0] = new Robot("IMED",1,2,"Est");
        R[1] = new RobotNG("MOHAMED",0,0,"Nord");
        R[2] = new Robot("Chawki");

        /**------------------------------Affichage des données d'un robot---------------------------------*/
        for(int i=0;i<=2;i++)
        R[i].afficher();
        }
        
    }
  

