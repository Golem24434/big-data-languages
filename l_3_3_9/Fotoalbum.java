import java.util.ArrayList;
import java.util.List;

public class Fotoalbum {
    private List<Fotografia> fotolist = new ArrayList<Fotografia>();

    public void addFoto(Fotografia foto) {
        fotolist.add(foto);
    }

    public int getCount() {
        return fotolist.size();
    }
}