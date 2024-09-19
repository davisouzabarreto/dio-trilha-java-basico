public class SmartTv {

boolean ligada = true;
int canal = 1;
int volume = 25;

public void mudarCanal(int novoCanal){
    canal = novoCanal;
}
public void aumentarCanal(){
    canal++;
}
public void diminuirCanal(){
    canal--;
}
public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando volume para: " + volume);
}
public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para: " + volume);
}

public void Ligar(){
    ligada=true;
}

public void Desligar(){
    ligada=false;
}

}