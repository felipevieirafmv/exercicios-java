public class Calculadora {
    public static float Add(float x, float y)
    {
        return x + y;
    }

    public static float Sub(float x, float y)
    {
        return x - y;
    }
    public static float Mul(float x, float y)
    {
        return x * y;
    }
    public static float Div(float x, float y)
    {
        if(y == 0)
        {
            System.out.println("\nDivisão por 0 não existe.");
            return 0;
        }
        return x / y;
    }
}
