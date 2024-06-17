import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if(!tarefasParaRemover.isEmpty()){
            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        
        listaTarefas.adicionarTarefa("Comprar pão");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Trabalhar");

        System.out.println("Você tem "+listaTarefas.obterNumeroTotalTarefas()+" tarefas para fazer!");

        listaTarefas.obterDescricoesTarefas();

        listaTarefas.removerTarefa("Trabalhar");

        System.out.println("Você tem "+listaTarefas.obterNumeroTotalTarefas()+" tarefas para fazer!");
        
        listaTarefas.obterDescricoesTarefas();

    }



}
