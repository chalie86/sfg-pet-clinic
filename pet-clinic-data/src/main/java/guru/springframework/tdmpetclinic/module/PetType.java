package guru.springframework.tdmpetclinic.module;

public class PetType extends BaseEntity {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
