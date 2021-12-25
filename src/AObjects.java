import java.util.Objects;

abstract class AObjects implements IObjects {

    protected String name;

    @Override
    public String getName() {
        return this.name = name;
    }


}
