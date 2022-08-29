package model;

public class Carro {
    private String placa;
    private int numChassi;

    void acelerar(){

    }

    boolean frear(){
        return false;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        if(placa.length() == 7 && placa.matches("[A-Z]{3}\\d{4}")){
        this.placa = placa;
        }else{
            this.placa = "ERRO!!!";
        }
    }
}
