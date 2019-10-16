package com.app.search.ch02.binary;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Cat other) {
        if(this.getAge()!=other.getAge()){
            return getAge()-other.getAge();
        }

        if(this.getName()==null && other.getName()==null){
            return 0;
        }

        if(this.getName()==null){
            return 1;
        }

        if(other.getName()==null){
            return -1;
        }

        return this.getName().compareTo(other.getName());
    }
}
