/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop1;

/**
 *
 * @author sitti
 */
public class WhileLoop1 {

//    public static void demo(){
//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//    }
//    
//    public static void demofor(){
//        for(int i = 1; i <= 10; i++)
//            System.out.println(i);
//    }
//  
    //100 5% >>> 200
    public static void saving(){
        float deposit = 100.0f;
        float rate = .05f;
        int years = 1;
        float balance = deposit * (1+rate);
        
        while (balance <= 200.0f){
            System.out.printf("end of yaers: %d balance = %.2f \n",years ,balance);
            balance = balance * (1+rate);
            years++;   
        }
        System.out.printf("end of yaers: %d balance = %.2f \n",years ,balance);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//       
        saving();
            
    }

}
