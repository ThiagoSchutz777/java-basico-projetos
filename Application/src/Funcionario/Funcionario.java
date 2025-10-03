package Funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
          this.salarioBruto = ((porcentagem / 100) * salarioBruto) + salarioLiquido();
    }
}
