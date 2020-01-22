import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class matcher_controller {
    public static boolean next = false;
    public Button next_prof;
    public Button last_prof;
    public Text name_age_me;

    public void onnext_prof(){
        next = true;
        setname_age_me("Leo","18");
    }
    public void setname_age_me(String name,String age){
        name_age_me.setText(name+","+age);
    }

    public static boolean isNext() {
        return next;
    }

    public static void setNext(boolean next) {
        matcher_controller.next = next;
    }
}
