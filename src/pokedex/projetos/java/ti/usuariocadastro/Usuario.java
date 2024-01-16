package pokedex.projetos.java.ti.usuariocadastro;

public class Usuario extends UsuarioSora{
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String usuario) {
        this.nome = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaUsuario) {
        this.senha = senhaUsuario;
    }

    public boolean verificar() {
        if (getNome().equals(getNome1()) && getSenha().equals(getSenha1())) {
            return true;
        } else {
            return false;
        }
    }
}