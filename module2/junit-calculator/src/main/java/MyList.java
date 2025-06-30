/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/21
 * Time: 09:06
 */
public interface MyList<E> extends Iterable<E> {
    void add(E e);

    void add(int index, E e);

    void clear();

    boolean contains(E e);

    E get(int index);

    int indexOf(E e);

    boolean isEmpty();

    int lastIndexOf(E e);

    boolean remove(E e);

    E remove(int index);

    E set(int index, E e);

    int size();
}
