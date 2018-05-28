
package trees.Excercices;

import java.util.Scanner;
import trees.BinaryTree;
import trees.Node;

/**
 *
 * @author Estudiante
 */
public class Mirror {
    
    
    
    public static void main(String[] args) 
    {
        int N, Q, root_sub_tree, value_node, number;
        String entrada1, entrada, direction;
        String[] parts1, parts;
        
        Scanner sc= new java.util.Scanner(System.in);
        entrada = sc.nextLine();
        parts = entrada.split(" ");
        N = Integer.parseInt(parts[0]); 
        Q = Integer.parseInt(parts[1]); 
        int[] numbers = new int[Q];
        BinaryTree mirror = new BinaryTree();
        mirror.insert(1);
        
        for (int i = 0; i < N-1; i++) 
        {
            entrada1 = sc.nextLine();
            parts1 = entrada1.split(" ");
            root_sub_tree = Integer.parseInt(parts1[0]); 
            value_node = Integer.parseInt(parts1[1]); 
            direction = parts1[2];
            
            if (direction == "L")
                mirror.search(root_sub_tree).left = new Node(value_node);
            else if(direction == "R")
                mirror.search(root_sub_tree).right = new Node(value_node);
        }
        
        for (int i = 0; i < Q; i++) 
        {
            number = sc.nextInt();
            numbers[i] = number;            
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(mirror.search_Mirror(i));
        }
        
    }
}
