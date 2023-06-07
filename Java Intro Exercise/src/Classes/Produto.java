package Classes;

public class Produto
{
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public void atualizarPreco(float valor)
    {
        valor /= 100;
        this.valor *= valor;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public Fornecedor getFornecedor()
    {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor)
    {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString()
    {
        return String.format("Codigo: %d | Nome: %s | Valor: %f | %s", getCodigo(), getNome(), getValor(), getFornecedor().toString());
    }
}