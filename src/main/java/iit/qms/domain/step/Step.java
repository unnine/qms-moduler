package iit.qms.domain.step;

public interface Step {

    boolean hasNext();

    NextSteps getNextSteps();

    void enter();

    void finish();



//    enum CapaType {
//        REQUEST,
//        RECEIPT,
//        PLAN,
//        RESULT,
//        ASSESSING_EFFICACY,
//        END,
//    }
}
