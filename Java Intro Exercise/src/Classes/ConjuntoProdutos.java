package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoProdutos
{
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void inserirProduto(Produto produto)
    {
        if (buscarProdutos(produto.getCodigo()) == null)
        {
            produtos.add(produto);
            System.out.println("Produto inserido com sucesso!");
        }
        else
        {
            System.out.println("O codigo do produto inserido já consta no sistema!");
        }
    }

    private Produto buscarProdutos(int codigo)
    {
        for(int i = 0; i < produtos.size(); i++)
        {
            if(produtos.get(i).getCodigo() == codigo)
            {
                return produtos.get(i);
            }
        }
        return null;
    }

    public void removerProduto(int codigo)
    {
        if (buscarProdutos(codigo) == null)
        {
            System.out.println("O codigo inserido não consta no sistema!");
        }
        else
        {
            produtos.remove((produtos.indexOf(buscarProdutos(codigo))));
            System.out.println("Produto removido com sucesso!");
        }
    }

    public void atualizarProduto(int codigo)
    {
        if(buscarProdutos(codigo) == null)
        {
            System.out.println("O codigo informado não consta no sistema!");
        }
        else
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informações do produto: ");
            produtos.get(produtos.indexOf(buscarProdutos(codigo))).toString();

            System.out.println("digite o novo nome: ");
            String nome = scanner.nextLine();
            produtos.get(produtos.indexOf(buscarProdutos(codigo))).setNome(nome);


            System.out.println("digite o novo valor: ");
            float valor = scanner.nextFloat();
            produtos.get(produtos.indexOf(buscarProdutos(codigo))).setValor(valor);

            System.out.println("Informações do produto com atualizações: ");
            produtos.get(produtos.indexOf(buscarProdutos(codigo))).toString();
        }
    }

    public void mostrarProdutos()
    {
        if(produtos.isEmpty())
        {
            System.out.println("Nenhum produto cadastrado no sistema!");
        }
        else
        {
            for(int i = 0; i < produtos.size(); i++)
            {
                System.out.println(produtos.get(i).toString());
            }
        }
    }

    public void atualizarPrecoPorcentagem(int codigo, float valor)
    {
        if (buscarProdutos(codigo) == null)
        {
            System.out.println("O codigo inserido não consta no sistema!");
        }
        else
        {
            float novoValor = produtos.get(produtos.indexOf(buscarProdutos(codigo))).getValor() + produtos.get(produtos.indexOf(buscarProdutos(codigo))).getValor() * valor;
            produtos.get(produtos.indexOf(buscarProdutos(codigo))).setValor(novoValor); // da pra usar o metodo atualizarPreco() mas ele não aparece
            System.out.println("Valor atualizado com sucesso!");
        }
    }
}