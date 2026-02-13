public class OperacoesMatematicas {
    
    public int somar (int num1, int num2){
        return num1 + num2;
    }

    public int subtrair (int num1, int num2){
        return num1 - num2;
    }

    public int multplicar(int num1, int num2){
        return num1 + num2;
    }

    public float dividir(float num1, float num2) throws DivisaoPorZeroException {
        if(num2 == 0) {
        new DivisaoPorZeroException();
        }
        return num1 / num2;
    }
}
