public class Cachorro extends Lobo{

    //sobreposição
    //na sobrecarga a assinatura nao pode ter tipos iguais e nem quantidade
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }

    public void reagir(String frase){//para sobrecarga é necessario adicionar assinatura no metodo
        if(frase.equals("Comida") || frase.equals("ola")){
            System.out.println("Fica feliz");
        }else{
            System.out.println("rosnar...");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if (hora >= 18){
            System.out.println("ignorar...");
        }else {
            System.out.println("abanar e latir");
        }

    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar");
        }else{
            System.out.println("latir");
        }

    }
    public void reagir(int idade, float peso){
        if (idade < 5){
            if(peso < 10){
                System.out.println("latir");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso < 10){
                System.out.println("rosnaar");
            }else{
                System.out.println("ignorar");
            }
            
        }
        }
    }

}
