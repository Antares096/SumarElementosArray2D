package sumamatriz;


public class Main {


    public static void main(String[] args) {
        int b1 [][] = MatrizB1();
        
        int b2 [][] = MatrizB2();
        
        int b3 [][] = Matriz3Resultado(b1,b2);
    }
    
    public static int [][] MatrizB1()
    {
        //----------------CREACIÓN Y LLENADO DE LA MATRIZ--------------------
        int B1[][] = new int[4][4];
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                B1[i][j] = GeneraAleatorio(1,4);
            }
        }
        
        //-------------------Impresion de Matriz B1--------------------
        System.out.println("Matriz 1:");
        
        String reng = "";
        for (int i = 0; i < B1.length; i++) {
            
            reng = "";
            for (int j = 0; j < B1.length; j++) {
                
                reng = reng+" "+B1[i][j];
            }
            System.out.println(reng);
        }
        
        return B1;
    }
    
    public static int [][] MatrizB2()
    {
        //----------------CREACIÓN Y LLENADO DE LA MATRIZ--------------------
        int B2[][] = new int[4][4];
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                B2[i][j] = GeneraAleatorio(1,4);
            }
        }
        
        //--------------------Impresion de Matriz B2----------------------
        System.out.println("Matriz 2: ");
        
        String reng = "";
        for (int i = 0; i < B2.length; i++) {
            
            reng = "";
            for (int j = 0; j < B2.length; j++) {
                
                reng = reng+" "+B2[i][j];
            }
            System.out.println(reng);
        }
        
        return B2;
    }
    
    public static int [][] Matriz3Resultado(int b1 [][],int b2 [][])
    {
        
        int B3 [][] = new int[4][4];
        int b = 3;
        int a = 3;
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
               B3[i][j] = b1[i][j]+b2[a][b];
               b--;
            }
            a--;
            b = 3;
        }
        //------------------IMPRESIÓN DEL RESULTADO----------------------
        System.out.println("Matriz 3: Resultado");
        String fila = "";
        
        for (int i = 0; i < B3.length; i++) 
        {
            fila = " ";
            for (int j = 0; j < B3.length; j++)
            {
                fila = fila +" "+ B3[i][j];
            }
            System.out.println(fila);
        }
        
        return B3;
    }
    
    public static int GeneraAleatorio(int min,int max)
    {
        int random = (int)(Math.random()*(max-min+1)+min);
        return random;
    }
}
