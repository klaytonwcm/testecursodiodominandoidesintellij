package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

      /*  int a = 5;
        int b = 3;

        System.out.println("Hello World" + (a + b));
*/
    }
}
class Livro {
    private String nome;
    private String numpag;

    public Livro(String nome, String numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumpag() {
        return numpag;
    }

    public void setNumpag(String numpag) {
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