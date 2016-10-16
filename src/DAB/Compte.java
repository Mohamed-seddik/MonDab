package DAB;

public class Compte
{
     String name;
     int numcompte;
     double solde;
     double interet;

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
}
