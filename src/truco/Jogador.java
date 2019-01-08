package truco;

import java.util.ArrayList;

public class Jogador {

    public String nome;
    Carta c =new Carta ();
    ArrayList<Carta> mao = new ArrayList<> ();
    Jogo j = new Jogo();
    public Jogador (int numero, String nome){
  
        this.nome = nome;
    }
    public void setmao(){
        j.setArray();
        for(int i=0;i<3;i++){
            mao.add(j.baralho.get(i));
        }
       
    }
   
    public Carta getjogada(int n){

        return mao.get(n);
    }
    public void drop(int n){
        
        this.mao.remove(n);
    }
}
