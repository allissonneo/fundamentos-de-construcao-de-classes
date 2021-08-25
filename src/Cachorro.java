public class Cachorro {
    String name;
    String raca;
    String porte;
    String sexo;
    String cor;
    double peso;
    Boolean violento;
    int fofura = 10;
    int felicidade = 10;
    
    

    void comer ( Boolean comer){
        comer = true;
        System.out.println(name+" Comeu.");
        felicidade();
    }
    void fofuraDog (Boolean fofo){
        if(fofo = true){
            fofura+=10;
            System.out.println("Fofura de "+name+" aumentou para: "+fofura);
        }else{
            fofura --;
        }
    }
    void brincar (){
        System.out.println(name+ " brincou e a");
        fofuraDog(true);
    }
    void felicidade (){
      felicidade +=10;
      System.out.println("Felicidade de "+name+" aumentou para "+ felicidade );   
    }
}
