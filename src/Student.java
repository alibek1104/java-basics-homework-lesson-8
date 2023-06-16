public class Student {

    String name;
    String surname;
    String address;
    int id;

    public Student() {
        name = "Неизвестно";
        surname = "Неизвестно";
        address = "Неизвестно";
        id = 0;
    }


    public Student (String name, String surname, String address, int id) {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;

    }

    public String toString() {
        return "Имя: " + name + ", Фамилия: " + surname + ", Адрес: " + address + ", ID: " + id;

    }

}
