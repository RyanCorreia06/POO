public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especilidade;
    private String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEspecilidade() {
        return especilidade;
    }
    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }
    public String getSenha() {
        return "********";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm + ", telefone=" + telefone + ", especilidade=" + especilidade
                + ", senha=" + senha + "]");
    }

    public void acessar(){
        //TODO
    }

}
