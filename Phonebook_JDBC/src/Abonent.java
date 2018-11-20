public class Abonent {
    private int id;
    private String name;
    private int number;

    public Abonent(){}

    public Abonent(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "id= " + id +
                ", name= " + name + '\'' +
                ", number= " + number +
                '}';
    }
}
