public class Person {
    private String name;
    private int age;
    private String gender;
    private String profession;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;

    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPerson() {
        return String.format("""
                        name: = %s
                        age: =  %s
                      gender: = %s
                  profession: = %s
                """, name, age, gender, profession);
    }


}

