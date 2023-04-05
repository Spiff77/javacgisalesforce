package bank;

import com.cgi.bank.Compte;
import com.cgi.bank.CompteEpargne;
import com.cgi.bank.exception.MultipleCompteEpargneException;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;

    private List<Compte> comptes = new ArrayList<>();

    public void add(Compte compte) throws MultipleCompteEpargneException {
        if(compte instanceof CompteEpargne){
            if(comptes.stream().anyMatch( c -> c instanceof CompteEpargne))
                throw new MultipleCompteEpargneException();
        }
        this.comptes.add(compte);
    }

    public float calculsTotalAvoirs(){
        return (float) comptes.stream().mapToDouble(c -> c.solde).sum();
    }

    public Client(String firstName) {
        this.firstName = firstName;
    }
}
