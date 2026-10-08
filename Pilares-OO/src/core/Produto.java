package core;

public class Produto {
    private int codigo ;
    private float preco;
    private String descricao;
    private int estoque;

    public Produto(int codigo, float preco, String descricao, int estoque) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    /** public void setEstoque(int estoque) {
        this.estoque = estoque;
    } */

    public String getDescricao() {
        return descricao;
    }

    /** public void setDescricao(String descricao) {
        this.descricao = descricao;
    } */

    public float getPreco() {
        return preco;
    }
    /**public void setPreco(float preco) {
        this.preco = preco;
    } */

    public int getCodigo() {
        return codigo;
    }

    /** public void setCodigo(int codigo) {
        this.codigo = codigo;
    } */


}
