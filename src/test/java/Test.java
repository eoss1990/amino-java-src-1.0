import org.amino.ds.lockfree.LockFreeList;
import org.amino.ds.lockfree.LockFreeVector;

/**
 * Created by yangyu on 17/1/3.
 */
public class Test {
    public static void main(String[] args) {
        LockFreeVector lockFreeVector = new LockFreeVector();
        lockFreeVector.add("yangyu");

        LockFreeList lockFreeList = new LockFreeList();
        lockFreeList.add("yangyu");
        lockFreeList.add("linling");
        lockFreeList.add("lisan");
        lockFreeList.add("wangmazi");
    }
}
