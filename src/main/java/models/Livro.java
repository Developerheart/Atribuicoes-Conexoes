package models;

import java.io.Serializable;

public class Livro implements Serializable {

    private static final long serialVersionUID =1L;
    private int Id;
    private String title;
    private String subtitle;
    private String author;
    private Integer numeroPag;
    private Integer numeroCap;

    public Livro(String title, String subtitle, String author, Integer numeroPag, Integer numeroCap) {
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.numeroPag = numeroPag;
        this.numeroCap = numeroCap;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(Integer numeroPag) {
        this.numeroPag = numeroPag;
    }

    public Integer getNumeroCap() {
        return numeroCap;
    }

    public void setNumeroCap(Integer numeroCap) {
        this.numeroCap = numeroCap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (Id != livro.Id) return false;
        if (!title.equals(livro.title)) return false;
        if (!subtitle.equals(livro.subtitle)) return false;
        if (!author.equals(livro.author)) return false;
        if (!numeroPag.equals(livro.numeroPag)) return false;
        return numeroCap.equals(livro.numeroCap);
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + title.hashCode();
        result = 31 * result + subtitle.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + numeroPag.hashCode();
        result = 31 * result + numeroCap.hashCode();
        return result;
    }

}
