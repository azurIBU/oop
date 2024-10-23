package w4;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }


    public String toString() {
        return "%s \n %s".formatted(this.name, this.address);
    }

}

class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return credits;
    }

    public void study() {
        this.credits++;
    }
}

class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }


    public String toString() {
        return "%s \n %s \n salary %s euros/month".formatted(this.getName(), this.getAddress(), this.salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}
