public class University {
    private String name;
    private String address;
    private String faculties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculties() {
        return faculties;
    }

    public void setFaculties(String faculties) {
        this.faculties = faculties;
    }

    public String getUniver() {
        return String.format("""
                        name: = %s
                     address: = %s
                    facultet: = %s
                """, name, address, faculties);
    }
}