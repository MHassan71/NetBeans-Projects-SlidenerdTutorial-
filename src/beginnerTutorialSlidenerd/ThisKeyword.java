// Project: SildenerdTutorial

package beginnerTutorialSlidenerd;

public class ThisKeyword {
    
    public static void main(String[] args) {
        
        
        SomeClass someClass1 = new SomeClass();
        someClass1.no = 10;
        someClass1.display();
        
        SomeClass someClass2 = new SomeClass();
        someClass2.no = 20;
        someClass2.display();
       // System.out.println("obj "+ obj);
       
       System.out.println("DivResult: " + 1/3);
    }
}


class SomeClass{
    
    int no = 1;
    
    public void display(){
        int no = 5;
        
        
        System.out.println("Local variable number:" + no);
        System.out.println("Instence variable number: " + this.no);
    }
}
