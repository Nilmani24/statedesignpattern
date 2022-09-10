import com.Silent;
import com.StateChangeContext;

public class Main {

    public static void main(String[] args) {
        StateChangeContext stateChangeContext = new StateChangeContext();
        stateChangeContext.alert();
        stateChangeContext.setState(new Silent());
        stateChangeContext.alert();
    }
}
