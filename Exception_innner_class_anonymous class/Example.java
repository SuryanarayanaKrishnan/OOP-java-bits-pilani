public class Example { 
      
    public static void main(String args[]) { 
        try 
        { 
            ABC.forName("Hi"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            ex.printStackTrace(); 
        } 
    } 
} 
