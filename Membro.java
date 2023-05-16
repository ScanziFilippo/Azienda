public class Membro {
    String codice;
    String nome;
    String cognome;
    Ruolo ruolo;
    Date annoAssunzione;

    public Membro(Ruolo ruolo){
        this.ruolo = ruolo; 
    }
}