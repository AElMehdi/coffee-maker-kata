package drinks;

public interface Drink {

    default int isStickToInt(boolean stick) {
        return stick ? 0 : 1;
    }
}
