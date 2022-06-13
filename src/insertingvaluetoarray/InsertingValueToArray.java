
package insertingvaluetoarray;

import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class InsertingValueToArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[]={2,3,1,4,5,6,7};
        
        
        System.out.println("Original array elements are:\n");
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        int array1[]= new int[array.length+1];
        
       String value = JOptionPane.showInputDialog(null,"Enter element to be inserted in array", JOptionPane.QUESTION_MESSAGE);
       
       int element = Integer.parseInt(value);
       
       String pos = JOptionPane.showInputDialog(null,"Enter position of new element", JOptionPane.QUESTION_MESSAGE);
       int position = Integer.parseInt(pos);
       
       
        for(int i=0; i<array.length; i++){
            if(i< position){
                
                array1[i] = array[i];
            }
            else if(i > position)
            {
                
                array1[i+1] = array[i];
            }
            else{
                
                array1[i]= element;
                array1[i+1]= array[i];
            }
        }
        System.out.println("modified array elements are:\n");
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]+" ");
        }
        
        
    }
    
}
