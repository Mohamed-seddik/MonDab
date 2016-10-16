package DAB;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)

    {

        Scanner read = new Scanner(System.in);

        //Compte client[] = new Compte[200];

        Compte client = new Compte();

            /* initialisation d'un seul compte */

        client.setName("mohamed");
        client.setNumcompte(19031994);
        client.setInteret(6);
        client.setSolde(260000.0);
        client.affiche();

        System.out.println("\tBienvenue à DAB\n");

        //System.out.println("Hi mr." + client.name);

        boolean exit=false;


            System.out.println("\t\tMENU");
            do {


                System.out.println("\ntaper :");
                System.out.println("1 : pour affiche votre solde");
                System.out.println("2 : pour affiche le taut d'intret de votre compte");
                System.out.println("3 : pour fair un retrait");
                System.out.println("4 : pour fair un depot");
                System.out.println("5 : pour quiter");


                int choix = read.nextInt();

                switch (choix) {
                    case 1:
                    {
                        System.out.println("\nvotre solde est de : " + client.solde + "DA sans intert");
                    }
                    break;

                        case 2:
                        {
                            System.out.println("\nle taut d'interet de votre compte est de : " + client.interet + "%");
                        }
                        break;

                            case 3:
                            {
                                System.out.println("\ntaper :");
                                System.out.println("1 pour un retrait de 1000 DA :");
                                System.out.println("2 pour un retrait de 3000 DA :");
                                System.out.println("3 pour un retrait de 5000 DA :");
                                System.out.println("4 pour un retrait de 8000 DA :");

                                int some = read.nextInt();

                                switch (some) {
                                    case 1:
                                    {
                                        client.modifer((-1000));
                                        System.out.println("\nvous avez fait un retrait de 1000 DA votre solde maintenant est de : " + client.solde+"DA sans intert");
                                    }
                                    break;
                                        case 2:
                                        {
                                            client.modifer((-3000));
                                            System.out.println("\nvous avez fait un retrait de 3000 DA votre solde maintenant est de : " + client.solde+"DA sans intert");
                                        }
                                        break;
                                            case 3:
                                            {
                                                client.modifer((-5000));
                                                System.out.println("\nvous avez fait un retrait de 5000 DA votre solde maintenant est de : " + client.solde+"DA sans intert");
                                            }
                                            break;
                                                case 4:
                                                {
                                                    client.modifer((-8000));
                                                    System.out.println("\nvous avez fait un retrait de 8000 DA votre solde maintenant est de : " + client.solde+"DA sans intert");
                                                }
                                                break;
                                }
                            }break;
                    case 4:
                    {
                        System.out.println("\nentre la somme que vous voulez ajouter a votre compte");

                        double ajout =read.nextDouble();

                        client.modifer(ajout);
                        System.out.println("\nvous avez fait un depot de "+ajout+" DA dans  votre compte.\nvotre solde maintenant est de : " + client.solde+"DA sans intert");
                    }
                    break;
                                case 5:
                                {
                                    System.out.print("\nby mr." + client.name);
                                    exit = true;
                                }break;

                                }
                }while (!exit);


            }

        }


