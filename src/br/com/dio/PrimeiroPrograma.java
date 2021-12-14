package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
      /*  int a = 5;
        int b = 3;

        System.out.println("Hello World" + (a + b));
*/
    }
}
class Livro {
    private String nome;
    private Integer numpag;

    public Livro(String nome, int numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numpag, livro.numpag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numpag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag='" + numpag + '\'' +
                '}';
    }
}