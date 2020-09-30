package RevisaoExercicio1;

import java.time.LocalDate;

public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public int dia;
    public int mes;
    public int ano;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento){
        if(aumento > 0){
            salario += aumento;
        }else {
            System.out.println("Valor invalido!");
        }
    }

    public void demiteFuncionario(){
        ativo = false;
    }

    public void data(){
        dataContratacao = LocalDate.of(ano, mes, dia);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFunc=" + idFunc +
                ", nomeFunc='" + nomeFunc + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + salario +
                ", documento='" + documento + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
