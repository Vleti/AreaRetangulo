package exercicioarearetangulo;

public class Retangulo {
    int a,b;
    int a1,b1;
    
    
    public void setA(int x){
            this.a=x;
    }
    
    public void setB(int x){
            this.b=x;
    }
    
    public void setA1(int x){
            this.a1=x;
    }
    
    public void setB1(int x){
            this.b1=x;
    }
    
    public int getSomaArea(){
        if(a<0 || b<0){
            return 0;
        }
        int area = a*b;
        return area;
    }
    
    public int getSomaArea1(){
        if(a<0 || b<0){
            return 0;
        }
        int area1 = a1*b1;
        return area1;
    }
    
    
    
    public int getInterAreas(){
        int area = a*b;
        int area1 = a1*b1;
        int inter = Math.abs(area - area1);
        
        return inter;
    }
}


