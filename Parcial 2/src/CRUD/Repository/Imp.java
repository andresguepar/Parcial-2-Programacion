package CRUD.Repository;

import CRUD.Modelo.Local;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Imp implements Int{

    private List<Local> locals;

    public Imp()throws IOException, ClassNotFoundException {
        locals = new ArrayList<>();
    }


    @Override
    public Local findByNum(int localNum) {
        return locals.stream()
                .filter(local -> local.getLocalNum() == localNum)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Local> findAll()throws IOException, ClassNotFoundException {
        locals = (List<Local>) Ser.reader("Local.ax");
        return locals;
    }

    @Override
    public void save(Local local) throws IOException {
        this.locals.add(local);
        Ser.writer(this.locals,"Local.ax");

    }

    @Override
    public void update(Local local) throws IOException,ClassNotFoundException {
        Local oldLocal = findByNum((local.getLocalNum()));
        if (oldLocal != null){
            locals.remove(oldLocal);
            locals.add(local);
        }
        Ser.writer(this.locals,"Local.ax");
    }

    @Override
    public void delete(Local local) throws IOException {
        locals.remove(local);
        Ser.writer(this.locals,"Local.ax");
    }
}
