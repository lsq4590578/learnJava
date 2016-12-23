
/**
 * Created by joanl on 12/15/2016.
 */
public class Source03 {
    public static void main(String[] agrs) {
        String[] wordlistone = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend",
                "web-based", "pervasive", "smart", "sixsigma", "critical-path", "dynamic"};

    String[] wordListTwo = {"empowered", "sticky",
            "value-added", "oriented", "centric", "distributed",
            "clustered", "branded","outside-the-box", "positioned",
            "networked", "focused", "leveraged", "aligned",
            "targeted", "shared", "cooperative", "accelerated"};
    String[] wordListThree = {"process", "tippingpoint",
            "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal", "space", "vision",
            "paradigm", "mission"};

        int onelenght=wordlistone.length;
        int twolenght=wordlistone.length;
        int threelenght=wordlistone.length;
        int rand1=(int)(Math.random()*onelenght);
        int rand2=(int)(Math.random()*twolenght);
        int rand3=(int)(Math.random()*onelenght);

        String phrease=wordlistone[rand1]+" "+wordListTwo[rand2]+" "+" "+wordListThree[rand3];
        System.out.println("会说话的机器人:"+phrease);
    }
}