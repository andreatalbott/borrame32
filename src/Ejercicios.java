
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int z = x+y;
		return z;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int respuesta = x-y;
		return respuesta;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int z = x*y;
		return z;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int a = x%y;
		return a;
	}
	
	//devuelve true si x es par, de lo contrario devuelve false
	static boolean esPar(int x)
	{
		int var = x%2;
		if(var==0)
		    return true;
		else
			return false;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		int var = x%3;
		if(var==0)
			return true;
		else
	 	    return false;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int z = x>y;
		return z;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		int  var x>=18;
		if (var>==18)
			return true;
		else
		    return false;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		return -1;
	}
	
	public static void main(String[] args)
	{
		
	}

}
