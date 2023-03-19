package eu.epfc.c5900.lesson5;
public class App {
    public static void main(String[] args) {
        Seller isabelleSeller = new Seller();
        isabelleSeller.firstName = "Isabelle";

        Seller sylvain = new Seller();
        sylvain.firstName = "Sylvain";

        Article robe = new Article();
        robe.name = "robe";

        Article casserole = new Article();
        casserole.name = "casserole";

        Article plat = new Article();
        plat.name = "plat";

        Buyer jonathan = new Buyer();
        jonathan.firstName = "Jonathan";

        Buyer isabelleBuyer = new Buyer();
        isabelleBuyer.firstName = "Isabelle";

        isabelleSeller.articles.add(robe);
        robe.seller = isabelleSeller;

        jonathan.articles.add(robe);
        robe.buyer = jonathan;

        sylvain.articles.add(casserole);
        casserole.seller = sylvain;

        sylvain.articles.add(plat);
        plat.seller = sylvain;

        isabelleBuyer.articles.add(casserole);
        casserole.buyer = isabelleBuyer;

        // affiche tous les articles mis en vente pas Sylvain
        for(Article a : sylvain.articles) {
            System.out.println(a.name);
        }
    }
}
