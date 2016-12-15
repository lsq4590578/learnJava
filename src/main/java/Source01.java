import java.awt.*;

/**
 * Created by joanl on 12/14/2016.
 */
public class Source01 {
    public static void main(String[] agrs){
        Source01 source01=new Source01();
        source01.buildInvite();
    }
    public void buildInvite(){
        Frame frame=new Frame();
        Label label=new Label("This is my first code!");
        Button button1=new Button("Like it");
        Button button2=new Button("Don't Like it");
        Panel panel=new Panel();
        panel.add(label);
    }
}
