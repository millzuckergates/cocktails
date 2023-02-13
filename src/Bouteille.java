public class Bouteille{
    private Liquide liquide;
    private int quantite;
    private int contenance;

    public Bouteille(Liquide liquide, int quantite, int contenance){
        this.setLiquide = liquide;
        this.quantite = quantite = 100;
        this.contenance = contenance;
    }

    public void verser(int quantiteAVerser){
        if (quantiteAVerser > quantite){
            System.out.println("Il y en a trop, ça va déborder !");
        }else{
            contenance
        }
    }

    public String connaitreStatut(){

    }
    public Liquide getLiquide() {
        return liquide;
    }

    public void setLiquide(Liquide liquide) {
        this.liquide = liquide;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getContenance() {
        return contenance;
    }

    public void setContenance(int contenance) {
        this.contenance = contenance;
    }
}
