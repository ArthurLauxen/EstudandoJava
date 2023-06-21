public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;


  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }

  public void aumentarCanal(){
     canal++;
    System.out.println("canal atual eh " + canal);
  }

  public void diminuirCanal(){
     canal--;
    System.out.println("canal atual eh " + canal);
  }

  public void Ligar(){
    ligada = true;
  }

  public void Desligar(){
    ligada = false;
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Volume aumentado para: " + volume);
  }

  public void diminuirVolume(){
    volume--;
    System.out.println("Volume Diminuido para: " + volume);
  }
}
