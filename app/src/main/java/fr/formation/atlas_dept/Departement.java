package fr.formation.atlas_dept;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Departement {
    String noDept,nom,nomStd,dateCreation,chefLieu,urlWiki;
    int noRegion,surface;

    private SQLiteDatabase db;

    public Departement(Context c) {
        DbGeo dbGeo = new DbGeo(c);
        db = dbGeo.getWritableDatabase();

    }

    public Departement(Context c, String no){
    this.noDept = no;
    }
    public void select(String no) throws Exception{


    }

    public void delete()throws Exception{

    }

    public String getNoDept() {
        return noDept;
    }

    public void setNoDept(String noDept) {
        this.noDept = noDept;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomStd() {
        return nomStd;
    }

    public void setNomStd(String nomStd) {
        this.nomStd = nomStd;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getChefLieu() {
        return chefLieu;
    }

    public void setChefLieu(String chefLieu) {
        this.chefLieu = chefLieu;
    }

    public String getUrlWiki() {
        return urlWiki;
    }

    public void setUrlWiki(String urlWiki) {
        this.urlWiki = urlWiki;
    }

    public int getNoRegion() {
        return noRegion;
    }

    public void setNoRegion(int noRegion) {
        this.noRegion = noRegion;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public void setDb(SQLiteDatabase db) {
        this.db = db;
    }
}
