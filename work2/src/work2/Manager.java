package work2;

import work2.Node;

public interface Manager {
    void insert(Object node) throws Exception;

    void select(int num) throws Exception;

    void update(int num, Object node) throws Exception;

    void delete(int num) throws Exception;

    void show() throws Exception;
}
