import java.util.Objects;

abstract class AHuman{
    protected String name;
    protected Feelings feel;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if  (object == null || getClass() != object.getClass()) return false;
        AHuman aHuman = (AHuman) object;
        return Objects.equals(name, aHuman.name);
    }

    @Override
    public String toString(){
        return "Human{" + "name = '" + name + "'}";
    }


    public class AHumanNested {
        public String getName() {
            return AHuman.this.name;

        }
        public void setFeel(Feelings feel) {
            AHuman.this.feel = feel;
        }

    }
}

