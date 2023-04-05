package bank;

import com.cgi.bank.Compte;
import com.cgi.bank.exception.DecouvertInterditException;
import com.cgi.bank.exception.ManqueRessourcesException;

public class CompteSimple extends Compte {

    private float decouvert;

    public CompteSimple(float solde, float decouvert) throws DecouvertInterditException {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float amount) throws DecouvertInterditException, ManqueRessourcesException {
        if(this.solde - amount < - this.decouvert)
            throw new ManqueRessourcesException();
        this.solde -= amount;
    }
}
