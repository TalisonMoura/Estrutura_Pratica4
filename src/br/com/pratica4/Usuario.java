package br.com.pratica4;

public class Usuario {
    String Name, Telefone, Email;
    public Usuario(String nome, String telefone, String email){
        Name = nome;
        Telefone = telefone;
        Email = email;
    }
    
    @Override
    public String toString() {
        return "Nome: " + Name +" | "+"Telefone: "+ Telefone +" | "+"Email: "+ Email;
    }
}
