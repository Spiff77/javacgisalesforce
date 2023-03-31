package com.cgi.model.zik;

import com.cgi.model.bank.Employee;

public class Album {

    private String titre;
    private int nbTrack;

    public Album(String titre, int nbTrack) {
        this.titre = titre;
        this.nbTrack = nbTrack;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbTrack() {
        return nbTrack;
    }

    public void setNbTrack(int nbTrack) {
        this.nbTrack = nbTrack;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Album{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", nbTrack=").append(nbTrack);
        sb.append('}');
        return sb.toString();
    }
}
