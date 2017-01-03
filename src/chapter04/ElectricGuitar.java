package chapter04;

/**
 * Created by joanl on 12/23/2016.
 */
public class ElectricGuitar {
    String bland;
    int numOfPickups;
    Boolean isRockStarUseIt;
    String getBland(){
        return bland;
    }
    void setBland(String abland){
        bland=abland;
    }

int getNumOfPickups(){
    return numOfPickups;
}
void setNumOfPickups(int anumOfPickups){
    numOfPickups=anumOfPickups;
}

Boolean getIsRockStarUseIt(Boolean isRockStarUseIt){
    return isRockStarUseIt;
}

void setIsRockStarUseIt(Boolean aisRockStarUseIt){
    isRockStarUseIt=aisRockStarUseIt;
}
}
