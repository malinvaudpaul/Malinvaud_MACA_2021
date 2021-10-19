package td2.fichiers;

import java.util.Objects;

public final class Owner {
    private final String name ;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true ;
        if (obj == null || getClass() != obj.getClass()) return false ;
        Owner owner = (Owner) obj;
        return Objects.equals(this .getName(),owner.getName()) ;
    }
}
