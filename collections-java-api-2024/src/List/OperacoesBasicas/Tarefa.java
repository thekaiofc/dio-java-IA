package List.OperacoesBasicas;

public class Tarefa {
    //atributo

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        // return "Tarefa{" +
        // "descricao='" + descricao + '\'' +
        // '}';
        return descricao;
    }

}