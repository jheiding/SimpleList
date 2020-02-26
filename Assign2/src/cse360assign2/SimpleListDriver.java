/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assign2;

/**
 *
 * @author salam
 */
public class SimpleListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleListV2 nec = new SimpleListV2();
		nec.add(10);
		//System.out.println(nec.toString());
                nec.add(0);
		//System.out.println(nec.toString());
                 nec.add(9);
		//System.out.println(nec.toString());
                 nec.add(3);
		//System.out.println(nec.toString());
                 nec.add(4);
		//System.out.println(nec.toString());
                 nec.add(1);
		//System.out.println(nec.toString());
                 nec.add(4);
		//System.out.println(nec.toString()+" g");
                 nec.add(5);
		
		//System.out.println(nec.toString());
                nec.add(2);
		
		//System.out.println(nec.toString());
                
                nec.add(3);
		
		//System.out.println(nec.toString());
                nec.add(2);
		
		//System.out.println(nec.toString());
                nec.add(10);
		
		//System.out.println(nec.toString());
                System.out.println(nec.toString());
               nec.remove(10);
               nec.remove(2);
               nec.remove(3);
               nec.remove(4);
               nec.remove(10);
		
		System.out.println(nec.toString());
		
        //System.out.println(nec.count());
        
        
        nec.search(3);
        // TODO code application logic here
    }
    
}
