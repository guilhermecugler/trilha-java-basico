import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);

        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        if(!itemList.isEmpty()){
            for(Item i: itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }else{
        System.out.println("Lista vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if(!itemList.isEmpty()){
            for(Item i : itemList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
  
    
}
