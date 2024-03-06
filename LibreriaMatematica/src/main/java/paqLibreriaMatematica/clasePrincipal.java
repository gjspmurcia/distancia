
package paqLibreriaMatematica;

public class clasePrincipal 
{

    public static void main(String[] args)
    {
        claseRacional rac1 = new claseRacional();
        System.out.print("rac1: ");
        rac1.Mostrar();
        System.out.println("");
        
        claseRacional rac2 = new claseRacional(3);
        System.out.print("rac2: ");
        rac2.Mostrar();
        System.out.println("");
        
        claseRacional rac3 = new claseRacional(2,5);
        System.out.print("rac3: ");
        rac3.Mostrar();
        System.out.println("");
        
        claseRacional rac4 = new claseRacional(8,0);
        System.out.print("rac4: ");
        rac4.Mostrar();
        System.out.println("");
        System.out.print("rac4: ");
        rac4.Cambiar(4,10);
        rac4.Mostrar();
        System.out.println("");
        
        if (claseRacional.Equivalencia(rac1, rac2))
        {
            rac1.Mostrar();
            System.out.print(" y ");
            rac2.Mostrar();
            System.out.println(" son equivalentes.");
        }
        else
        {
            rac1.Mostrar();
            System.out.print(" y ");
            rac2.Mostrar();
            System.out.println(" no son equivalentes.");
        }
        
        if (claseRacional.Equivalencia(rac3, rac4))
        {
            rac3.Mostrar();
            System.out.print(" y ");
            rac4.Mostrar();
            System.out.println(" son equivalentes.");
        }
        else
        {
            rac3.Mostrar();
            System.out.print(" y ");
            rac4.Mostrar();
            System.out.println(" no son equivalentes.");
        }
        
        System.out.println("-------------");
        
        rac2.Cambiar(5, 10);
        rac2.Mostrar();
        System.out.print(" simplificado: ");
        rac2 = rac2.Simplificar();
        rac2.Mostrar();
        System.out.println("");
        rac2.Cambiar(-5, -10);
        rac2.Mostrar();
        System.out.print(" simplificado: ");
        rac2 = rac2.Simplificar();
        rac2.Mostrar();
        System.out.println("");
        rac2.Cambiar(-72, 64);
        rac2.Mostrar();
        System.out.print(" simplificado: ");
        rac2 = rac2.Simplificar();
        rac2.Mostrar();
        System.out.println("");
        rac2.Cambiar(144, -816);
        rac2.Mostrar();
        System.out.print(" simplificado: ");
        rac2 = rac2.Simplificar();
        rac2.Mostrar();
        System.out.println("");
        
        System.out.println("-------------");
        rac1.Cambiar(2, 5);
        rac2.Cambiar(3, 5);
        if (claseRacional.Orden(rac1, rac2))
        {
            rac1.Mostrar();
            System.out.print(" es menor que ");
            rac2.Mostrar();
        }
        else
        {
            rac1.Mostrar();
            System.out.print(" es mayor que ");
            rac2.Mostrar();
        }
        System.out.println("");
        if (claseRacional.Orden(rac2, rac1))
        {
            rac2.Mostrar();
            System.out.print(" es menor que ");
            rac1.Mostrar();
        }
        else
        {
            rac2.Mostrar();
            System.out.print(" es mayor que ");
            rac1.Mostrar();
        }
        System.out.println("");
        
        System.out.println("-------------");
        rac1.Cambiar(2, 5);
        rac2.Cambiar(3, 5);
        rac3 = claseRacional.Sumar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" + ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        rac4 = claseRacional.Sumar(rac3, rac2);
        rac3.Mostrar();
        System.out.print(" + ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac4.Mostrar();
        System.out.println("");
        
        rac1.Cambiar(2, 2);
        rac2.Cambiar(3, 4);
        rac3 = claseRacional.Sumar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" + ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        System.out.println("-------------");
        rac1.Cambiar(2, 5);
        rac2.Cambiar(3, 5);
        rac3 = claseRacional.Restar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" - ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        rac4 = claseRacional.Restar(rac3, rac2);
        rac3.Mostrar();
        System.out.print(" - ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac4.Mostrar();
        System.out.println("");
        
        rac1.Cambiar(2, 2);
        rac2.Cambiar(3, 4);
        rac3 = claseRacional.Restar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" - ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        System.out.println("-------------");
        rac1.Cambiar(2, 5);
        rac2.Cambiar(3, 5);
        rac3 = claseRacional.Multiplicar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" * ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        rac3.Mostrar();
        System.out.print(" * ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3 = claseRacional.Multiplicar(rac3, rac2);
        rac3.Mostrar();
        System.out.println("");
        
        rac1.Cambiar(2, 2);
        rac2.Cambiar(3, 4);
        rac3 = claseRacional.Multiplicar(rac1, rac2);
        rac1.Mostrar();
        System.out.print(" * ");
        rac2.Mostrar(); 
        System.out.print(" = ");
        rac3.Mostrar();
        System.out.println("");
        
        System.out.println("-------------");
        rac1.Cambiar(2, 5);
        rac2.Cambiar(3, 5);
        rac3 = claseRacional.Dividir(rac1, rac2);
        System.out.print("(");
        rac1.Mostrar();
        System.out.print(") / (");
        rac2.Mostrar(); 
        System.out.print(") = ");
        rac3.Mostrar();
        System.out.println("");
        
        rac4 = claseRacional.Dividir(rac3, rac2);
        System.out.print("(");
        rac3.Mostrar();
        System.out.print(") / (");
        rac2.Mostrar(); 
        System.out.print(") = ");
        rac4.Mostrar();
        System.out.println("");
        
        rac1.Cambiar(2, 2);
        rac2.Cambiar(3, 4);
        rac3 = claseRacional.Dividir(rac1, rac2);
        System.out.print("(");
        rac1.Mostrar();
        System.out.print(") / (");
        rac2.Mostrar(); 
        System.out.print(") = ");
        rac3.Mostrar();
        System.out.println("");
        
        
        
        
    }
}
