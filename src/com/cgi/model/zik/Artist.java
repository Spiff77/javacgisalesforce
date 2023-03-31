package com.cgi.model.zik;

import java.util.Arrays;

public class Artist {

    private String firstName;
    private String lastName;
    private String stageName;
    private Manager manager;
    private Album albums[] = new Album[10];

    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stageName = this.firstName + " " + this.lastName;
    }

    public void add(Album album){
        for (int i = 0; i < albums.length; i++) {
            if(albums[i] == null){
                albums[i] = album;
                break;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", stageName='").append(stageName).append('\'');
        sb.append(", manager=").append(manager);
        sb.append(", albums=").append(Arrays.toString(albums));
        sb.append('}');
        return sb.toString();
    }
}
