package exercicioarearetangulo;

public class ExercicioAreaRetangulo {

    public static void main(String[] args) {
        Retangulo ret=new Retangulo();
        ret.setA(8);
        ret.setB(20);
        
        ret.setA1(10);
        ret.setB1(5);
        
        System.out.println("Área Maior = "+ret.getSomaArea());
        
        System.out.println("Área Menor = "+ret.getSomaArea1());
        
        System.out.println("Diferença das Áreas = "+ret.getInterAreas());
        
        }
    }
    
