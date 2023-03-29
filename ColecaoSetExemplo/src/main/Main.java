package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("the office", "Comedia", 25));
            add(new Serie("got", "aventura", 60));
            add(new Serie("todo mundo odeia o cris", "Drama", 25));

        }};
        for(Serie serie: minhasSeries){
            System.out.println(serie.getName()+" - " +serie.getGender()+" - "+serie.getDuration());
        }Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("the office", "Comedia", 25));
            add(new Serie("got", "aventura", 60));
            add(new Serie("todo mundo odeia o cris", "Drama", 25));

        }};
        System.out.println("Ordem de insercao: ");
        for(Serie serie: minhasSeries2){
            System.out.println(serie.getName()+" - " +serie.getGender()+" - "+serie.getDuration());
        }
        System.out.println("Ordem natural(duration): ");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for(Serie serie: minhasSeries3){
            System.out.println(serie.getName()+" - " +serie.getGender()+" - "+serie.getDuration());
        }



    }
}
class Serie implements Comparable<Serie> {
    private String name;
    private String gender;
    private Integer duration;

    public Serie(String name, String gender, Integer duration) {
        this.name = name;
        this.gender = gender;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(name, serie.name) && Objects.equals(gender, serie.gender) && Objects.equals(duration, serie.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, duration);
    }

    @Override
    public int compareTo(Serie serie) {
        int duration = Integer.compare(this.getDuration(), serie.getDuration());
        if(duration!=0){
            return duration;
        }
        int gender = this.getGender().compareTo(serie.getGender());
        if(gender!=0){
            return gender;
        }
        int name = this.getName().compareTo(serie.getName());
        return name;
    }

}
class ComparatorNameGenderDuration implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int duration = Integer.compare(s1.getDuration(), s2.getDuration());
        if(duration!=0){
            return duration;
        }
        int gender = s1.getGender().compareTo(s2.getGender());
        if(gender!=0){
            return gender;
        }
        int name = s1.getName().compareTo(s2.getName());
        return name;
    }
}