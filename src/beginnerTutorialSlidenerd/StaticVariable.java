// Project: SildenerdTutorial

package beginnerTutorialSlidenerd;

public class StaticVariable {
    
    public static void main(String[] args) {
        
        Test test1 = new Test();
        //System.out.println("Serial ID: "+ Test.id);
        
        Test test2 = new Test();
        //System.out.println("Serial ID: "+ Test.id);
        
        //System.out.println("Serial ID: "+ Test.id);
        
    }
}

class Test{
    
    static int id =999;
    
    Test(){
        id++;
        
        
        System.out.println("Serial ID: "+ id);
    }
}
