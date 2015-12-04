import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class Comic extends AnyProperty {

    private String mName;
    public List<String> mAuthors;

    public Comic(int id, String name) {
        super(id);
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void addAuthor(String author) {
        mAuthors.add(author);
    }
    public boolean removeAuthor(String author) {
        return mAuthors.remove(author);
    }
    public List<String> getAuthors() {
        return mAuthors;
    }
    public void setAuthors(List<String> authors) {
        mAuthors = authors;
    }
}
