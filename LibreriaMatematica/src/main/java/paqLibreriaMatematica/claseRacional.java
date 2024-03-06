
package paqLibreriaMatematica;

class claseRacional
{
    private int numerador;
    private int denominador;
    
    claseRacional()
    {
        this.numerador = 1;
        this.denominador = 1;
    }
    
    claseRacional(int a)
    {
        this(a,1);
    }
    
    claseRacional(int a, int b)
    {
        this.numerador = a;
        if (b == 0)
            System.out.println("ERROR: denominador debe ser distinto de 0");
        else
            this.denominador = b;
    }
    
    claseRacional(claseRacional rac)
    {
        this(rac.numerador, rac.denominador);
    }
    
    private int getNumerador()
    {
        return this.numerador;
    }
    
    private int getDenominador()
    {
        return this.denominador;
    }

    private void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    private void setDenominador(int denominador)
    {
        this.denominador = denominador;
    }
    
    protected void Cambiar(int a, int b)
    {
        this.setNumerador(a);
        this.setDenominador(b);
    }
    
    protected void Mostrar()
    {
        System.out.print(this.getNumerador() + "/" + this.getDenominador());
    }
    
    protected static boolean Equivalencia(claseRacional rac1, claseRacional rac2)
    {
        if (rac1.numerador * rac2.denominador == rac1.denominador * rac2.numerador)
            return true;
        
        return false;
    }
    
    private claseRacional Inversa()
    {
        return new claseRacional(this.denominador, this.numerador);
    }
    
    protected claseRacional Simplificar()
    {
        claseRacional modulo = new claseRacional(this);
        
        if (this.getNumerador() < 0)
            modulo.setNumerador(this.getNumerador()/(-1));
        
        if (this.getDenominador() < 0)
            modulo.setDenominador(this.getDenominador()/(-1));
        
        int mcd = 1;
        int menor = (modulo.numerador < modulo.denominador)?modulo.numerador:modulo.denominador;
        
        for (int i = 2; i <= menor; i++) 
            if ( (modulo.numerador % i == 0) && (modulo.denominador % i == 0) )
                mcd = i;
        
        modulo.numerador /= mcd;
        modulo.denominador /= mcd;
        
        if  ( ((this.getNumerador() > 0) && (this.getDenominador() < 0)) ||
                ((this.getNumerador() < 0) && (this.getDenominador() > 0)) )
            modulo.setNumerador(modulo.getNumerador()*(-1));
        
        return modulo;
    }
    
    protected static boolean Orden(claseRacional rac1, claseRacional rac2)
    {
        if (rac1.getNumerador() * rac2.getDenominador() < rac1.getDenominador() * rac2.getNumerador())
            return true;
        
        return false;
    }
    
    protected static claseRacional Sumar(claseRacional rac1, claseRacional rac2)
    {
        claseRacional suma = new claseRacional();
        
        if ( rac1.getDenominador() == rac2.getDenominador() )
            suma.Cambiar( rac1.getNumerador() + rac2.getNumerador(), rac1.getDenominador() );
        else
            suma.Cambiar( rac1.getNumerador() * rac2.getDenominador() + rac1.getDenominador() * rac2.getNumerador(), rac1.getDenominador() * rac2.getDenominador() );
        
        return suma.Simplificar();
    }
    
    protected static claseRacional Restar(claseRacional rac1, claseRacional rac2)
    {
        claseRacional resta = new claseRacional();
        
        if ( rac1.getDenominador() == rac2.getDenominador() )
            resta.Cambiar( rac1.getNumerador() - rac2.getNumerador(), rac1.getDenominador() );
        else
            resta.Cambiar( rac1.getNumerador() * rac2.getDenominador() - rac1.getDenominador() * rac2.getNumerador(), rac1.getDenominador() * rac2.getDenominador() );
        
        return resta.Simplificar();
    }
    
    protected static claseRacional Multiplicar(claseRacional rac1, claseRacional rac2)
    {
        claseRacional producto = new claseRacional();
        
        producto.Cambiar(rac1.getNumerador() * rac2.getNumerador(), rac1.getDenominador() * rac2.getDenominador());
        
        return producto.Simplificar();
    }
    
    protected static claseRacional Dividir(claseRacional rac1, claseRacional rac2)
    {
//        claseRacional division = new claseRacional();
//        
//        //division.Cambiar(rac1.getNumerador() * rac2.getDenominador(), rac1.getDenominador() * rac2.getNumerador());
//        division = claseRacional.Multiplicar(rac1, rac2.Inversa());
//        
//        return division.Simplificar();
        return claseRacional.Multiplicar(rac1, rac2.Inversa()).Simplificar();
    }
    
}
