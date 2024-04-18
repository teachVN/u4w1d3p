package Esercizio3;

public class Carrello {
    private Cliente cliente;

    private Articolo[] articoli;

    private double costoTotaleArticoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public double getCostoTotaleArticoli() {
        costoTotaleArticoli=calcolaCostoTotale();
        return costoTotaleArticoli;
    }

    private double calcolaCostoTotale(){
        double somma=0;

        for(int i=0; i< articoli.length; i++){
            double prezzo = articoli[i].getPrezzo();
            somma = somma + prezzo;
        }

        return somma;
    }
}
