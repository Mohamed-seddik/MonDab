package DAB;

public class Compte
{
     String name;  
     int numcompte;
     double solde;
     double interet;

     /* 
     Attention aux droits d'accès !!!
     
     private    int numcompte;
    private  double solde;
     ....
     */
     
     
    public void setName(String name)
    {
        this.name=name;
    }

        public String getname()
        {
            return name;
        }

    public void setNumcompte(int num)
    {
        this.numcompte=num;
    }

        public int getNumcompte()
        {
            return numcompte;
        }

    public void setSolde(double argent)
    {
        this.solde=argent;
    }

        public double getSolde()
        {
            return solde;
        }

    public void setInteret(double taut)
    {
        this.interet=taut;
    }

        public double getInteret()
        {
            return interet;
        }



    public void affiche()
    {
        System.out.println("Le compte "+numcompte+" son taux d'intert est "+interet+"%");
    }

    public double calcule(double soldde)
    {
        return solde = solde - (solde * interet * 0.01) ;
    }

    public double modifer(double change)
    {
        return solde = solde + change  ;
    }
     
     
     /*
     Dans un code il faut bien choisir les noms de tes méthodes/variables 
     
     exemples
     ========
     public void infoCompte() {
        System.out.println("Compte n°" + ID + " solde=" + solde + " DA");
    }

    public double calcul_interet() {
        solde = solde - solde * taux / 100;
        return solde;
    }

    public void depot(double s) {
        solde = solde + s;
    }

    public void retrait(double s) {
        solde = solde - s;
    }
     
     
     
     */
}
