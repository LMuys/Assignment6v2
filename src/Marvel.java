import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class Marvel extends AnyParty {

    private List<Comic> mComics;
    private List<Publication> mPublications;

    public Marvel(String name, String userName, String password) {
        super(name, userName, password);
    }

    @Override
    public void addProperty(AnyProperty property) {
        mComics.add((Comic) property);
    }

    @Override
    public boolean removeProperty(AnyProperty property) {
        return mComics.remove((Comic) property);
    }

    @Override
    public List<? extends AnyProperty> getProperties() {
        return mComics;
    }

    @Override
    public void setProperties(List<? extends AnyProperty> properties) {
        mComics = (List<Comic>) properties;
    }

    @Override
    public void addIntellect(AnyIntellect intellect) {
        mPublications.add((Publication) intellect);
    }

    @Override
    public boolean removeIntellect(AnyIntellect intellect) {
        return mPublications.remove((Publication) intellect);
    }

    @Override
    public List<? extends AnyIntellect> getIntellects() {
        return mPublications;
    }

    @Override
    public void setIntellects(List<? extends AnyIntellect> intellects) {
        mPublications = (List<Publication>) intellects;
    }
}
