package br.com.pratica4;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
/*
    Elabore um programa que utilize o TAD Doquer para adicionar
    objetos de uma classe contendo os seguintes atributos:
    Nome, telefone e e-mail.
    O programa deve solicitar os dados de 10 pessoas.
    Ao final imprimir a lista na ordem convencional e na ordem inversa
*/
public class Questao2 {
    public void ArrayDeque() {
        Deque<Usuario> dados = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira nome, telefone e email: ");
            String nome = scanner.nextLine();
            String telefone = scanner.nextLine();
            String email = scanner.nextLine();
            dados.add(new Usuario(nome,telefone,email));
        }
        System.out.println("Lista Convencional");
        for(Iterator itr = dados.iterator(); itr.hasNext();){
            System.out.println(itr.next().toString() + " ");
        }
        System.out.println();
        System.out.println("Lista inversa");
        for(Iterator itr = dados.descendingIterator(); itr.hasNext();){
            System.out.println(itr.next().toString() + " ");
        }
    }
}
