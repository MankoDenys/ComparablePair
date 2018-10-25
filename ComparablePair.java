public class ComparablePair<T extends Comparable<? super T>> {
    private final T leftElem;
    private final T rightElem;

    public ComparablePair(T leftElem, T rightElem) {
        this.leftElem = leftElem;
        this.rightElem = rightElem;
    }

    public T getLeftElem() {
        return leftElem;
    }

    public T getRightElem() {
        return rightElem;
    }

    public T bigger() {
        T bigger = leftElem;
        if (leftElem.compareTo(rightElem)<0){
            bigger = leftElem;
        } else {
            bigger = rightElem;
        }
        return bigger;
    }

    public T smaller() {
        T smaller = leftElem;
        if (leftElem.compareTo(rightElem)>0) {
            smaller = leftElem;
        } else {
            smaller = rightElem;
        }
        return smaller;
    }

    @Override
    public String toString() {
        return "ComparablePair{" +
                "leftElem=" + leftElem +
                ", rightElem=" + rightElem +
                '}';
    }
}
