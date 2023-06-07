package Classes;

public class Fornecedor
{
    private String CNPJ;
    private String telefone;
    private String nome;

    public Fornecedor(String CNPJ, String telefone, String nome)
    {
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getCNPJ()
    {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ)
    {
        this.CNPJ = CNPJ;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @Override
    public String toString()
    {
        return String.format("CNPJ: %s | Telefone: %s | Nome: %s", getCNPJ(), getTelefone(), getNome());
    }
}