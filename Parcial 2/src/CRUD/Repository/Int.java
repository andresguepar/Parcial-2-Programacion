package CRUD.Repository;

import CRUD.Modelo.Local;

import java.io.IOException;
import java.util.List;

public interface Int {
    Local findByNum(int localNum);
    List<Local> findAll() throws IOException,ClassNotFoundException;
    void save(Local local)throws IOException;
    void update(Local local)throws IOException,ClassNotFoundException;
    void  delete(Local local)throws IOException;
}
