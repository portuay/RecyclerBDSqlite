package com.chincha.mi.turismo.recyclerbdsqlite;

public class EmpresasCh {

    private String Nombre;
    private String Info;
    private int image;

    public EmpresasCh(String nombre, String info, int image) {
        Nombre = nombre;
        Info = info;
        this.image = image;
    }

    public EmpresasCh() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
