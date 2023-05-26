public class Container {
    private int id;
    private String cliente;
    private String numero;
    private String tipo;
    private String status;
    private String categoria;

    public Container() {
    }

    public Container(int id, String cliente, String numero, String tipo, String status, String categoria) {
        this.id = id;
        this.cliente = cliente;
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
        this.categoria = categoria;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
