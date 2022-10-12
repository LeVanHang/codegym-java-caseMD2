package storage;

import java.util.List;

public interface ReadWriteData<T>{

    List<T> readData();
    void witeData(List<T> list);
}
