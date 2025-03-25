package iit.qms.domain.module;

public interface Modular {

     <E extends Module> Process start(E e);

     void toNext(ProcessId id);

}
