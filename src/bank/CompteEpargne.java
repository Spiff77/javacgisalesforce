package bank;

import com.cgi.bank.Compte;
import com.cgi.bank.exception.DecouvertInterditException;

public class CompteEpargne extends Compte {

    private float taux;

    public CompteEpargne(float solde, float taux) throws DecouvertInterditException {
        super(solde);
        this.taux = taux;
    }

    public float calculInterets(){
        return this.solde * taux;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}
