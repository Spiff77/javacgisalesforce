package bank;

import com.cgi.bank.exception.DecouvertInterditException;
import com.cgi.bank.exception.ManqueRessourcesException;

public class Compte {
    protected float solde;

    public Compte(float solde) throws DecouvertInterditException {
        if(solde < 0)
            throw new DecouvertInterditException();
        this.solde = solde;
    }


    public void verser(float amount){
        this.solde += amount;
    }

    public void retirer(float amount) throws DecouvertInterditException, ManqueRessourcesException {
        if(this.solde - amount < 0)
            throw new DecouvertInterditException();
        this.solde-= amount;
    }

    public float getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
