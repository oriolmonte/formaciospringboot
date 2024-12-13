package com.example.curs.curspackage;

public class Cotxe {
    private int cilindrada;
    private String marca;

    public Cotxe(int cilindrada, String marca) {
        this.cilindrada = cilindrada;
        this.marca = marca;
        System.out.println("he creat un " + marca);
    }
    public Cotxe()
    {
        System.err.println("He creat un cotxe");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    static 
    {
        System.out.println("Només quan em carrego!");
    }

}
