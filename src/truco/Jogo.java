package truco;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Jogo {
    Scanner ler = new Scanner(System.in);
    Scanner lern = new Scanner(System.in);
    private int t1=0,t2=0, winner=0,i=0;//time 1 ou dois
    private int nrodada=0;
    String nome;
    int a;
    boolean cangou=false,truco=false,truco6=false,truco9=false,truco12=false;
    Carta p = new Carta();
    Carta[] cartinhas= new Carta[4];
    
    
    ArrayList<Jogador> jogador = new ArrayList<> ();
    ArrayList<Carta> baralho = new ArrayList<> ();
    public void setArray(){
        Carta zap = new Carta();
        Carta so = new Carta();
        Carta sc = new Carta();
        Carta e = new Carta();
        Carta c1 = new Carta();
        Carta c2 = new Carta();
        Carta c3 = new Carta();
        Carta c4 = new Carta();
        Carta c5= new Carta();
        Carta c6 = new Carta();
        Carta c7 = new Carta();
        Carta c8 = new Carta();
        Carta c9 = new Carta();
        Carta c10 = new Carta();
        Carta c11 = new Carta();
        Carta c12= new Carta();
        Carta c13 = new Carta();
        Carta c14 = new Carta();
        Carta c15= new Carta();
        Carta c16 = new Carta();
        Carta c17 = new Carta();
        Carta c18 = new Carta();
        Carta c19 = new Carta();
        Carta c20 = new Carta();
        Carta c21 = new Carta();
        Carta c22 = new Carta();
        Carta c23= new Carta();
        Carta c24= new Carta();
        Carta c25 = new Carta();
        Carta c26 = new Carta();
        Carta c27 = new Carta();
        Carta c28= new Carta();
        Carta c29 = new Carta();
        Carta c30 = new Carta();
        Carta c31 = new Carta();
        Carta c32 = new Carta();
        Carta c33= new Carta();
        Carta c34 = new Carta();
        Carta c35 = new Carta();
        Carta c36 = new Carta();
        Carta c37 = new Carta();
        zap.setCarta(1, "4♣");
        baralho.add(0,zap);
        sc.setCarta(2, "7♥");
        baralho.add(1,sc);
        e.setCarta(3, "A♠");
        baralho.add(2,e);
        so.setCarta(4, "7♦");
        baralho.add(3,so);
        c1.setCarta(5, "3♦");
        baralho.add(4,c1);
        c2.setCarta(5, "3♥");
        baralho.add(5,c2);
        c3.setCarta(5, "3♣");
        baralho.add(6,c3);
        c4.setCarta(5, "3♠");
        baralho.add(7,c4);
        c5.setCarta(6, "2♠");
        baralho.add(8,c5);
        c6.setCarta(6, "2♥");
        baralho.add(9,c6);
        c7.setCarta(6, "2♣");
        baralho.add(10,c7);
        c8.setCarta(6, "2♦");
        baralho.add(11,c8);
        c9.setCarta(7, "A♥");
        baralho.add(12,c9);
        c10.setCarta(7, "A♦");
        baralho.add(13,c10);
        c11.setCarta(7, "A♣");
        baralho.add(14,c11);
        c12.setCarta(8, "K♣");
        baralho.add(15,c12);
        c13.setCarta(8, "K♥");
        baralho.add(16,c13);
        c14.setCarta(8, "K♦");
        baralho.add(17,c14);
        c15.setCarta(8, "K♠");
        baralho.add(18,c15);
        c16.setCarta(9, "Q♠");
        baralho.add(19,c16);
        c17.setCarta(9, "Q♥");
        baralho.add(20,c17);
        c18.setCarta(9, "Q♦");
        baralho.add(21,c18);
        c19.setCarta(9, "Q♣");
        baralho.add(22,c19);
        c20.setCarta(10, "J♠");
        baralho.add(23,c20);
        c21.setCarta(10, "J♦");
        baralho.add(24,c21);
        c22.setCarta(10, "J♣");
        baralho.add(25,c22);
        c23.setCarta(10, "J♥");
        baralho.add(26,c23);
        c24.setCarta(11, "7♣");
        baralho.add(27,c4);
        c25.setCarta(11, "7♠");
        baralho.add(28,c25);
        c26.setCarta(12, "6♥");
        baralho.add(29,c26);
        c27.setCarta(12, "6♦");
        baralho.add(30,c27);
        c28.setCarta(12, "6♣");
        baralho.add(31,c28);
        c29.setCarta(12, "6♠");
        baralho.add(32,c29);
        c30.setCarta(13, "5♠");
        baralho.add(33,c30);
        c31.setCarta(13, "5♥");
        baralho.add(34,c31);
        c32.setCarta(13, "5♣");
        baralho.add(35,c32);
        c33.setCarta(13, "5♥");
        baralho.add(36,c33);
        c34.setCarta(14, "4♥");
        baralho.add(37,c34);
        c35.setCarta(14, "4♠");
        baralho.add(38,c35);
        c36.setCarta(14, "4♦");
        baralho.add(39,c36);
        Collections.shuffle(baralho);
    }
    
    public void inicio(int num){
        if(num==2){
            System.out.println("Entre com o nome do Jogador 1");
            nome = ler.nextLine();
            Jogador j1 = new Jogador(0,nome);
            System.out.println("Entre com o nome do Jogador 2");
            nome = ler.nextLine();
            Jogador j2 = new Jogador(1,nome);
            jogador.add(j1);
            jogador.add(j2);
        }
        if(num==4){
            System.out.println("Entre com o nome do Jogador 1");
            nome = ler.nextLine();
            Jogador j1 = new Jogador(0,nome);
            System.out.println("Entre com o nome do Jogador 2");
            nome = ler.nextLine();
            Jogador j2 = new Jogador(1,nome);
            System.out.println("Entre com o nome do Jogador 3");
            nome = ler.nextLine();
            Jogador j3 = new Jogador(2,nome);
            System.out.println("Entre com o nome do Jogador 4");
            nome = ler.nextLine();
            Jogador j4 = new Jogador(3,nome);
            jogador.add(0,j1);
            jogador.add(1,j2);
            jogador.add(2,j3);
            jogador.add(3,j4);
        }
        
       a=-1;
        while(t1<12&&t2<12){
            a++;
            if(a==num) a=0;
            rodada(num,a);
        }
    }
    
    
    public void rodada(int numero_de_jogadores, int quem_comeca){
        for (int j = 0; j < numero_de_jogadores; j++) {
            jogador.get(j).setmao();  
        }
        nrodada=0;
        if(quem_comeca==numero_de_jogadores ){
            quem_comeca=0;
        }
        int parcial1=0,parcial2=0,resposta;
        while(parcial1<2&&parcial2<2){
            i=quem_comeca;
            
            cartinhas[0]=null;
            cartinhas[1]=null;
            cartinhas[2]=null;
            cartinhas[3]=null;
            nrodada ++;
            int cont=0;
            while (i<numero_de_jogadores){  
                if(nrodada!=1&&cont==0){
                    System.out.println("i = winner");
                    i=winner;
                }
                if(nrodada==1){
                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                    System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                    System.out.println("3- Jogar "+jogador.get(i).mao.get(2).c);
                    System.out.println("4- Pedir Truco");
                    resposta=lern.nextInt();
                }else if(nrodada==2){
                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                    System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                    System.out.println("4- Pedir Truco");
                    resposta=lern.nextInt();
                }else{
                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                    System.out.println("4- Pedir Truco");
                    resposta=lern.nextInt();
                }
                
                switch(resposta){
                    case 1:
                        p=jogador.get(i).getjogada(0);                
                        cartinhas[i]=p;
                        jogador.get(i).drop(0);
                        break;
                    case 2:
                        p=jogador.get(i).getjogada(1);
                        cartinhas[i]=p;
                        jogador.get(i).drop(1);
                        break;
                    case 3:
                        p=jogador.get(i).getjogada(1);
                        cartinhas[i]=p;
                        jogador.get(i).drop(2);
                        break;
                    case 4:
                       if(nrodada==1){
                           i++;
                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                           System.out.println("1- aceitar");
                           System.out.println("2- Correr");
                           System.out.println("3- pedir 6");
                           int tresposta=lern.nextInt();
                           switch(tresposta){
                               case 1:
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                   System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                   System.out.println("3- Jogar "+jogador.get(i).mao.get(2).c);
                                   tresposta=lern.nextInt();
                                   truco=true;
                                   switch(tresposta){
                                   case 1:
                                        p=jogador.get(i).getjogada(0);                
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(0);
                                        break;
                                    case 2:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(1);
                                        break;
                                    case 3:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(2);
                                        break;
                                   }
                                   break;
                               case 2:
                                   i--;
                                   if(i%2==0){
                                       t1+=2;
                                   }else{
                                       t2+=2;
                                   }
                                   i=4;
                                   break;
                               case 3:
  
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- aceitar");
                                   System.out.println("2- Correr");
                                   System.out.println("3- pedir 9");
                                   int tr=lern.nextInt();
                                   switch(tr){
                                       case 1:
                                           i++;
                                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                           System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                           System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                           System.out.println("3- Jogar "+jogador.get(i).mao.get(2).c);
                                           int trresposta=lern.nextInt();
                                           truco6=true;
                                           break;
                                       case 2:
                                           i--;
                                            if(i%2==0){
                                                t1+=4;
                                            }else{
                                                t2+=4;
                                            }
                                       case 3:
                                           i--;
                                            System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                            System.out.println("1- aceitar");
                                            System.out.println("2- Correr");
                                            int tru=lern.nextInt();
                                           switch(tru){
                                               case 1:
                                                   i++;
                                                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                                    System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                                    System.out.println("3- Jogar "+jogador.get(i).mao.get(2).c);
                                                    int truresposta=lern.nextInt();
                                                    truco9=true;
                                                    break;
                                               case 2:
                                                   i--;
                                                    if(i%2==0){
                                                        t1+=8;
                                                    }else{
                                                        t2+=8;
                                                    }
                                               break;
                                           }
                                   }
                                   break;
                                   
                                   
                           }
                       }if(nrodada==2){
                           i++;
                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                           System.out.println("1- aceitar");
                           System.out.println("2- Correr");
                           System.out.println("3- pedir 6");
                           int tresposta=lern.nextInt();
                           switch(tresposta){
                               case 1:
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                   System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                   
                                   tresposta=lern.nextInt();
                                   truco=true;
                                   switch(tresposta){
                                   case 1:
                                        p=jogador.get(i).getjogada(0);                
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(0);
                                        break;
                                    case 2:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(1);
                                        break;
                                    case 3:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(2);
                                        break;
                                   }
                                   break;
                               case 2:
                                   i--;
                                   if(i%2==0){
                                       t1+=2;
                                   }else{
                                       t2+=2;
                                   }
                                   i=4;
                                   break;
                               case 3:
  
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- aceitar");
                                   System.out.println("2- Correr");
                                   System.out.println("3- pedir 9");
                                   int tr=lern.nextInt();
                                   switch(tr){
                                       case 1:
                                           i++;
                                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                           System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                           System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                           
                                           int trresposta=lern.nextInt();
                                           truco6=true;
                                           break;
                                       case 2:
                                           i--;
                                            if(i%2==0){
                                                t1+=4;
                                            }else{
                                                t2+=4;
                                            }
                                       case 3:
                                           i--;
                                            System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                            System.out.println("1- aceitar");
                                            System.out.println("2- Correr");
                                            int tru=lern.nextInt();
                                           switch(tru){
                                               case 1:
                                                   i++;
                                                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                                    System.out.println("2- Jogar "+jogador.get(i).mao.get(1).c);
                                                    
                                                    int truresposta=lern.nextInt();
                                                    truco9=true;
                                                    break;
                                               case 2:
                                                   i--;
                                                    if(i%2==0){
                                                        t1+=8;
                                                    }else{
                                                        t2+=8;
                                                    }
                                               break;
                                           }
                                   }
                                   break;
                                   
                                   
                           }
                       }if(nrodada==3){
                           i++;
                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                           System.out.println("1- aceitar");
                           System.out.println("2- Correr");
                           System.out.println("3- pedir 6");
                           int tresposta=lern.nextInt();
                           switch(tresposta){
                               case 1:
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                   
                                   
                                   tresposta=lern.nextInt();
                                   truco=true;
                                   switch(tresposta){
                                   case 1:
                                        p=jogador.get(i).getjogada(0);                
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(0);
                                        break;
                                    case 2:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(1);
                                        break;
                                    case 3:
                                        p=jogador.get(i).getjogada(1);
                                        cartinhas[i]=p;
                                        jogador.get(i).drop(2);
                                        break;
                                   }
                                   break;
                               case 2:
                                   i--;
                                   if(i%2==0){
                                       t1+=2;
                                   }else{
                                       t2+=2;
                                   }
                                   i=4;
                                   break;
                               case 3:
  
                                   i--;
                                   System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                   System.out.println("1- aceitar");
                                   System.out.println("2- Correr");
                                   System.out.println("3- pedir 9");
                                   int tr=lern.nextInt();
                                   switch(tr){
                                       case 1:
                                           i++;
                                           System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                           System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);                                         
                                           int trresposta=lern.nextInt();
                                           truco6=true;
                                           break;
                                       case 2:
                                           i--;
                                            if(i%2==0){
                                                t1+=4;
                                            }else{
                                                t2+=4;
                                            }
                                       case 3:
                                           i--;
                                            System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                            System.out.println("1- aceitar");
                                            System.out.println("2- Correr");
                                            int tru=lern.nextInt();
                                           switch(tru){
                                               case 1:
                                                   i++;
                                                    System.out.println(jogador.get(i).nome+", O que deseja fazer?");
                                                    System.out.println("1- Jogar "+jogador.get(i).mao.get(0).c);
                                                                                                       
                                                    int truresposta=lern.nextInt();
                                                    truco9=true;
                                                    break;
                                               case 2:
                                                   i--;
                                                    if(i%2==0){
                                                        t1+=8;
                                                    }else{
                                                        t2+=8;
                                                    }
                                               break;
                                           }
                                   }
                                   break;
                                   
                                   
                           }
                       }
                       
                       break;
                }
                cont++;
                i++;
                
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if(i==numero_de_jogadores&&cont<numero_de_jogadores){
                    i=0;
                }
                if(cont==numero_de_jogadores){
                    i=4;
                }
            }if(cangou==true){
                int min=100,pos=-1;
                cangou=false;
                for(int i=0;i<numero_de_jogadores;i++){
                    if(cartinhas[i].valor<min){
                        min=cartinhas[i].valor;
                        pos=i;
                    }
                }
                for(int i=0;i<numero_de_jogadores;i++){
                    for(int j=0;j<numero_de_jogadores;j++){
                        if(cartinhas[i].valor==cartinhas[j].valor&&!cartinhas[j].c.equals(cartinhas[i].c)){
                            cangou=true;
                        }
                    }
                }
                if(cangou==false){
                    if(pos%2!=0){
                        t2+=2;
                        rodada(numero_de_jogadores,quem_comeca+1);
                        a++;
                    }else{
                        t1+=2;
                        rodada(numero_de_jogadores,quem_comeca+1);
                        a++;
                    }
                }
            }
            winner= compara(cartinhas,numero_de_jogadores);
                if(winner%2!=0&&cangou==false) {
                    parcial2++;
                    System.out.println("TIME 2 VENCEU A RODADA");
               }
                else if(winner%2==0&&cangou==false){
                    parcial1++;
                    System.out.println("TIME 1 VENCEU A RODADA");
                }else{
                    System.out.println("GANGOU!\nMostre sua maior carta");
                }
                
                i=0;
            
        }
        if(parcial1==2){
            System.out.println("Time 1 venceu a queda ");
            t1+=2;
            if(truco==true){
                t1+=2;
                truco=false;
                if(truco6==true){
                    t1+=4;
                    truco6=false;
                }if(truco9==true){
                    t1+=4;
                    truco9=false;
                }
            }
        }
        else{
            System.out.println("Time dois venceu a queda ");
            t2+=2;
            if(truco==true){
                t2+=2;
                truco=false;
                if(truco6==true){
                    t2+=4;
                    truco6=false;
                }if(truco9==true){
                    t2+=4;
                    truco9=false;
                }
            }
        }
        System.out.println("\n\nPLACAR:\nTime 1: "+t1+"\nTime 2: "+t2);
         quem_comeca++;
    }
    public int compara(Carta[] cartinhas,int num){
        int min=100,pos=-1;
        cangou=false;
        for(int i=0;i<num;i++){
            if(cartinhas[i].valor<min){
                min=cartinhas[i].valor;
                pos=i;
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(cartinhas[i].valor==cartinhas[j].valor&&!cartinhas[j].c.equals(cartinhas[i].c)){
                    cangou=true;
                }
            }
            }
        
        return pos;
    }
        
}


