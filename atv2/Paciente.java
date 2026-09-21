public class Paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private int idade;
    private char genero;
    private String senha;
 
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void cadastrar(){
        //todo
    }
    public void consultar(){
        //todo
    }
    public void mostrar(){
        System.out.println("Objeto do tipo Paciente");
        System.out.println("nome:"+ this.nome);
        System.out.println("email:"+ this.email);
        System.out.println("telefone:"+ this.telefone);
        System.out.println("idade:"+ this.idade);
    }
    
    public String getSenha() {
        return "************";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
