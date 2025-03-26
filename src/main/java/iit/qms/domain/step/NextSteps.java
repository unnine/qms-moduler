package iit.qms.domain.step;

import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class NextSteps implements Steps {

    private final Set<Step> nextSteps = new HashSet<>();


    @Override
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(nextSteps);
    }

    @Override
    public Iterator<Step> iterator() {
        return nextSteps.iterator();
    }

    @Override
    public void forEach(Consumer<? super Step> action) {
        nextSteps.forEach(action);
    }

    @Override
    public Spliterator<Step> spliterator() {
        return nextSteps.spliterator();
    }
}
