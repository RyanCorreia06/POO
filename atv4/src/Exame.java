public class Exame {
  private Consulta consulta;
    private String data;
    private String descritivo;
 
    public Exame(){}
    
    public Exame(Consulta consulta, String data, String descritivo) throws  Exception{
        setConsulta( consulta);
        setData(data);
        setDescritivo(descritivo);
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) throws Exception {
        if(data==null)
            throw new Exception("a data não pode ser nula!");
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo)throws Exception {
        if(descritivo==null||descritivo.length()<=0)
            throw new Exception("É OBRIGATÓRIO INSERIR UMA DESCRIÇÃO");
        this.descritivo = descritivo;
    }
    
    public void mostrar() {
        System.out.println( "Receita [consulta=" + consulta + ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void preescrever(){}//todo
    public void consultar(){}//todo
}
