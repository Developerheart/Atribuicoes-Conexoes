package models;

import enums.Classe;
import enums.Regiao;

import java.io.Serializable;

public class Char implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;
    private Integer level;
    private Classe classe;
    private Regiao regiao;

    public Char(String name, Integer age, Integer level, Classe classe, Regiao regiao) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.classe = classe;
        this.regiao = regiao;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getClasse() {
        return String.valueOf(classe);
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getRegiao() {
        return String.valueOf(regiao);
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Char aChar = (Char) o;

        if (!name.equals(aChar.name)) return false;
        if (!age.equals(aChar.age)) return false;
        if (!level.equals(aChar.level)) return false;
        if (classe != aChar.classe) return false;
        return regiao == aChar.regiao;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + level.hashCode();
        result = 31 * result + classe.hashCode();
        result = 31 * result + regiao.hashCode();
        return result;
    }
}

