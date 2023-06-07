package Principal;

import Classes.ConjuntoProdutos;
import Classes.Fornecedor;
import Classes.Produto;

public class TesteProduto
{
    public static void main(String[] args)
    {
        Fornecedor forn1 = new Fornecedor("1234321", "", "Zé Maria");
        Fornecedor forn2 = new Fornecedor("543212345", "", "Cláudio");

        Produto produto1 = new Produto(1, "TV LCD", 3500f, forn1);
        Produto produto2 = new Produto(2, "notebook", 2000f, forn2);
        Produto produto3 = new Produto(3, "impressora", 232f, forn2);

        ConjuntoProdutos conjunto = new ConjuntoProdutos();

        conjunto.mostrarProdutos();
    }
}